import java.util.Random;
import java.util.Scanner;
class exer6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o numero de linhas");
        int n= scanner.nextInt();
        System.out.println("Digite o numero de colunas");
        int m= scanner.nextInt();
        int a[][] = new int[n][m];
        
        System.out.println("Digite o valor para checagem");
        int numero = scanner.nextInt();
        int quantidade=0;

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = random.nextInt(20);
                System.out.print(a[i][k] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(" ---------------------- ");
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                if(a[i][k]==numero)
                {
                    System.out.println("Na linha "+(i+1)+" e na coluna "+(k+1)+" Contem o valor digitado");
                    quantidade++;
                }
            }
           
        }
        System.out.print("O valor digitado aparece "+quantidade);
        scanner.close();
    }
}