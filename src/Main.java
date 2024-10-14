import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Aufgabe 1");
        Aufgabe1 a1 = new Aufgabe1();
        System.out.println(Arrays.toString(a1.failedGrades(new int[]{29,37,38,41,84,67})));
        System.out.printf("%.2f\n", a1.averageGrade(new int[]{29,37,38,41,84,67}));
        System.out.println(Arrays.toString(a1.roundedGrades(new int[]{29,37,38,41,84,67})));
        System.out.println(a1.maxRound (new int[]{29,37,38,41,84,67}));

        System.out.println("\nAufgabe 2");
        Aufgabe2 a2 = new Aufgabe2();
        System.out.println(a2.getMax(new int[]{4,8,3,10,17}));
        System.out.println(a2.getMin(new int[]{4,8,3,10,17}));
        System.out.println(a2.maxSum(new int[]{4,8,3,10,17}));
        System.out.println(a2.minSum(new int[]{4,8,3,10,17}));




        }
}