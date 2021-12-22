package edu.knoldus.multithread
import java.util.concurrent.Executors

  class ThreadPoolExample(name: String) extends Thread{

    override def run(): Unit = {
      println(name + "Started")
      //    for(i <-  1 to 5) {
      //      println( "Print Line " + name)
      //    }

      println(name + "ended")
    }
  }

  object ThreadPoolTest extends App{

    //  var task1 = new ThreadPoolTest()
    //  var task2= new ThreadPoolTest()
    //  var task3 = new ThreadPoolTest()

    //  var executorSingle = Executors.newSingleThreadExecutor()
    //  executorSingle.execute(task1)
    //  executorSingle.execute(task2)
    //  executorSingle.execute(task3)

    var executorFix = Executors.newCachedThreadPool()

    for(i <- 1 to 20){

      val fixTask = new ThreadPoolExample(i.toString + " Thread")
      executorFix.execute(fixTask)

    }
  }
