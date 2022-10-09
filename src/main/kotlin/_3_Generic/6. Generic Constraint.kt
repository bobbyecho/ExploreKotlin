// kita bisa memberitahukan tipe yg boleh adalah employee atau beserta kelas turunannya

class CompanyGeneric<T: Employee>(val employee: T)

class CompanyMultipleGeneric<T>(val employee: T) where T: Employee, T: CanSayHello

fun main() {
    val manager = CompanyGeneric(Manager())
    val employee = CompanyGeneric(Employee())
//    val string = CompanyGeneric("string") // error

//    val managerMultipleGeneric = CompanyMultipleGeneric(manager())  // error, manager doesn't implement CanSayHello
    val viceManagerMultipleGeneric = CompanyMultipleGeneric(ViceManager()) // success, because viceManager implements CanSayHello
}