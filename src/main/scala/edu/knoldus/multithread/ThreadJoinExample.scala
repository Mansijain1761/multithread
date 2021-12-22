package edu.knoldus.multithread

class ThreadJoinExample extends Thread{

  override def run(): Unit = {
    for(i<- 0 to 3){
      println(i)
    }
  }
}
object MainObject3 {
  def main(args: Array[String]): Unit = {
    val threadObj = new ThreadJoinExample()
    threadObj.start()
    threadObj.join() //wait for current thread to die

    val threadObj1 = new ThreadJoinExample()
    threadObj1.start()
  }
}

