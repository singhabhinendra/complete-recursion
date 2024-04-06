package recursionbasiccodes;

public class CheckArrayIsSorted {
    public static boolean isSorted(int[] array){
        if(array.length==1){
            return true;
        }
        else if(array[0]>array[1]){
            return false;
        }
        int[] smallArray=new int[array.length-1];
        for (int index = 1; index < array.length; index++) {
            smallArray[index-1]=array[index];
        }

        boolean isSmallSorted=isSorted(smallArray);
        return isSmallSorted;
    }
    public static void main(String[] args) {
        System.out.println("isSorted(new int[]{1,3,23,12,4,54,52}) = " + isSorted(new int[]{1, 3, 23, 12, 4, 54, 52}));
    }
}
