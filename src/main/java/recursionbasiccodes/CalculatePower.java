package recursionbasiccodes;

public class CalculatePower {
    public static int getPower(int x,int number){
        if(number==0){
            return 1;
        }
        int partialAnswer=getPower(x,number-1);
        return x*partialAnswer;
    }
    public static void main(String[] args) {
        System.out.println("getPower(5,5) = " + getPower(5, 5));
    }
}
