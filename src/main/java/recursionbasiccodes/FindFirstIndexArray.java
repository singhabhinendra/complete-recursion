package recursionbasiccodes;
//making a class for finding the index of elements which exists in the numbers array and return its index.
public class FindFirstIndexArray {
    public static int findFirstIndex(int[] numbers,int target){
        if(numbers.length==0)
            return -1;
        if(numbers[0]==target){
            return 0;
        }
        int[] smallArray = new int[numbers.length-1];
        for (int index = 1; index < numbers.length; index++) { //we can also use copy array method here instead of using for loop.
            smallArray[index - 1] = numbers[index];
        }

        int fi=findFirstIndex(smallArray,target);
        if(fi==-1){
            return -1;
        }
        else{
            return fi+1;
        }

    }
    public static void main(String[] args) {
        System.out.println("findFirstIndex(new int[]{1,34,23,45,21,23,12},12) = " + findFirstIndex(new int[]{1, 34, 23, 45, 21, 23, 12}, 12));
    }
}
