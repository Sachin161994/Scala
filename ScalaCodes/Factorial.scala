

object Factorial {
  def factorial(a: Int): Int =
  {
    if(a==0){
      return 1
    }
    else
    {
      return(a*(factorial(a-1)))
    }
  }
  def main(args: Array[String]) { 
      println("Factorial is: " +factorial(5)); 
      
      
   } 
}