package recursionbasiccodes;

public class SumOfNTerms {
    public static int sumn(int number) {
        if (number == 0) {
            return 0;
        }
        int smallOutput = sumn(number - 1);
        int output = number+smallOutput;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(STR."sumn(10) = \{sumn(10)}");
    }
}

