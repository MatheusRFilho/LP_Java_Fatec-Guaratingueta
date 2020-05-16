import java.util.Random;
class exer24{
	public static void main(String[] args) {
		 Random random = new Random();
         int aux=0,aux2=0,contaeor=0,cont=0;
         int ae[] = new int[10];

         for(int i=0;i<ae.length;i++)
         {
            ae[i]=random.nextInt(10);
            System.out.print(ae[i]+" ");
            if(ae[i]%2==1)
            {
               contaeor++;        
            }

         } 
         int impar[] = new int[contaeor];
         for(int i=0;i<ae.length;i++)
         {
            
            if(ae[i]%2==1)
            {
               impar[cont]=ae[i]; 
               cont++;       
            }

         } 

             for(int i = 0; i<impar.length; i++){
                for(int j = 0; j<impar.length-1; j++){
                    if(impar[j] < impar[j + 1]){
                        aux = impar[j];
                        impar[j] = impar[j+1];
                        impar[j+1] = aux;
                        
                    }
                }
            }

         for(int i=0;i<ae.length;i++)
         {
            if(ae[i]%2==1)
            {
                ae[i]=impar[aux2++];
            }

         }
           


            System.out.println("");
            for(int i=0;i<impar.length;i++)
            {
                System.out.print(impar[i]+" ");
            }

            System.out.println("");         
            for(int i=0;i<ae.length;i++)
            {
                System.out.print(ae[i]+" ");
            }
	}
}