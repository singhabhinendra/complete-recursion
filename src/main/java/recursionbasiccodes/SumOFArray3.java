package recursionbasiccodes;
import java.lang.String;
public class SumOFArray3 {
    public static int arraySum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index] + arraySum(arr, index + 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("arraySum(new int[] {1,2,33,4,4,5},0) = " + arraySum(new int[]{1, 2, 33, 4, 4, 5}, 0));


    }
}
