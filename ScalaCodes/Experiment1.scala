

object Experiment1 {
def add(a: Int, b: Int): Int = a + b

val cube = (x: Int) => x*x*x
val square = (x: Int) =>x*x
val sum_of_squares = (x: Int, y:Int) => add(square(x), square(y))
val sum_of_cubes = (x: Int, y:Int, z:Int) =>add(add(cube(x),cube(y)),cube(z))
def main(args: Array[String]) { 
      println("Sum is: " + add(5,3)); 
      println("Cube is: " +cube(5));
      println("Square is: " +square(5));
      println("Sum of Squares is: " +sum_of_squares(5,6));
      println("Sum of Cubes is: " +sum_of_cubes(1,2,3));
      
   } 
  
}