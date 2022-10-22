import java.util.Scanner;

public class QuizAlprog {
    static void FibonacciTest(int Answer) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < Answer) {
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }


    public static void main(String args[]) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Input Number: ");
        int Hasil = in.nextInt();
        FibonacciTest(Hasil);
    }
}
