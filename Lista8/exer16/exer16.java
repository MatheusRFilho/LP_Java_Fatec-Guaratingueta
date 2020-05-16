import java.util.Scanner;
class exer16{
	public static void main(String[] args) {
		int quantidade,a=0,b=1,c=0;
		Scanner scanner = new Scanner(System.in);
        do{
		System.out.println("Digite a quantidade de numeros");
		quantidade=scanner.nextInt();
        }while(quantidade<0);


		int v[] = new int[quantidade];  
        
        for ( int i = 0; i < v.length; i++ ){  
            v[i] = a;
            c=a+b;
            a=b;
            b=c;  
        }  
        for (int j = 0; j < v.length; j++){  
            System.out.print(" "+v[j]);  
        }  
	}
}