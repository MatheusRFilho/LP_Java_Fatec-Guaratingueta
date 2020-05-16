import java.util.Random;
import java.util.Scanner;
class exer4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n=0,m=0,o=0;

        do{
        System.out.println("Digite o numeros de linhas");
        n=scanner.nextInt();
        System.out.println("Digite o numeros de colunas");
        m=scanner.nextInt();
        }while(n<1 || m<1);

        System.out.println("Digite o valor maximo que a matriz pode ter");
        o=scanner.nextInt();

        int a[][] = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = random.nextInt(o);
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