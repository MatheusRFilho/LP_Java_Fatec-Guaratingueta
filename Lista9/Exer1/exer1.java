import java.util.Random;
class exer1{
    public static void main(String[] args) {
        int a[][] = new int[4][5];

        Random random = new Random();

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]= random.nextInt(10);
                System.out.print(a[i][j] +" ");
            }
            System.out.print("\n");
        }

    }
}