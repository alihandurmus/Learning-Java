package com.company;

/**
 * customer type QServer.javada da kullanildi
 */
public class Customer {
    int id;
    double arrivalTime; // musteri gelis zamani-
    double waitingTime;
    double serviceTime;


    public Customer(int id,double arrivalTime,double waitingTime,double serviceTime){
     this.id = id;
     this.arrivalTime = arrivalTime;
     this.waitingTime= waitingTime;
     this.serviceTime = waitingTime + arrivalTime;

    }

    /*
     * yeni datafieldler ekleyebilirsiniz, mesela double removalTime; double
     * waitingTime;
     */
}
