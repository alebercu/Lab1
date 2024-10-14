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



}
