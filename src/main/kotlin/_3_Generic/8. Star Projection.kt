/**
 * permisalan, kita ingin menambahkan suatu parameter,
 * namun tidak peduli dengan isi data nya
 * yg penting hanyalah tipe datanya
 *
 * kasus disini adalah kita ingin mengambil size dari sebuah array,
 * tanpa peduli isi dari array tersebut
 */

// biasanya kita membuat seperti code dibawah, namun ada cara singkatnya

/**
 * fun <T>displayLength(array: Array<T>) {
*    println("Length array is ${array.size}")
*  }
 */

// yaitu seperti kode dibawah

fun displayLength(array: Array<*>) {
    println("Length array is ${array.size}")
}

fun main() {
    val array1 = arrayOf("1", 2, 3)
    val array2 = arrayOf(2, 1, 3)

    displayLength(array1)
    displayLength(array2)
}