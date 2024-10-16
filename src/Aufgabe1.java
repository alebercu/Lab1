import java.util.Arrays;

public class Aufgabe1 {
//    public int[] failedGrades(int[] grades) {
//        return Arrays.stream(grades).filter(grade -> grade <= 40).toArray();
//    }

    public int[] failedGrades(int[] grades) {
        int[] temp = new int[grades.length];
        int k = 0;
        for(int grade: grades) {
            if( grade <= 40){
                temp[k] = grade;
                k++;
            }
        }
        int[] fGrades = new int[k];
        System.arraycopy(temp, 0, fGrades, 0, k);

        return fGrades;
    }

//    public double averageGrade(int[] grades) {
//        return (double) Arrays.stream(grades).sum() / grades.length;
//    }

    public double averageGrade(int[] grades) {
        int sum = 0;
        int k = 0;
        for(int grade: grades) {
            sum += grade;
            k++;
        }
        return (double)sum / k;
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
