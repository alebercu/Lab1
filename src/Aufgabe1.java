import java.util.Arrays

public class Aufgabe1 {
    public int[] failedGrades(int[] grades){
        return Arrays.stream(grades).filter(grade -> grade <= 40).toArray();
    }
}
