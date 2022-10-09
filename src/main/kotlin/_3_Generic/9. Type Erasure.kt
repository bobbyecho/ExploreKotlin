// proses pengecekan generic pada saat compile time
// hirauin pengecekan saat runtime
// untuk lebih enak, coba compile ke bytecode dari baris kode dibawah
//
//
// siapapun, hati2 dalam mengkonversi generic, alias jangan seenaknya
// salah salah malah bisa terjadi error di runtime

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}
fun main() {
    val data1 = TypeErasure(1)
    val dataString: Int = data1.getData()
    println(dataString)

    val data2 = data1 as TypeErasure<String> // error konversi
    val dataInt = data2.getData()
    println(dataInt)
}