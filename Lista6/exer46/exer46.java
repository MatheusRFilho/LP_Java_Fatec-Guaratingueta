import java.util.Scanner;
class exer46{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor=0,comparador=0;

		System.out.println("Digite o valor");
		valor=scanner.nextInt();
		 for (int contador=1;contador<=valor;contador++)
		 {
		 	if(valor%contador==0)
		 	{
		 		comparador++;
		 	}
		 }
		 	if(comparador==2)
		 	{
		 		System.out.println("O valor e primo");
		 	}
		 	else{
		 		System.out.println("O valor nao e primo");
		 	}
		

}
}