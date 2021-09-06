package org.main.classes

import org.main.traits.Queue

class DoubleQueue extends Queue{
  override def enqueue(key: Int): Unit ={
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1
      queue = queue ::: List(key*2)
      return
    }
    queue = queue ::: List(key*2)
    this.rear = queue.length - 1
  }
}