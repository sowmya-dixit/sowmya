import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println()
    println("Checking Parantheses Balancing")
    var list1 = "())("
    if(balance(list1.toList)) println(list1 + " is balancing")
    else println(list1 + " is not balancing")
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
     if (c == 0 || c == r) 1
     else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def check(chars:List[Char],open:Int):Boolean={
      if(chars.isEmpty) open == 0
      else {
        var num = {
          if(chars.head == '(') open+1
          else if(chars.head == ')') open-1
          else open 
        }
        if(num>=0) check(chars.tail,num) 
        else false
      }
    }
    check(chars,0)
  }
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}

