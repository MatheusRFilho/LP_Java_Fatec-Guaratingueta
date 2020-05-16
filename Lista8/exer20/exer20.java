import java.util.Random;
class exer20{
	public static void main(String[] args) {
		 Random random = new Random();
         int aux;
         int aa[] = new int[10];

         for(int i=0;i<aa.length;i++)
         {
            aa[i]=random.nextInt(10);
         } 


         for(int cont1=0;cont1<aa.length;cont1++)
            {
                for(int cont2=0;cont2<aa.length-1;cont2++){
                    if(aa[cont2]<aa[cont2+1]){
                        aux=aa[cont2];
                        aa[cont2] = aa[cont2+1];
                        aa[cont2+1] = aux;
                    }
                }
            }

            for(int i=0;i<aa.length;i++)
            {
                System.out.print(aa[i]+" ");
            }
	}
}