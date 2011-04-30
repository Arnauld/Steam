Plumbing Language: a first draft
=============================================================

What are the steams without the streams, let's add the 'PLumb' a pipeline-oriented programming language.

#Use Case: Say Hello

        :say_hello
        [x:String] => :construct_sentence(x) => println(_)

        :construct_sentence
        [who:String]--+-[_=='Phileas'] => "Good travel! $who"
                      |
                      +-[_=='Watson'] ==> "Elementary, my dear $who!"
                      |
                      \- ===============> "Hello $who!"



#Use Case: Request Routing

        :extractor_num_client
        [m:Email, r:Request]
          => m.text
          => ~/ Num\. Client: ([a-z]{4}\-[a-z0-9]{6}) /
          => --[$1?]-> r['num_client']=$1

        :extractor_topic
        [m:Email, r:Request]
          => m.text
          => ~/ Topic: ([a-zA-Z]+) /
          => --[$1?]-> r['topic']=$1

* `:extractor_num_client`: defines a plumb fragment labelled with 'extractor_num_client'.
  This can be viewed as a helper method.

* `[m:Email, r:Request]`: both extractors take an email and request for parameters.
  With both of these variables, one starts the plumb `=>`.

* Then one retrieves the email's text and put it as current token of the stream `m.text => `.

 * ` ~/ Num\. Client: ([a-z]{4}\-[a-z0-9]{6})/ ` apply the regex on the current token and put
  the matcher and the corresponding groups (`$i` where `i` depends on the number of group
  defined in the regex) in the plumb (aka stream).

* If the regex is matching and the first group exists `--[$1?]->`, then its value is associated
  to the corresponding request field `r['topic'] = $1`.


        [m:Mbox, e:Email, r:Request]
          => m.name
          =>
           |
           +-['Support'] => r.locale => -+-['fr'] => r ~> Group("Support-FR")
           |                             \-['en'] => r ~> Group("Support-EN")
           |
           +-['Marketing'] => r ~> Group("Marketing")
           +-['WebForm'] ===> :extractor_num_client(e,r); :extractor_topic(e,r); r['topic']
           |               => -+-['bug-api'] => r ~> Group("Engineering")
           |                   \------------ => r ~> Account("Laurent")
           |
           +-[_~='*EN'] => r ~> Group("Support-EN")
           +-[_~='*ES'] => r ~> Account("Carmen")
           \- => r ~> Group("Support-FR")


* `['Support']` is a shortcut for `[_=='Support']` (where `_` is a placeholder for the
  current token) and since `m.name is defined as the current token it is a shortcut
  for ` [m.name=='Support'] `

* `:extractor_num_client(e,r); :extractor_topic(e,r); r['topic']` sequentially call the
  two helper methods defined previously, and defines the current token
  to be the value of the field `topic`. Sequential statements are separated with `;`

* `[_~='*EN']` is glob construct to check if the current token (`m.name`) is matching the
  the glob expression `*EN` that is if the mailbox name ends with 'EN'.

#Use Case: Request Routing ex. 2


        [e:Email]
          => e.subject
          => ~/ \[(\d+)\-(\d+))\] / /* extract ticket number */
          => -+-[$1?] => :load_request($1) => -+-[?]---------------------°- => _~>addEmail(e)
              |                                |                         |
              |                                |                         |
              |                                |                         |
              |                                |                         |
              °--------------------------------°- => :create_request(e) -°


# Incumbating

## stream semantic

How to express such flow:

         -x-------------------------->
           \__[x>PI]__(x-TWO_PI)__/

         -[:x>PI]--(x-TWO_PI)------>
                  \___________/


`:varname` allow the naming of the iterating value for referencing afterward

         =/ :x>PI / x-TWO_PI /=

         %<
         %=
         ->
         #
         ~>
         ->
         <-
         >>
         <<


         (+) 
         (/)
         ::
         //
         ||
         <,,>
         <::>
         Cardinality: ? + *
         Unicity: !

Listing: Say hello

         say_hello =
          ()           ~> say_hello("Fileas")
          (who:String) ~>
             | who=="Fileas" ~> "Good travel! $who"
             | who=="Watson" ~> "Elementary, my dear $who!"
             \ "Hello $who!"
             => println(_)

Listing: Process byte stream

         process(content) =
             content.toBytes                                  /* in: String,         out: StreamOut[Byte] */
             => /* bytes stream */ decodeB64(_)               /* in: StreamIn[Byte], out: StreamOut[Byte] */
             => /* bytes stream */ jsonDecode(_)              /* in: StreamIn[Byte], out: StreamOut[JsonObject] */
             => /* user entity */  (_.first_name,_.last_name) /* in: StreamIn[JsonObject], out: StreamOut[T2[String,String]] */
             => !(fn,ln) ~> fn.capitalize + " " + ln          /* in: StreamIn[String],     out: StreamOut[String] */
               /* '!' only one user should be processed, inform the stream we're done
                * Any subsequent input must be discarded
                */


# Resources

* [Glob syntax](http://en.wikipedia.org/wiki/Glob_(programming))
