package org.example.classes

class Item() {
    var name: String = ""
    var price: Double = 0.0
        get() {
            println("In getter")
            return field
        }
        set(value) {
            println("In setter")
            if (value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("value can't be more than 0.0")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }

}

fun main() {
    val item = Item("IPhone")
    println(item.name)
    println(item)
    item.price = 10.0
    println(item.price)
}