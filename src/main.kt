fun main(){
    hasVisitedCapital("Nigeria")
    hasvisitedCapital("Tanzania")
    hasvisitedCapital("Ghanian")

}
fun greetJane(name:String){
    if (name=="Jane"){
        println("Hello Jane")

         }  else {
    println("who are you")

     }
}
 //write a function that prints out odd or even depending on the number passed to it
fun specialnum(number:Int) {
     if (number % 2 == 0) {
         println("Even")
     } else {
         println("Odd")
     }
 }
fun hasvisitedCapital(nationality:String){
    if (nationality.equals("kenyan")) {

    }
    else if (nationality.equals("Tanzanian")) {
        println("have you ever been to Dodoma")
    }
    else if (nationality.equals("ugandan")) {
        println("have you ever been to Kampala")
    }
    else{
        println("Have you ever been to East Africa")
    }
}
fun hasVisitedCapital(nationality: String) {
    when(nationality){
        "kenyan","Tanzanian","Ugandan"-> println("have you ever been to nairobi")
        "Nigerian","Ghanian"-> println("have you ever been to dodoma")
        "Botswana","Zimbabwean,"-> println("have you ever been to kampala")
        else-> println("have you ever been to east africa")

    }
}
fun admitPerson(age:Int){
    when(age){
        1,2,3,4-> println("kindergerten")
        5,6,7,8,9,10,-> println("primary class")
    }

}
//create a function that takes in a function as a parameter for the password to be valid it must have
//does not take in passwors as the password
//has to have more than 8 characters
//fun PinPassWord(pin:String):Boolean{
//    if (pin.length>= in  8 &&pin.length<=16 &&{
//        println(true)
//   else



