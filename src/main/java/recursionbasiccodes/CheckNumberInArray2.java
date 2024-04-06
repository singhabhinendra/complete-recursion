package recursionbasiccodes;

public class CheckNumberInArray2 {
    public static void main(String[] args) {
        CheckNumberInArray checkNumberInArray = new CheckNumberInArray();
        System.out.println("checkNumberInArray.checkNumber(new int[]{1,2,3,4,5,6,7},7,4) = " + checkNumberInArray.checkNumber(new int[]{1, 2, 3, 4, 5, 6, 7}, 7, 90));
    }

    public boolean checkNumber(int[] array, int size, int target) {
        if (size == 0) {
            return false;
        } else if (array[0] == target) {
            return true;
        }
        return checkNumber(array, size, target);
    }
}
