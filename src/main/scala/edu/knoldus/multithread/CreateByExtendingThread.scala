package edu.knoldus.multithread

class CreateByExtendingThread extends Thread{
  //overriding the function run of inbuilt Thread class
  override def run(): Unit = {
    println("Thread is started and running fine.")
    for(i<- 0 to 10){
      println(i)
      //Thread.sleep(500)
    }
  }
}
  object MainObject{
    def main(args:Array[String]): Unit = {
      val threadObj = new CreateByExtendingThread()
      threadObj.start()

      val threadObj1 = new CreateByExtendingThread()
      threadObj1.start()
    }
  }
