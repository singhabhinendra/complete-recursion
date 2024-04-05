package recursionbasiccodes;

public class SumOfArray2 {
    public static int arraySum(int[] numbers , int length){
        if(length==0) {
            return 0;
        }
        return numbers[length - 1] + arraySum(numbers, length - 1);
    }

    public static void main(String[] args) {
        System.out.println("arraySum(new int[] {1,2,3,4,5,},5) = " + arraySum(new int[]{1, 2, 3, 4, 5,}, 5));

    }
}
