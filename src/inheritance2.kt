fun main() {
var person=Person("Eva Hekima",35)
    person.eat()
    person.sleep()
    person.talk()

//    person farmer
    var farmer=Farmer("Robert Mwashigadi","Taita Taveta",45)
    farmer.land(50)
    farmer.eat()
    farmer.sleep()


//    person Banker
    var banker=Banker("KImberly Bree",30)
    banker.talk()
    banker.location("Kariobangi")
    banker.eat()

//    person Doctor
    var doc=Doctor("Kristina Bela",25)
    doc.sleep()
    doc.major("Nutritionist")
    doc.talk()

}
// public classes
open class Person(var name:String,var age:Int){
    open fun talk(){
        println("i love talking to little kids")
    }
    open fun eat(){
        println("Everyone loves eating some nice food")
    }
    open fun sleep(){
        println("We all love sleeping.")
    }

}
class Farmer( name:String,var region:String, age:Int):Person(name,age){
    fun land(has:Int){
        println("I have $has hectares of land")
    }
    override fun sleep(){
        println("Since i work alot during the day,i love to sleep early for me to have a good rest.")
    }

}
class Doctor(name:String,age:Int):Person(name,age){
    fun major(career:String){
        println("I am a $career.Most of my patients are malnourished children and diabetic people")
    }
    override fun talk(){
        println("Everytime small kids come into my clinic,i love singing with them some nursery rhymes")

    }
}
class Banker(name:String,age:Int):Person(name,age){
    fun location(loc:String){
        println("I work for Kenya Commercial Bank,$loc branch.")
    }
    override fun eat(){
        println("My favorite food is Ugali and Nyama Choma")

    }
}