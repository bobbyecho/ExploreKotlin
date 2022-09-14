package Basic.LearnPackage

fun sayHello(name: String): String {
    return "hello $name";
}

val sayGoodbye: (String) -> String = {
    "Goodbye, $it"
}