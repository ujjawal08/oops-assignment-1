package org.main.double

import org.main.traits.Queue


class doubleQueue extends Queue{
  override def enqueue(key: Int): Unit ={
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1
      queue = queue ::: List(key*2) //add element to end/rear position of the queue
      return
    }
    queue = queue ::: List(key*2) //add element to end/rear position of the queue
    this.rear = queue.length - 1
  }
}