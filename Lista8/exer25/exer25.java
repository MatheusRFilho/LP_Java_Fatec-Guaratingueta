import java.util.Random;
class exer25{
    public static void main(String[] args) {
         Random random = new Random();
         int aux=0,aux2=0,contafor=0,cont=0,cont2=0,contador=0;
         int af[] = new int[10];
         System.out.println("Desorganizado");
         for(int i=0;i<af.length;i++)
         {
            af[i]=random.nextInt(10);
            System.out.print(af[i]+" ");
            if(af[i]%2==0)
            {
               contafor++;        
            }
            else
            {
                contador++;
            }

         } 
         int par[] = new int[contafor];
         int impar[] = new int[contador];

         for(int i=0;i<af.length;i++)
         {
            if(af[i]%2==0)
            {
               par[cont]=af[i]; 
               cont++;       
            }
            if(af[i]%2==1)
            {
               impar[cont2]=af[i]; 
               cont2++;       
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

            aux=0;

            for(int i = 0; i<impar.length; i++){
                for(int j = 0; j<impar.length-1; j++){
                    if(impar[j] < impar[j + 1]){
                        aux = impar[j];
                        impar[j] = impar[j+1];
                        impar[j+1] = aux;
                        
                    }
                }
            }

         for(int i=0;i<af.length;i++)
         {
            if(af[i]%2==0)
            {
                af[i]=par[aux2++];
            }

         }
         aux2=0;
         for(int i=0;i<af.length;i++)
         {
            if(af[i]%2==1)
            {
                af[i]=impar[aux2++];
            }

         }
           


            System.out.println("\npar");
            for(int i=0;i<par.length;i++)
            {
                System.out.print(par[i]+" ");
            }
            System.out.println("\nimpar");
            for(int i=0;i<impar.length;i++)
            {
                System.out.print(impar[i]+" ");
            }

            System.out.println("\nOrganizado");         
            for(int i=0;i<af.length;i++)
            {
                System.out.print(af[i]+" ");
            }
    }
}