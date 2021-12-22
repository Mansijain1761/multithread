package edu.knoldus.multithread

class CreateByExtendingRunnable extends Runnable{
  //overriding the function run of runnable interface/trait
  override def run(): Unit = {
    println("Thread is started and running fine.")
  }
}
object MainObject1{
  def main(args:Array[String]): Unit = {
    val classObject = new CreateByExtendingRunnable()
    val threadObj = new Thread(classObject)
    threadObj.start()  //creates a thread and call run i.e. function in which task is performed.
    //threadObj.start()  //shows IllegalThreadStateException
    //thread will run once but for second time, it will throw exception. It cannot be restarted you need to create new

    println(threadObj.setName("Demo Thread"))      //It sets thread's name.
    println(threadObj.getName)      //It returns thread's name. //by default numeric "thread-0"

    println(threadObj.getPriority)  //It returns thread's priority.
    // by default 5 (NORM_PRIORITY) we ll learn about it in next class
    println(threadObj.getState)     //for monitoring of the system state- returns the thread state
    println(threadObj.isAlive)      //tests if current thread is alive- it has been started, not yet died.
  }
}
