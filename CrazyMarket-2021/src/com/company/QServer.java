package com.company;

/**
 * maintains a customer queue in a circular array TODO: methodlari implement
 * ediniz, fazla method-field ekleyebilirsiniz.
 */
public class QServer {

    Customer[] queue;

    int front = 0, back = 0; // head&tail of queue


    /**
     * enqueue a customer to queue
     */
    boolean enqueue(Customer customer){
        QServer qServer = new QServer();
       if(qServer.isEmpty()){
           back = back + 1;
           queue[back] = customer;


           return true;
       }
       else
           System.out.println("Queue Dolu!!");
           return false;
    }

    /**
     * dequeue a customer from queue
     *
     */
    Customer dequeue() {
        QServer qServer = new QServer();
      if(qServer.isEmpty()) {
          System.out.println("Queue boş!!");
          return null;
      }
      else
      {
            front = (front + 1) % qServer.size();
            return queue[back] = null;
        }




    }

    /**
     * peek a customer in queue
     *
     */
    Customer peek() {
        QServer qServer = new QServer();
        return qServer.queue[front+1];
    }

    /** kuruktaki toplam eleman sayisi */
    int size() {
        return back-front;
    }

    boolean isEmpty() {
      if(queue[back] == null){
          return true;

      }
      else
          return false;
    }
}
