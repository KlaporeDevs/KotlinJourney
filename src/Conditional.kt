fun main(){
    print("Enter A Number: ")
    val input = readLine()
    if (input != null){
        val number = input.toIntOrNull()
        if (number != null){
            when{
                number < 0 -> println("The Number Is Negative")
                number == 0 -> println("The Number Is Zero")
                number > 0 -> println("The Number Is Positive")
            }
        }else{
            println("Thet's Not a Valid Number")
        }
    }else{
        println("No Input Received")
    }
}