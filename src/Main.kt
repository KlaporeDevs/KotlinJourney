fun main() {
    val person = Person("Janrich", 19, "San Roque San Jacinto Pangasinan", "Male")
    person.sayHello()
}
class Person(val name: String, val age: Int, val address: String, val gender: String){
    fun sayHello(){
        println("Hello my Name Is $name and I'm $age Years Old. And I'm From $address. And I'm $gender")
    }
}