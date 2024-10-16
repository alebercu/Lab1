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
//
////    public int[] roundedGrades(int[] grades) {
////        return Arrays.stream(grades).map(this::howToRound).toArray();
////    }

    public int[] roundedGrades(int[] grades) {
        int[] roundedGradess = new int[grades.length];
            for (int i = 0; i < grades.length; i++) {
                roundedGradess[i] = howToRound(grades[i]);
            }
        return roundedGradess;

        }
//    public int maxRound(int[] grades) {
//        int[] rounded = roundedGrades(grades);
//        return Arrays.stream(rounded).max().getAsInt();
//    }

    public int maxRound(int[] grades) {
        int[] rounded = roundedGrades(grades);
        int max = rounded[0];

        for (int i = 1; i < rounded.length; i++) {
            if (rounded[i] > max) {
                max = rounded[i];
            }
        }
        return max;
    }
}



