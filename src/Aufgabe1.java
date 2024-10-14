import java.util.Arrays;

public class Aufgabe1 {
    public int[] failedGrades(int[] grades) {
        return Arrays.stream(grades).filter(grade -> grade <= 40).toArray();
    }

    public double averageGrade(int[] grades) {
        return (double) Arrays.stream(grades).sum() / grades.length;
    }

    private int howToRound(int grade) {
        if (grade > 37) {
            int diff = 5 - grade % 5;
            if (diff < 3) {
                grade += diff;
            }
        }
        return grade;
    }

    public int[] roundedGrades(int[] grades) {
        return Arrays.stream(grades).map(this::howToRound).toArray();
    }

    public int maxRound(int[] grades) {
        int[] rounded = roundedGrades(grades);
        return Arrays.stream(rounded).max().getAsInt();
    }

}
