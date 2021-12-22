package edu.knoldus.multithread

class DaemonThread extends Thread{

  override def run(): Unit = {
    println(Thread.currentThread().getName)
    val result:String = if(Thread.currentThread().isDaemon) "daemon thread has lowest priority & depends on life of user thread" else "user thread "
    println(result)
    Thread.sleep(500)
  }
}
  object MainObject5 {
    def main(args: Array[String]): Unit = {
      val threadObj = new DaemonThread()
      val threadObj1 = new DaemonThread()
      val threadObj2 = new DaemonThread()

      threadObj1.setDaemon(true)

      threadObj.start() //user
      threadObj1.start() //deamon - so run at the end, when there is no user thread, all dies

      threadObj2.start() //user
     // threadObj2.setDaemon(true) //if once started you cannot set as daemon, it throws exeception
    }
  }
