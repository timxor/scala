/*
--------------------------------------------------------
file: HelloWorld.scala
date: fri jan 31 2020
author: tim siwula
--------------------------------------------------------
path: /Users/tim.siwula/Desktop/projects/scala
--------------------------------------------------------
compile: scalac HelloWorld.scala
--------------------------------------------------------
execute: scala HelloWorld
--------------------------------------------------------
timbang: clear && scala HelloWorld.scala && scala HelloWorld
--------------------------------------------------------
*/

object HelloWorld {
  def main(args: Array[String]): Unit = {
    //this is my first Scala program
    println("Hello, world!")
    /*
     * declare variables
     */
    var firstName:String = "Peggy"
    val age:Int = 21
    println(firstName + ", is \n"+age+" years old")
    var sum = 10 +
    25
    def function1:Unit = {
      println("This is function1")
    }
    function1
  }
}
