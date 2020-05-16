import java.util.Random;
import java.util.Scanner;
class exer3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n=0;

        System.out.println("Digite a dimensão da matriz");
        n=scanner.nextInt();

        int a[][] = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = random.nextInt(100);
                System.out.print(a[i][k] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(" ---------------------- ");
        for (int i = a.length - 1; i >= 0; i--) {
            for (int k = a[0].length - 1; k >= 0; k--) {
                System.out.print(a[i][k] + " ");
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}