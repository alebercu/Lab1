import java.util.Arrays;

public class Aufgabe3 {
    public int[] sumBigNumbers(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;

        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }

        return result;
    }


    public static int[] diffBigNumbers(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        int startIndex = 0;
        while (startIndex < result.length - 1 && result[startIndex] == 0) {
            startIndex++;
        }
        return Arrays.copyOfRange(result, startIndex, result.length);
    }

    public int[] mulBigNumbers(int[] num1, int x) {
            int n = num1.length;
            int[] result = new int[n + 1];
            int carry = 0;

            for (int i = n - 1; i >= 0; i--) {
                int product = num1[i] * x + carry;
                result[i + 1] = product % 10;
                carry = product / 10;
            }

            result[0] = carry;

            if (result[0] == 0) {
                return Arrays.copyOfRange(result, 1, result.length);
            }

            return result;
        }

    int[] divide(int[] num1, int value) {
        int[] result = new int[num1.length];
        int flag = 0;
        for (int i=0; i<num1.length; i++) {
            result[i] = (flag * 10 + num1[i]) / value;
            flag = (flag + 10 + num1[i]) % value;
        }
        return result;
    }

}



