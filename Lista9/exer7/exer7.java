import java.util.Random;
import java.util.Scanner;
class exer7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o numero de linhas");
        int n= scanner.nextInt();
        System.out.println("Digite o numero de colunas");
        int m= scanner.nextInt();
        int a[][] = new int[n][m];
        
        int maior=0,menor=0;

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
                if(a[i][k]>=maior)
                {
                    maior=a[i][k];
                }
                if(a[i][k]<=menor)
                {
                    menor=a[i][k];
                }
            }
           
        }
        System.out.print("O menor valor é de "+menor+"\nO maior valor é de "+maior);
        
        scanner.close();
    }
}