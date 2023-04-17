import java.util.Scanner;

public class perfect {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= 10; j++)
                if (num % i == 0) {
                    System.out.print(" value " + " " + i + " * " + j + " = " + (i * j) + " ");
                }
            System.out.println();
        }

    }

}
