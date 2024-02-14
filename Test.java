public class Test{
    public static void main(String [] args){
        int a = 5;
        int b = 7; 
        double c = 12.0; // you missed to initialize variable c!

        int total = (int) ((a + b) / c);
        System.out.println("Total : " + total);
    }
}