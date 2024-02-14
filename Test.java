public class Test{
    public static void main(String [] args){
        int a = 5;
        int b = 7; 
        double c = 12.0; // you missed to initialize variable c!

        // using array #updated by C;
        int [] arrNum = {a, b, (int) c};
        int sum = 0;

        for (int totalNum : arrNum){
            sum += totalNum;
        }
        System.out.println("Total with Array : " + sum);
        
        int total = (int) ((a + b) / c);
        System.out.println("Total : " + total);
    }
}