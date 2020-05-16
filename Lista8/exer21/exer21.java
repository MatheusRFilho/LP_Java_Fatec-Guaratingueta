import java.util.Random;
class exer21{
	public static void main(String[] args) {
		 Random random = new Random();
         int aux;
         int ab[] = new int[10];

         for(int i=0;i<ab.length;i++)
         {
            ab[i]=random.nextInt(10);
         } 

         for(int i=0;i<ab.length;i++)
            {
                System.out.print(ab[i]+" ");
            }

         for(int i=0;i<ab.length;i++)
            {
                if(ab[i]%2==1)
                {
                    ab[i]=ab[i]*2;
                }
            }
            System.out.println("");
            for(int i=0;i<ab.length;i++)
            {
                System.out.print(ab[i]+" ");
            }
	}
}