import java.util.ArrayList;

public class Task5 {

    static String number;
    static char storage [][][]  =

    {
        {
            {' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' '},
            {' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', ' ', ' ', '*', ' '},
            {' ', '*', ' ', ' ', ' ', ' ', ' ', '*', ' '},
            {' ', '*', ' ', ' ', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' '},
            {' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' '},
        },
        {
            {' ', ' ', '*', ' ', ' '},
            {' ', '*', '*', ' ', ' '},
            {' ', ' ', '*', ' ', ' '},
            {' ', ' ', '*', ' ', ' '},
            {' ', ' ', '*', ' ', ' '},
            {' ', ' ', '*', ' ', ' '},
            {' ', '*', '*', '*', ' '},
        },
        {
            {' ', ' ', '*', '*', '*', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', '*', ' ', ' ', '*', ' ', ' '},
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', ' ', '*', ' ', ' ', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
        },
        {
            {' ', '*', '*', '*', ' ', ' ', ' '},
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', ' ', '*', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', '*', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
        },
        {
            {' ', ' ', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', ' ', ' ', '*', '*', ' ', ' ', ' '},
            {' ', ' ', '*', ' ', '*', ' ', ' ', ' '},
            {' ', '*', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', '*', ' ', ' ', ' '},
        },
        {
            {' ', '*', '*', '*', ' '},
            {' ', '*', ' ', ' ', ' '},
            {' ', '*', ' ', ' ', ' '},
            {' ', '*', '*', '*', ' '},
            {' ', ' ', ' ', '*', ' '},
            {' ', ' ', ' ', '*', ' '},
            {' ', '*', '*', '*', ' '},
        },
        {
            {' ', ' ', ' ', '*', '*', ' ', ' '},
            {' ', ' ', '*', ' ', ' ', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', '*', '*', '*', ' ', ' '},
        },
        {
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', '*', ' ', ' '},
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', ' ', '*', ' ', ' ', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', ' ', ' '},
        },
        {
            {' ', ' ', '*', '*', '*', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', '*', '*', '*', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', '*', '*', '*', ' ', ' '},
        },
        {
            {' ', ' ', '*', '*', '*', '*', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', '*', ' '},
        }
    };


    public static void main(String[] args) {
        number = "0987543821";
        try {
            printNumber(number);
        } catch (TooLargeNumberException e) {
            System.err.println(e.getMessage());
        }

    }


    static void printNumber(String number) throws TooLargeNumberException {
        String[] dividedStrings = number.split("");
        int len = dividedStrings.length;

        int[] arr = new int[len];
        if (len > 20)
            throw new TooLargeNumberException("Too long number! Please enter a number with not more than 20 digits.");
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(dividedStrings[i]);
        }

        ArrayList<char[][]> result = new ArrayList<char[][]>();

        for (int i = 0; i < len; i++) {
            result.add(storage[arr[i]]);
        }

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < len; i++) {
                System.out.print(result.get(i)[j]);
            }
            System.out.println();
        }
    }
}

class TooLargeNumberException extends Exception {

    public TooLargeNumberException(String message) {
        super(message);
    }
}
