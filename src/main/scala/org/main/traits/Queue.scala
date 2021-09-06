package org.main.traits


  trait Queue {
    var queue:List[Int] = List()
    var front:Int = -1
    var rear:Int = -1

    def enqueue(key:Int):Unit={
    }

    def dequeue():Unit={

      if (this.front == -1) {
        println("Queue is empty")
        return
      }

      queue = queue.drop(1)
      if(queue.isEmpty) this.front = -1
      else this.front = this.front + 1

      if (this.front == -1)
        this.rear = -1
    }


  }


