# KubeLang
KubeLang is an object oriented language that I'm designing which uses a type system based on duck typing. The main reason I'm making
KubeLang is that I think it would be interesting to have a compiled object-oriented duck-typed language. This is also an experiment
to see how well it will perform as well as hopefully my first completed language.

## Main features of KubeLang
- Duck typing
- Compiled instead of interpreted
- Inlined generics
- Kotlin-like syntax
  - Yes, I borrowed a lot of syntax from Kotlin
  - Simple Kotlin files will likely compile file, but they not act correctly due to the type system

HelloWorld in KubeLang would be something like this.

    module HelloWorld {
        import IO
        
        fun main(args: Array<String>) {
            println("Hello World!")
        }
    }

None of this is final and it might change at any point.