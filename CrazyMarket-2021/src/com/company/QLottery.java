package com.company;

import java.util.LinkedList;
import java.util.Random;

/**
 * TODO: indeksle cikarma islemenin ve ekleme isleminin verimli oldugu bir
 * implementasyon yapmaniz istenmektedir.
 */
public class QLottery {
     Customer customer;
     QServer qServer = new QServer();
     LinkedList<Customer> customers =  new LinkedList<>();
     Random random = new Random();
      private  int numberofcustomers;
    public void add(Customer customer){
        customers.add(customer);
        numberofcustomers++;
    }
    public void remove(int index){
        index = random.nextInt(qServer.back);
        customers.remove(qServer.queue[index]);
        numberofcustomers--;
    }







}