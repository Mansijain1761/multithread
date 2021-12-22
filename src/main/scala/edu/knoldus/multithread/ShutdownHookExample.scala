package edu.knoldus.multithread

class ShutdownHookExample extends Thread{

  override def run(): Unit = {
    println("shut down hook task completed.. It is to add some code that has to be run when JVM is shutting down")
  }
}
object MainObject6 {
  def main(args: Array[String]): Unit = {
    val classObject = new ShutdownHookExample

    val printingHook = new Thread(()=> println("In the middle of a shutdown : It is to perform cleanup resources or save the state"))
    Runtime.getRuntime.addShutdownHook(printingHook)
    Runtime.getRuntime.addShutdownHook(classObject)
    // subclass of Object class, can provide access to various information about the environment in which a program is running.
    //It interacts with runtime environment

    println("Program begins :  main sleeping")

    try
    {
      Thread.sleep(3000)
      //Runtime.getRuntime.removeShutdownHook(classObject)
      //println("The program is terminating.")
    }
      // Catch clause
    catch
    {
      // Case statement
      case _: Exception =>
      // Display this if exception is found
        println("Exception occurs")
    }



  }

}
