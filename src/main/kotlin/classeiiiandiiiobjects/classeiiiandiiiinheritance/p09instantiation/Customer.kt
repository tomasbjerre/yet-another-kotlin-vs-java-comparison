package classeiiiandiiiobjects.classeiiiandiiiinheritance.p09instantiation

class Invoice()
class Customer(val customerName: String)

fun main(args: Array<String>) {
    var invoiceInstance = Invoice()
    var customerInstance = Customer("The Name")
}