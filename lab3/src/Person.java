public class Person {
    String id;
    String gender;
    double tChol;
    double hdl;

    public Person(String id, String gender, double tChol, double hdl) {
        this.id = id;
        this.gender = gender;
        this.tChol = tChol;
        this.hdl = hdl;
    }

    public double getCholesterolRatio() {
        return tChol / hdl;
    }

    public boolean hasGoodTotalCholesterol() {
        if (tChol < 200)
            return true;
        else
            return false;
    }

    public boolean hasGoodHDL() {
        if (gender.equalsIgnoreCase("male")) {
            if (hdl >= 40)
                return true;
            else
                return false;


        } else if (hdl >= 45)
            return true;
        else
            return false;

    }

    public boolean hasGoodCholesterolRatio() {
        if (getCholesterolRatio() <= 4.5)
            return true;
        else
            return false;
    }

    public void printReport() {
        System.out.println(id + "'s Report:");
        if (hasGoodTotalCholesterol())
            System.out.println("Total Cholesterol : " + tChol + "(Good)");
        else
            System.out.println("Total Cholesterol : " + tChol + "(Bad)");
        if (hasGoodHDL())
            System.out.println("HDL : " + hdl + "(Good)");
        else
            System.out.println("HDL : " + hdl + "(Bad)");
        if (hasGoodCholesterolRatio())
            System.out.println("TC/HDL Ratio : " + getCholesterolRatio() + "(Good)");
        else
            System.out.println("TC/HDL Ratio : " + getCholesterolRatio() + "(bad)");
    }

    public static void main(String[] args) {
        Person person1 = new Person("0022212345", "mAlE", 156, 30);
        person1.printReport();
        Person person2 = new Person("2589164793", "fEmAlE", 345, 24);
        person2.printReport();
    }


}
