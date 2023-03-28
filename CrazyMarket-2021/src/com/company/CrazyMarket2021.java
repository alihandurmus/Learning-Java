package com.company;

import java.util.Random;

/**
 * market simulatoru, detaylar icin dokumana basvurunuz
 *
 */
public class CrazyMarket2021 {
    /** parameters for simulations */
    double lambda;
    /** arrival rate */
    double mu;
    /** service rate */
    int Wthreshold;
    /**
     * number of customers to be served. (simulation is done after Nth customer
     * served)
     */
    double N;

    public CrazyMarket2021(double lambda, double mu, int n,int Wthreshold) {
       this.lambda = lambda;
       this.mu = mu;
       this.N = n;
       this.Wthreshold = Wthreshold;
    }

    QServer qServer = new QServer();

    QLottery qLottery = new QLottery();


    /* variables for statistics */
    double meanWaitingTime = 0; // mean waiting time of SERVED customers
    double totalWaitingTime = 0; // total waiting time of SERVED customers
    double meanServiceTime = 0; // mean service time of SERVED customers
    double totalServiceTime = 0; // total service time of SERVED customers

    /**
     *
     */
    public void simulateMarket() {
        int i = 0;
        Customer customer;
        Random random = new Random();



        while (!qServer.isEmpty()&&i<N) {



            if (true/* cond? */) {// arrival event
                double u = random.nextDouble();
                double interArrivalTime = -Math.log(u)/(Double.parseDouble(String.valueOf(lambda)));
                qServer.queue[i+1].arrivalTime = qServer.queue[i].arrivalTime + interArrivalTime;double y = random.nextDouble();
                qServer.queue[i].serviceTime = -Math.log(y)/(Double.parseDouble(String.valueOf(mu)));
                qServer.queue[i].waitingTime = qServer.queue[i].arrivalTime + qServer.queue[i].serviceTime;
                qServer.enqueue(new Customer(i,qServer.queue[i].arrivalTime,qServer.queue[i].waitingTime,qServer.queue[i].serviceTime));
                System.out.println("arrival event");
            } else {
                if(qServer.queue[i].waitingTime>=Wthreshold)
                    qServer.dequeue();
                else
                    qLottery.add(new Customer(i,qServer.queue[i].arrivalTime,qServer.queue[i].waitingTime,qServer.queue[i].serviceTime) );
                  System.out.println("departure event");


            }
            totalWaitingTime+=qServer.queue[i].waitingTime;
            totalServiceTime+=qServer.queue[i].serviceTime;
            i++;
        }
        meanWaitingTime = totalWaitingTime/N;
        meanServiceTime = totalServiceTime/N;
    }

    public void printStatistics() {
        System.out.println("totalWaitingTime:" + totalWaitingTime);
        System.out.println("meanWaitingTime:" + meanWaitingTime);
        System.out.println("totalServiceTime:" + totalServiceTime);
        System.out.println("meanServiceTime:" + meanServiceTime);
    }

    public static void main(String[] args) {
        double lambda = Double.parseDouble(args[0]);
        double mu = Double.parseDouble(args[1]);
        int N = 1000;
        int Wthreshold=10;
        CrazyMarket2021 cm = new CrazyMarket2021(lambda, mu, N,Wthreshold);
        cm.simulateMarket();
        cm.printStatistics();

    }

}
