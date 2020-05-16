import java.util.Random;
import java.util.Scanner;
class exer8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de linhas");
        int n = scanner.nextInt();
        System.out.println("Digite o numero de colunas");
        int m = scanner.nextInt();
        int a[][] = new int[n][m];
        int qtdp = 0, qtdi = 0,auxp=0,auxi=0;
        System.out.println("Matriz");
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = random.nextInt(20);
                System.out.print(a[i][k] + " ");
                if (a[i][k] % 2 == 0) {
                    qtdp++;
                } else {
                    qtdi++;
                }
            }
            System.out.print("\n");
        }
        int par[] = new int[qtdp];
        int impar[] = new int[qtdi];


        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                if (a[i][k] % 2 == 0) {
                    par[auxp]=a[i][k];
                    auxp++;
                } else {
                    impar[auxi]=a[i][k];
                    auxi++;
                }
            }
        }
        System.out.println(" ---------------------- ");

        if (qtdp > 0 && qtdi > 0) {
            System.out.println("Vetor Par");
            for (int i = 0; i < par.length; i++) {
                System.out.print(par[i] + " ");
            }
            System.out.println("\nVetor Impar");
            for (int i = 0; i < impar.length; i++) {
                System.out.print(impar[i] + " ");
            }
        }
        else{
            System.out.println("Matriz Invalida");
        }
        scanner.close();
    }
}