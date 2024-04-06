package recursionbasiccodes;

public class CheckNumberInArray3 {
    public static boolean checkNumber(int[] input, int x) {
        boolean ans;
        if (input[0] == x) return true;
        if (input.length == 1) return false;
        int[] arr = new int[input.length - 1];
        System.arraycopy(input, 1, arr, 0, input.length - 1);

        /*we can also use for loop  instead of arraycopy method like this-->
          for(int i=1;i<input.length;i++)
            arr[i-1]=input[i];
         */
        ans = checkNumber(arr, x);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println("checkNumber(new int[]{1,2,3,4,5,6,23},4) = " + checkNumber(new int[]{1, 2, 3, 4, 5, 6, 23}, 4));
    }
}
