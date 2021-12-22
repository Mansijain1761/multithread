package edu.knoldus.multithread

import java.util.Calendar

class ThreadScheduler extends Runnable{
  override def run(): Unit = {
    println("priority lies btw 1-10, if higher priority thread has got a better chance of getting picked up by thread scheduler.")
  }
}
object MainObject4{
  def main(args:Array[String]): Unit = {
    val classObject = new ThreadScheduler()
    val threadObj1 = new Thread(classObject )
    threadObj1.setPriority(Thread.MIN_PRIORITY)//1
    val threadObj2 = new Thread(classObject)
    threadObj2.setPriority(Thread.MAX_PRIORITY)//10
    val threadObj3 = new Thread(classObject)
    threadObj3.setPriority(Thread.MIN_PRIORITY)//1
    Thread.NORM_PRIORITY//5


    println(threadObj1.getName)
    println(threadObj1.getPriority)  //It returns thread's priority.
    println(threadObj2.getName)
    println(threadObj2.getPriority)  //It returns thread's priority.
    println(threadObj3.getName)
    println(threadObj3.getPriority)

    println("Currently Executing The Thread : " + Thread.currentThread().getName)
    println("Priority of the main thread is : " + Thread.currentThread().getPriority)

    Thread.currentThread.setPriority(10)
    println("Priority of the main thread is : " + Thread.currentThread().getPriority)

    //Thread.currentThread().setPriority(17);
    // the one who enters first will be executed first if priority is same, we work of time of arrival
    threadObj2.start()

  }
}
