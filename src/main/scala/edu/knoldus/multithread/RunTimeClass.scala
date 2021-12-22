package edu.knoldus.multithread

object RunTimeClass  extends App {

  //  Runtime.getRuntime.exec("shutdown -s -t 0") // use for shutdown system
  //  Runtime.getRuntime.exec("c:\\Windows\\System32\\shutdown -s -t 0") // to shut down windows
  //  Runtime.getRuntime.exec("shutdown -r -t 0") // restart system



  val r=Runtime.getRuntime
  println( "Available processor " + r.availableProcessors()) //  Will show available Processors
  println("Total Memory: "+r.totalMemory())
  println("Free Memory: "+r.freeMemory())


  for (_ <- 0 until 10000) {

  }
  println("After creating 10000 instance, Free Memory: "+r.freeMemory())
  System.gc()
  println("After gc(), Free Memory: "+r.freeMemory())
}
