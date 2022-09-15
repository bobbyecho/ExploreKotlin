// using higher order function is very useful
// but, you have to be careful with it, higher order function can impact your application performance in runtime
// because java has to create the lambda object repeatedly
// if we use it not as much maybe we can't see anything wrong
// but if we use it on every code, you will feel the impact

// inline function is an ability to transform high order function to be an line function,
// means that code inside the inline function will be duplicated,
// so in the runtime the app has no need to create the lambda object over and over again

// to see whats going on, klik tools -> kotlin -> show bytecode -> decompile

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun helloWithNoInline(
    fName: () -> String,
    noinline lName: () -> String
): String {
    return "Hello ${fName()} ${lName()}"
}

fun main() {
    println(hello() { "Bobby" })
    println(hello { "Sarah" })
    print(helloWithNoInline({
        "Bobby"
    }, {
        "sarah"
    }))
}