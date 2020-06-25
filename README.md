# KubeLang
Kube is a strong statically typed object oriented programming language which supports duck typing through interfaces.
Kube does not support inheritance since interfaces, delegation, union types, and intersection types provide the same
functionality with more capabilities.

## Main features of Kube
- Duck typing
- Compiled instead of interpreted
- Inlined generics
- Kotlin-like syntax
- Union and intersection types

Currently, HelloWorld in Kube would look like this.

    module HelloWorld {
        import IO
        
        fun main(args: Array<String>) {
            println("Hello World!")
        }
    }

None of this is final and it might change at any point.