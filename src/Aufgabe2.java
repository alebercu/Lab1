import java.util.Arrays;

public class Aufgabe2 {

    public int getMax(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }

    public int getMin(int[] array){
        return Arrays.stream(array).min().getAsInt();
    }

    public int maxSum(int[] array){
        return Arrays.stream(array).sum() - getMin(array);
    }

    public int minSum(int[] array){
        return Arrays.stream(array).sum() - getMax(array);
    }

}
