import java.util.Random;
class exer2 {
    public static void main(String[] args) {
        int a[][] = new int[6][3];
        
        Random random = new Random();

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
    }
}