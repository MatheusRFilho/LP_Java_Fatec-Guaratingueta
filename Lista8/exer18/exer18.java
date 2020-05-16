import java.util.Scanner;
class exer18{
	public static void main(String[] args) {
		int quantidade,fat=1,c=0;
		Scanner scanner = new Scanner(System.in);
        do{
		System.out.println("Digite a quantidade de numeros");
		quantidade=scanner.nextInt();
        }while(quantidade>15 || quantidade<0);


		int y[] = new int[quantidade];  
        
        for ( int i = 1; i <= quantidade; i++ ){ 
            fat=1;
            for(int j=1;j<=i;j++)
            {
                fat*=j;
            }
            y[c]=fat;
            c++;
        }  
        for (int j = 0; j < y.length; j++){  
            System.out.print(" "+y[j]);  
        }  
	}
}