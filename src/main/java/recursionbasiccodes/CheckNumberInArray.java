package recursionbasiccodes;

public class CheckNumberInArray {
    public boolean checkNumber(int[] array,int size,int x){
        if(size==0){
            return false;
        }
        if(array[size-1]==x){
            return true;
        }

        return checkNumber(array,size-1,x);
    }
    public static void main(String[] args) {
        CheckNumberInArray checkNumberInArray=new CheckNumberInArray();
        System.out.println(checkNumberInArray.checkNumber(new int[]{1, 2, 3, 4, 4, 5, 6, 7}, 8, 4));

    }
}
