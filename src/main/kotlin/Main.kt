fun main(){
val Rediet = Human("I love reading",22,46.5)
    Rediet.eat(2)
    Rediet.speak("I love chocolate.")
    var myUser = User("Rediet","Zerai","redietzeraihadderra@gmail.com","251927444862","silzer13")
  println(myUser.firstname)
    println(myUser.email)

}
    class Human(var name:String,var age:Int,var weight:Double) {
        fun eat(foodweight:Int) {
            println("I am eating $foodweight kgs of food.")
            weight += foodweight
        }
        fun speak(speech:String){
            println(speech)
        }
        fun birthday(){
           age+=1
        }

    }
data class User(var firstname:String,var lastname:String,var email:String,  var phonenumber:String,var password:String)




