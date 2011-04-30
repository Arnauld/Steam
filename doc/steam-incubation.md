# Steam: the vaporous Incubation and rambling

Ramblings and ideas for Steam, attempt to write every thing here, relevant choices and specs
will be in a dedicated document.
Even if, this is mainly for syntax definition, to find a coherent syntax for all the cases and behaviors of steam,
some behaviors and implementation ideas may also been described.

## Preambule

* [On the design of programming languages - N. Wirth](http://www.cs.virginia.edu/~weimer/2007-615/reading/PLHistoryGoodDesign.PDF)
> * The language must be easy to learn and easy to use
> * It must be safe from misinterpretation and misuse
> * It must extensible without change of existing features
> ...

## Function and constant declaration

        const PI = 3.1415
        val UNIVERSE = 42

        func fib(n) = | 0 => 0
                      | 1 => 1
                      | _ => fib(n-1) + fib(n-2)

        def fib(n:Int) = ...
        let fib(n:Int) = ...

Notes a constant is no more than a function that return a fixed value,
thus one could use only one keyword for declaration: `def`

###Configuration variables (and parameters)

From Chapel (HPCS-darpa)

            module math
            ...
            config const n = 100
            ...

Starts the application

            steam -config settings.conf MyApp

or

            steam --math.n=2048 MyApp

settings.conf:

            math.n=1024
            database.name=FNZ4
            database.user=admin
            database.pass=4dm1n

## Any, Unit and void

Unit and Void extends from Any
According to this, a function that does not return any value, can be seen as a function that returns Void i.e. Any
thus

         def invoke[A](f:(A) => Any) = ...

can be called with any function

         invoke ( x:Int => 2*x )

         val sendAck: (PID)=>Void = { x:PID => PID!(user_id,:connected) }
         invoke sendAck

## Types

        
        typeOf 1 == int32
        typeOf "Zog" == string
        typeOf [] == array
        
        typeOf { x => 2*x } == fun[X => Y]
        typeOf { x:int32, y:int32 => 2.0*x*y } ==func[int32,int32 => float32]


## Pattern matching and its syntax

Goal: Have the same syntax for statement and function declaration.

Scala way:

        module fibonacci
        def fib(x:Int) = x match {
            case 0 => 0
            case 1 => 1
            case n => fib(n-1) + fib(n-2)
        }

        def reverse[A](x:List[A]) = x match {
            case Nil =>
            case H::Nil => H
            case H::T => reverse(T) :: H
        }


Erlang way:

        fib(0) -> 0 ;
        fib(1) -> 1 ;
        fib(N) when N > 0 -> fibo(N-1) + fibo(N-2)

        reverse(List) -> reverse(List, []).
        reverse([Element|Rest], Result) -> reverse(Rest, [Element|Result]);
        reverse([], Result) -> Result.

        def connect(H) ->
            case H of
               {host, Host} -> connect({host, Host, port, DefaultPort});
               {port, Port} -> connect({host, DefaultHost, port, Port});
               {host, Host, port, Port} ->
                    open_socket(Host, Port)
            end.

Use a mix with both "any type" approach of Erlang and scala pattern match

        def connect(x) = x match {
            case {:host, host, :port, port} => ...
            case {:port, port} =>
            case {:host, host} =>
        }


Alternate syntax (argument is provided "as is" in pattern matching)

        def fib {
            case 0 => 0
            case 1 => 1
            case n:Int when n>0 => fib(n-1) + fib(n-2)
        }


        def connect {
            case port:Int =>
                // parameters are not named, thus order matters
                connect(DEFAULT_HOST, port)
            case host:String =>
                // note the order does not matter, since parameters are named
                connect(port:DEFAULT_PORT, host:host)
            case (host:String, port:Int) =>
                ...
        }


Pattern matching on assignment

        val (host,port) = getConnectionParameters

        val (host, port, __, __, __, user) = getConnectionParameters

`__` if the `dev/null` placeholder

where as `_` is used as the `magic` or current token placeholder

## Atom

        :user
        'user // single quote

        to_atom("user") == :user

## Tuple and Record

Map could be a first level construct as in Lua.

        val params = {}
        params.host = "127.0.0.1"
        params.port = 8080

Tuple variation around atoms:

        (:host, "127.0.0.1", :port, 8080)
        {:host, "127.0.0.1", :port, 8080}

        { :host -> 127.0.0.1, :port -> 8080 }
        [ :host -> 127.0.0.1, :port -> 8080 ]

Tuple with parenthesis are coherent with function call

        ("127.0.0.1", 8080)

Records are similar to tuple, but the values are named and their orders don't matter.

        (host:"127.0.0.1", port:8080) == (port:8080, host:"127.0.0.1")

### Mask or view

Define a new tuple based on a view of another one (not the use of '__' for discarding unwanted
arguments in the ~pattern matching)

        val params =  ("127.0.0.1", 8080, "admin", "admin")
        val mask   = #($2, $1, __, __)
        val address = params >> mask

        assert address == (8080, "127.0.0.1")

## List

In all functional language, list construct take an important place, and have its personnal own syntax

        [1; 2; 3; 4; 5; 6] vs '(1 2 3 4 5 6)


        val list = ...
        list.to_parallel.forall { i =>

        }

        trait ParallelIterable[A] {
            def forall(c: (A) => Any)
        }

List (Stream) built-in type

        def decode (bytes:byte*) : int32* = bytes.foreach (0, { n,prev,i =>
            if(i%2==1)
              yield prev<<8 + n
            n // will be defined as prev in the next iteration
        })

        decode (0x05, 0xa2, 0x02, 0x03)


## Function

Function declaration should be similar to lambda expression

        type Serialier {
            def encode = function([byte]) => [byte]
        }
        s.encode = function(bytes:[byte]) { bytes.map { b => b-125 } }
        s.encode = { bytes:[byte] => bytes.map { b => b-125 } }

Function must be a first level construct

        type Serialier {
            def encode: (byte[]) => byte[]
        }

        val unsign = (bytes:byte[]) => bytes.map { b => b-125 }

        val serializer = Serializer.new
        serializer.encode = unsign


Javascript like

        serializer.encode = function (bytes) { ... }

        // same as function declaration but without name
        serializer.encode = def (bytes:byte[]) = { ... }

        // same as function declaration, name could be used for debugging purpose
        serializer.encode = def unsign(x:byte[]) = {}


Note: a function definition is itself a function, notation must be coherent.

        def reverse_arg(function):
            return (x,y => function(y, x))

        def reverse_arg[A](f:function(A,A)) = { x,y => f.apply(y,x) }
        

Mathematic notation `function name` : `input set` &rarr; `output set`

<pre>
        f:R &rarr;  R
          x &#8614; 2*x


        g:R&times;R &rarr; R
          x,y &#8614; x*y


        h:R &rarr;  R
          x &#8614; g(2,x)
</pre>

Note `h` &equiv; `f`


### Function and arguments

        // Named argument, the variable name stands for the argument name too
        
        def transferMoney(from:Account, to:Account, amount:Int, currency:Currency) = {
            ...
        }


        transferMoney(amount=500, currency=Euros, from=TheWorld, to=Arnauld)


Optional Argument *must* be used in conjonction of the argument name,
or only if the optional parameters are the last

        def transferMoney(from:Account, to:Account = Arnauld, amount:Int, when:Date = now, currency:Currency = Euros) = {
            ...
        }

Without arguments name is ok since currency and when are the last arguments, but the 'to' is then required

        transferMoney(TheWorld, Arnauld, 500)

With argument name

        transferMoney(amount=500, from=TheWorld)
        transferMoney(amount=500, currency=Dollar, from=TheWorld)

### Function and currying

### Pipeline

Idea: Push a value as current for next stage

         message.text => _.toLowerCase => _.capitalize

Note that stream processing could be chained too

         input => decodeBase64(_) => JSON.deserialize(_) => _.get(:user_id)

could be described in ~scala as,

         val decoded = new DecodeBase64(input)
         val json = JSON.deseralize(decoded)
         val userId = json.getAttribute("user_id")

Pipelining could be seen as a function composition

         f:x -> 2*x
         g:x -> 3+x
         h = f o g :x -> h(x) = f(g(x)) <=> h:x -> x => g(_) => f(_)

Sample type to work on

         type String {
           val chars:[Char]
           def toLowerCase:String = chars.map { _.toLowerCase }
           def capitalize:String = chars match {
                case _.isEmpty => ""
                case _ => chars(0).toUpperCase ++ chars.subArray(1)
           }
           def contains(sequence:[Char]) = chars.indexOf(sequence)>=0
         }

How to pipe instance method

         // define new function that delegates to the corresonding method
         def toLowerCase(s:String) -> x.toLowerCase
         def capitalize(s:String) -> x.capitalize
         def contains(s:String,seq:[Char]) -> s.contains(seq)

         // or have a builtin behavior that does it for us: retrieve instance method as function
         val f: function(String)=>String = String.instance_methods.toLowerCase
         val g = String.instance_methods.capitalize // type automatically inferred
         val c: function(String,[Char]) = String.instance_methods.contains

         val h = g o f
               = f >> g

         assertThat( h("bOOm") eq "Boom" )

Pipelining as a method chaining

         type String {
            ...
            def containsIgnoreCase(sequence:[Char]) = toLowerCase => contains(sequence)
         }


Copied from [LTU](http://lambda-the-ultimate.org/node/687#comment-42465)

> Even the mathematicians got it wrong, and we live with it. Everyone is used to seeing the syntax, y = f(x),
> which would have made much more sense if it had been written y = x : f, or if you want x -( f )-> y.
> *The reason is that composition reads most naturally from the left to the right, just as in reading.*
> Due to this, we see Haskell with it's composition operator (.), with things like: result = (f . g . h) x,
> which really is h applied first, then g, then f.
> With the alternative notation, it becomes obvious: x -(f g h)-> y, means the result of piping x through f,
> then g, then h, putting the result in y.
> F# and some Ocaml people have started doing this by defining |> and >> as (left) application and composition.


Copied from [ParallelExtensionsExtras Tour - #10 - Pipeline](http://blogs.msdn.com/b/pfxteam/archive/2010/04/14/9995613.aspx)

          var compressAndEncrypt =
              Pipeline.Create(rawChunk => Compress(rawChunk))
                      .Next(compressedChunk => Encrypt(compressedChunk));

          IEnumerable<byte[]> inputChunks= ...;
          IEnumerable<byte[]> results = compressAndEncrypt.Process(inputChunks);

## module and type

         module string

         // module level function
         def string_comparator = function(s1:String, s2:String) { s1.compareTo(s2) }

         // 'class' level definition
         type {
           val chars:[Char]
           def toLowerCase:string = new (chars.map { _.toLowerCase })
           def toUpperCase:string = new (chars.map { _.toUpperCase })
           def toString = "string:" + new String(chars)
         }


Idea is similar to fortress? and Erlang hot code swapping

         > print "Hello"
         Hello

         > load /lib/ext/string.steam
         module <string> loaded in temporary stage, module didn't existed yet
         > activate_module string
         module <string> has been activated and can be used

         > s1 = string.new { chars = ['H', 'e', 'y'] }
         string:Hey
         > s1.toLowerCase
         string:hey

         > s2 = string.new { chars = null }
         string:null
         > s2.toLowerCase
         error no method 'map' on null
         > s2.toUpperCase
         error no method 'map' on null


Fix the module definition and reload it in the same shell

         > load /lib/ext/string.steam
         module <string> loaded in temporary stage,  different module already exists
         > activate_module string
         locking access to module <string>
         replacing module <string>
         module <string> has been replaced and is now the current one

`s2` will use the new methods but it state is the same.
toLowerCase has not been fixed thus

         > s2.toLowerCase
         error no method 'map' on null

whereas with toUpperCase (note that `NULL` singleton is not returned, since the same instance is returned)

         > s2.toUpperCase
         string:null

Since the constructor (new method on module) has been modified, it also returns the singleton NULL also

         > s3 = string.new { chars = null }
         string:NULL


Modified module:

         module string

         // module level function
         def string_comparator = function(s1:String, s2:String) { s1.compareTo(s2) }

         // module level function, that return a new instance or the singleton
         val NULL = type {
            chars = null
            override def toString = "string:NULL"
         }

         def new (chars:[Char]) = chars match {
            case null => NULL
            case _chars => type { chars = _chars }
         }

         // 'class' level definition
         type {
           val chars:[Char]
           def toLowerCase:string = new (chars.map { _.toLowerCase })
           def toUpperCase:string = chars match {
                case null => this
                case _ => new (chars.map { _.toUpperCase })
           }
           def toString = "string:" + new String(chars)
         }


Note new is a method of the module thus one choose or not to return a new instance :)
TODO see `Ruby.new`

for the `null` singleton one has:

         module null

         val NULL = type {}
         def new = NULL

         type {
           def to_atom = :null

           def isTrue = false
           def isInstanceOf(type:Type) = false
           def foreach[+A](f:(A)=>Unit) = {} // no-op
           def find[+A](f:(A)=>Boolean) = None
           def asIterable[+A] = Array[A]()
         }

module `array` ...

## methods everywhere

         if(value) {
         }

is equivalent to

         if(value.isTrue) {
         }

and for example

         null {
           def isTrue = false
         }

## Visibility

         public / default / protected / private ...

similar to the friend (c++) keyword...

         protected[string,dto]
         protected[org.technbolts.*]
         protected[org.technbolts.**]


## Struct

`struct` enforces the notion of value object

From F# documentation

> Structures are value types, which means that they are stored directly on the stack or,
> when they are used as fields or array elements, inline in the parent type. Unlike
> classes and records, structures have pass-by-value semantics. This means that they are
> useful primarily for small aggregates of data that are accessed and copied frequently.

Sample struct

        type Point2D =
           struct
              val X: float
              val Y: float
              new(x: float, y: float) = { X = x; Y = y }
           end

## List and list comprehension

        val range0 = [1 .. 5]
        > [1, 2, 3, 4, 5]

        val range1 = [5 ..-1.. 1]
        > [5, 4, 3, 2, 1]

        val range2 = [5-i, i in [0..4]]
        > [5, 4, 3, 2, 1]


Not satisfying this imply `convert` support `yield`:

        val range3 = [1..5].convert { i => if(i%2==1) yield 2*i }
        > [2, 6, 10]

Similar to Mathematical syntax, `,` also acts as a guard separator.

        val range4 = { 2*i | i in [1..5], i%2==1 }
        > [2, 6, 10]

Haskell

        s = [ 2*x | x <- [0..], x^2 > 3 ]


Mathematic syntax [List comprehension](http://en.wikipedia.org/wiki/List_comprehension).


OddBy3 = { 3*x | x &isin; &Nu;, x%2 == 1 }


* `3*x` output function
* `x`variable
*  &isin; &Nu; input set
* `x%2==1` predicate function acting as a filter on members of the input set


<pre>
        &forall; (x,y,i) &isin; R&times;R&times;N, x > y > 1 &rArr; x*y+i &gt; 1
</pre>

`,` acts as a guard separator
`x > y > 1` is the guard


## Process

Similar to Erlang, a process must be a first level construct (BIF in erlang).
Based on MFA (module, function, argument) ?

        -module(spawn_process).
        -export([do_spawn/0, call/2]).

        call(Arg1, Arg2) ->
            io:format("~p ~p~n", [Arg1, Arg2]).

        do_spawn() ->
            %% Equivalent to SpawnProcess:call("hello", "process"),
            Pid = spawn(?MODULE, call, ["hello", "process"]),
            Pid.

        1> spawn_process:do_spawn().
          "hello" "process"
          <0.33.0>
        2>


Copied from [ParallelExtensionsExtras Tour - #13 - AsyncCall](http://blogs.msdn.com/b/pfxteam/archive/2010/04/27/10003149.aspx)

        val call1 = new AsyncCall<double>(d => call2.Post(d.ToString()));
        val call2 = new AsyncCall<string>(s => call3.Post(s.Length));
        val call3 = new AsyncCall<int>(   i => Console.WriteLine(i));

        call1.Post(1.1);
        call1.Post(2.2);
        call1.Post(3.3);
        call1.Post(4.4);

> Under the covers, AsyncCall<T> is implemented using Tasks, a fact evident from the AsyncCall<T>’s constructor:

        public AsyncCall(
            Action<T> actionHandler,
            int maxDegreeOfParallelism = 1,
            int maxItemsPerTask = Int32.MaxValue,
            TaskScheduler scheduler = null);

### Built-in parallel functions

        Pid = spawn { asynchronous job }

        // similar to invokeAll, scatter all jobs
        // fork...
        Pids = scatter {
          func1,
          func2,
          func3
        }

        Pids.join ...
        or
        Pids.onDone { => }
     


        // {
          for(i in D)
            yield { compute_part(i) }
        }

