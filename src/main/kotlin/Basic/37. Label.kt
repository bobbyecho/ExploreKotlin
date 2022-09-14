fun main() {
     loopI@ for (i in 1..10) {
         loopJ@ for(j in 1..10) {
             println("$i * $j = ${i * j}")

//             if (j == 10) {
//                 break@loopI
//             }

             if (j == 5) {
                 continue@loopI
             }
         }
     }

    /**
     * return to label
     */
    fun test(name: String, param: (String) -> Unit): Unit = param(name)

    test("Bobby") test@{
        if (it == "") {
            return@test
        } else {
            println(it)
        }
    }
}