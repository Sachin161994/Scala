

object StringKeFunctn {
  val greeting:String = "UPES University"
  println(greeting)
  val len = greeting.length()
  println(len)
  greeting.forall((a)=>a.isUpper)
  println(greeting.exists((a)=> a=='e'))
  println(greeting.contains('e'))
  println(greeting.map(_.toUpper))
  println(greeting.map(_.toLower))
  println(greeting)
  var greeting1:String = "UPES University"
  println(greeting1.map(_.toLower))
  println(greeting1)
  //greeting.
  
   def main(args: Array[String]) {     
      
   } 
}