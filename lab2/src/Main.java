import java.util.Scanner;

class Quadratic {
    double a;
    double b;
    double c;
    double x1;
    double x2;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double dis = getDiscriminant();
        x1 = (-b + Math.sqrt(dis)) / (2 * a);
        x2 = (-b - Math.sqrt(dis)) / (2 * a);
        setX1(x1);
        setX2(x2);

    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getDiscriminant() {

        return (b * b) - (4 * a * c);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        Quadratic quad = new Quadratic(a, b, c);


        System.out.println("x1: " + quad.getX1());
        System.out.println("x2: " + quad.getX2());

    }


}
