package recursionbasiccodes;

public class checkArrayIsSorted3 {
    public static boolean arraySortedOrNot(int[] A, int N) {
        // Write your code here.
        if (N == 1) {
            return true;
        } else if (A[0] > A[1]) {
            return false;
        }
        int[] smallArray = new int[N - 1];
        System.arraycopy(A, 1, smallArray, 0, N - 1);
        /*
        * for (int index = 1; index < N; index++) {
            smallArray[index - 1] = A[index];
        }
*/

        return arraySortedOrNot(smallArray, N - 1);
    }

    public static void main(String[] args) {
        System.out.println("arraySortedOrNot(new int[]{1,34,45,56,76,78},6) = " + arraySortedOrNot(new int[]{1, 34, 45, 56, 76, 78}, 6));
    }
}