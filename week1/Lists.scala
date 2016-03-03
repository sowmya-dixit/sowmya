
import common._

object Lists extends App{
 
  println(Lists.max(List(1,3,2,8,5,9,4)))
  println(Lists.sum(List(1,3,2,5,3,6)))
  
  def sum(xs: List[Int]): Int = {
    def add(xs: List[Int],acc:Int):Int = 
      if(xs.isEmpty) acc
      else add(xs.tail,acc+xs.head)  
    add(xs,0) 
  }
  
  def max(xs: List[Int]): Int = 
  {
    def greater(xs:List[Int],max:Int):Int = {
      if(xs.isEmpty) max
      else {
        var h =
          if(max >= xs.head) max
          else xs.head
        greater(xs.tail,h)
      }
    }
    greater(xs,0)
  }
}

