import java.util.Random;
class exer19{
	public static void main(String[] args) {
		 Random random = new Random();
         int aux;
         int z[] = new int[10];

         for(int i=0;i<z.length;i++)
         {
            z[i]=random.nextInt(10);
         } 


         for(int cont1=0;cont1<z.length;cont1++)
            {
                for(int cont2=0;cont2<z.length-1;cont2++){
                    if(z[cont2]>z[cont2+1]){
                        aux=z[cont2];
                        z[cont2] = z[cont2+1];
                        z[cont2+1] = aux;
                    }
                }
            }

            for(int i=0;i<z.length;i++)
            {
                System.out.print(z[i]+" ");
            }
	}
}