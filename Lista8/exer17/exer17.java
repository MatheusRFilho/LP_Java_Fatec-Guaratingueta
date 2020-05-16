import java.util.Scanner;
class exer17{
	public static void main(String[] args) {
		int quantidade,p=0,aux=0;
		Scanner scanner = new Scanner(System.in);
        do{
		System.out.println("Digite a quantidade de numeros");
		quantidade=scanner.nextInt();
        }while(quantidade<0);


		int v[] = new int[quantidade];  
        
        for ( int i = 2; p < quantidade;i++){  
            aux=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                aux++;
            }
        }
          if(aux==2)
          {
            v[p]=i;
            p++;
          }    
          
        }  
        for (int j = 0; j < v.length; j++){  
            System.out.print(" "+v[j]);  
        }  
	}
}