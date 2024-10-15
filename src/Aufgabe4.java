import java.util.Arrays

public class Aufgabe4 {

    public int mostExpensive(int[] prices){
        return Arrays.stream(prices).max().getAsInt();
    }


}
