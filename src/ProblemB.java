public class ProblemB {
    public static void printSequence(int n) {
        if(n < 1){
            System.out.print("");
            return;
        }
        if (n == 1) {
            System.out.print(1);
            return;
        }
        if (n == 2) {
            System.out.print("1 1");
            return;
        }

        System.out.print((n + 1) / 2 + " ");
        printSequence(n - 2);
        System.out.print(" " + (n + 1) / 2);
    }
}

