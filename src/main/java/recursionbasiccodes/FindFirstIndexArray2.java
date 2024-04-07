package recursionbasiccodes;

public class FindFirstIndexArray2 {
    public static int findFirstIndex(int[] numbers,int target,int startIndex){
        if(startIndex==numbers.length){
            return -1;
        }
        if(numbers[startIndex]==target){
            return startIndex;
        }
        int k=findFirstIndex(numbers,target,startIndex+1);
        return k;
    }
    public static void main(String[] args) {
        System.out.println("findFirstIndex(new int[] {1,23,43,23,21,45},43,0) = " + findFirstIndex(new int[]{1, 23, 43, 23, 21, 45}, 43, 0));
    }
}
