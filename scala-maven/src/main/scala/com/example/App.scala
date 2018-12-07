package com.example

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))

    val javaClass = new MyJavaClass()
    println(javaClass.callScalaClass("the Scala app"))
  }

}
