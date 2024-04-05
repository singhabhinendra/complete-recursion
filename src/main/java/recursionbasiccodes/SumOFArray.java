package recursionbasiccodes;

public class SumOFArray {
    public static int sum(int input[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(input.length==1)
            return input[0];

        int arr[]=new int[input.length-1];

        for(int i=1;i<input.length;i++)
            arr[i-1]=input[i];

        return (input[0]+sum(arr));

    }

    public static void main(String[] args) {
        System.out.println("sum(new int[]{1,2,3,4,4,5}) = " + sum(new int[]{1, 2, 3, 4, 4, 5}));
    }
}
