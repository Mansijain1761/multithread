package edu.knoldus.multithread


class SynchronizationExample extends Thread{

  var count : Int  = 0
  //Without Sync

  override def run(): Unit = {
    for (_ <- 0 until 50) {
      count = count + 1
    }
  }
}

object Synchronization  extends App {

  // Synchronization : when you want to allow one thread to access shared document
  //Types 1.Mutual Exclusive ----=- method , block  , static
  // type 2. Inter Thread Communication

  val th1 = new SynchronizationExample()
  val th2 = new SynchronizationExample()
  val th3 = new SynchronizationExample()

  th1.start()
  //  th1.join()
  println(th1.count)
  th2.start()
  th3.start()
}

