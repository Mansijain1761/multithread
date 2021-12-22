package edu.knoldus.multithread

class ThreadSleepExample extends Runnable{

  override def run(): Unit = {
    for(i<- 0 to 3){
      println(i)
      Thread.sleep(500)   //sleep executing thread for the specified milliseconds. here 500 is ms
    }
  }
}
  object MainObject2 {
    def main(args: Array[String]): Unit = {
      val classObject = new ThreadSleepExample()
      val threadObj = new Thread(classObject)
      threadObj.start()
      val threadObj1 = new Thread(classObject)
      threadObj1.start()
    }
  }
