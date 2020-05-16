import java.util.Scanner;
import java.util.Random;
class exer5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o numero de linhas");
        int n=scanner.nextInt();
        System.out.println("Digite o numero de colunas");
        int m=scanner.nextInt();

        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int c[][] = new int[n][m];
        System.out.println("Matriz A");
        for(int i=0;i< a.length ;i++)
        {
            for(int k=0;k<a[0].length;k++)
            {
                a[i][k]=random.nextInt(10);
                System.out.print(" "+a[i][k]);
            }
            System.out.println();
        }
        System.out.println("Matriz B");
        for(int i=0;i< b.length ;i++)
        {
            for(int k=0;k<b[0].length;k++)
            {
                b[i][k]=random.nextInt(10);
                System.out.print(" "+b[i][k]);
            }
            System.out.println();
        }
        System.out.println("Matriz C");
        for(int i=0;i< c.length ;i++)
        {
            for(int k=0;k<c[0].length;k++)
            {
                c[i][k]=a[i][k]+b[i][k];
                System.out.print(" "+c[i][k]);
            }
            System.out.println();
        }
        scanner.close();
    }
}