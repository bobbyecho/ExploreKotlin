package _1_Basic.LearnPackage

fun sayHello(name: String): String {
    return "hello $name";
}

val sayGoodbye: (String) -> String = {
    "Goodbye, $it"
}