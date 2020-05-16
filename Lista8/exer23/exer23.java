import java.util.Random;
class exer23{
	public static void main(String[] args) {
		 Random random = new Random();
         int aux=0,aux2=0,contador=0,cont=0;
         int ad[] = new int[10];

         for(int i=0;i<ad.length;i++)
         {
            ad[i]=random.nextInt(10);
            System.out.print(ad[i]+" ");
            if(ad[i]%2==0)
            {
               contador++;        
            }

         } 
         int par[] = new int[contador];
         for(int i=0;i<ad.length;i++)
         {
            
            if(ad[i]%2==0)
            {
               par[cont]=ad[i]; 
               cont++;       
            }

         } 

             for(int i = 0; i<par.length; i++){
                for(int j = 0; j<par.length-1; j++){
                    if(par[j] > par[j + 1]){
                        aux = par[j];
                        par[j] = par[j+1];
                        par[j+1] = aux;
                        
                    }
                }
            }

         for(int i=0;i<ad.length;i++)
         {
            if(ad[i]%2==0)
            {
                ad[i]=par[aux2++];
            }

         }
           


            System.out.println("");
            for(int i=0;i<par.length;i++)
            {
                System.out.print(par[i]+" ");
            }

            System.out.println("");         
            for(int i=0;i<ad.length;i++)
            {
                System.out.print(ad[i]+" ");
            }
	}
}