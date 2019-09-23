
import scala.collection.mutable.ArrayBuffer;
object ArrayS {

  var name = ArrayBuffer(1,2,3,4)
 //for(x<-name){
  // x=Console.readInt();  }
  name.insert(4, 6)
  name.remove(3)
  println(name.contains(6))
  var name2 = ArrayBuffer(1,2,3,4).sum
  var name3  = ArrayBuffer(1,2,3,4).max
  for( x<-name){
    println(x);

  }
  def main(args: Array[String]) { 
      
      
   } 
    
  
}