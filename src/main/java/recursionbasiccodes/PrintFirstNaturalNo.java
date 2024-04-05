package recursionbasiccodes;

public class PrintFirstNaturalNo {


    public static void firstnatural(int number){
        if(number==0){
            return;
        }

        firstnatural(number-1);
        System.out.println( number);
    }
    public static void main(String[] args) {
        firstnatural(10);
    }

}
