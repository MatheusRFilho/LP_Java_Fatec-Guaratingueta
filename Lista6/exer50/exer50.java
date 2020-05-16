import java.util.Scanner;
class exer50{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int comparador=0,valor=0,comparador2=1,quantidade=0;

		System.out.println("Digite a quantidade de Valores");
		quantidade=scanner.nextInt();
		System.out.println("Digite a quantidade de termos");
		valor=scanner.nextInt();



		for(int x=1;x<=quantidade;x++)
		{
			comparador=0;
		 for (int contador=1;contador<=x;contador++)
		 {
		 	if(x%contador==0)
		 	{

		 		comparador++;
		 	}
		 }
		 if(comparador2<=valor)
		 {
		 	if(comparador==2)
		 	{
		 		System.out.println(x);
		 		comparador2++;
		 	}
		 	
		 }	
		}
}
}