package recursionbasiccodes;

public class FibonacciNumber {
    public static int getFibonacciSeries(int number){
        if(number==1||number==2){
            return 1;

        }
        int fib1=getFibonacciSeries(number-1);
        int fib2=getFibonacciSeries(number-2);
        return fib1+fib2;
    }
    public static void main(String[] args) {
        System.out.println("getFibonacciSeries(4) = " + getFibonacciSeries(10));
    }
}
