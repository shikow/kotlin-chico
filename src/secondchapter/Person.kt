package secondchapter

class Person(val name:String, var isMarried:Boolean)

fun main(args:Array<String>) {
    val person = Person("dudeira", false)
    println(person.name)
    println(person.isMarried)
}