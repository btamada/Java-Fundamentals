/**
 *  Write a function that converts a string to an integer.
 *
 */
public class Test {

    public static void main(String... args) {
        System.out.println(stringToInteger("1234567890"));
    }

    static int stringToInteger(String input) {
        char[] inputChar = input.toCharArray();
        int myInt = 0;
        int tmpInt = 0;
        int counter = inputChar.length - 1;

        for(int i = 0; i < inputChar.length; ++i) {
            tmpInt = inputChar[i] - '0';
            myInt += (int)Math.pow(10,counter--) * tmpInt;
        }
        return myInt;
    }

}
