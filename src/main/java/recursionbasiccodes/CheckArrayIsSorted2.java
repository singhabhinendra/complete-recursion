package recursionbasiccodes;

public class CheckArrayIsSorted2 {
    public static boolean checkArray(int[] array,int index){
        if(index==array.length-1){
            return true;
        }
        if(array[index]>array[index+1]){
            return false;
        }
        boolean isSmallArraySorted=checkArray(array,index+1);
        return isSmallArraySorted;
    }
    public static void main(String[] args) {
        System.out.println("checkArray(new int[]{1,5,2,4,3,4},0) = " + checkArray(new int[]{1, 2, 3, 4}, 0));
    }
}
