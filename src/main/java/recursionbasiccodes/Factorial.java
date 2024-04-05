package recursionbasiccodes;

public class Factorial {
    public static int fact(int number){
        if(number==0){
            return 1;
        }
        int smallOutput=fact(number-1);
        int output=number*smallOutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
