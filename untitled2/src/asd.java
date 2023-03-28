public class asd {
    public static void main(String[] args) {
        try{
            int x= 5/0;

        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }catch (Exception e){
            System.out.println("Expection");
        }
    }
}
