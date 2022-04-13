fun main() {
    var banker = Banker("Ali",23)
    var doctor = Doctor("James",23)
    var farmer = Farmer("Naima",27)
    banker.introduction()
    doctor.introduction()
    farmer.introduction()
    banker.talk("Hello there")
    doctor.talk("come here")
    farmer.cultivateLand()
    println(banker.countMoney(arrayOf(1,2,3,4)))
    println(doctor.treatPatient("Shana", "Malaria"))

}

//Overide
open class Person(var name:String,var age:Int){
    fun talk(words:String){
        println(words)
    }

    open fun eat(){

        println("Yum")
    }

    fun sleep(){
        println("ZZZZZZZZZZZZ")
    }
   open fun introduction(){
        println("Hi my name is $name and my age is $age")
    }
}

class Banker(name:String, age:Int):Person(name,age){


    fun countMoney(notes: Array<Int>):Int{
        var sum = 0
        notes.forEach { note ->
            sum+=note
        }
        return sum
    }
}

class Doctor(name: String, age: Int):Person(name, age){

    fun treatPatient(patient:String, disease:String){
        println("Dr. $name Treating $patient for $disease")
    }

    override fun introduction() {
        println("Hello am Dr. $name")
    }
}

class Farmer(name: String, age:Int):Person(name, age){

    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
        super.eat()
        println("I am eating all the food I have grown")
    }
}