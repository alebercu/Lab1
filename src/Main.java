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

        Aufgabe3 a3 = new Aufgabe3();
        System.out.println("\n\nAufgabe3");
        int[] array1 = new int[]{1, 3, 0,0,0,0,0,0,0};
            int[] array2 = new int[] {8,7,0,0,0,0,0,0,0};
            System.out.println(Arrays.toString(a3.sumBigNumbers(array1, array2)));
            array1 = new int []{8, 3, 0,0,0,0,0,0,0};
            array2 = new int[]{5, 4,0,0,0,0,0,0,0};
            System.out.println(Arrays. toString(a3.diffBigNumbers(array1, array2)));
            array1 = new int[] {2,3,6,0,0,0,0,0,0};
            int x = 2;
            System.out.println(Arrays. toString(a3.mulBigNumbers(array1, x)));
            System.out.println(Arrays. toString(a3. divide(array1, x)));


            System.out.println("\nAufgabe 4");
            Aufgabe4 a4 = new Aufgabe4();
            System.out.println(a4.cheapest(new int[]{40, 35, 70, 15, 45}));
            System.out.println(a4.mostExpensive(new int[]{15, 20, 10, 35}, new int[]{20, 15, 40, 15}));
            System.out.println(a4.mostExpensiveInBudget(new int[]{15, 45, 20}, 30));
            System.out.println(a4.maxToBuy(new int[]{40, 50, 60}, new int[]{8, 12}, 60));


        }
}