package recursionbasiccodes;

public class NoOfDigits {
    public static int countDigits(int number){
        if (number==0) return 0;
        int smallAns = countDigits(number / 10);
        return smallAns + 1;
    }
    public static void main(String[] args) {
        System.out.println("countDigits(23434) = " + countDigits(23434));
    }
}
