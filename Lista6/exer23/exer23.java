import java.util.Scanner;
class exer23{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int salario=0 , numeroDeFilho=0 , maior=0,salarioTotal=0,numeroDeFilhoTotal=0,contador=0;
		double mediaFilhos=0,mediaSalarial=0,p=0;
		
		

		do{
			System.out.println("Digite o salario da pessoa");
			salario=scanner.nextInt();
				if(salario>0)
			{

					System.out.println("Digite o numero de filhos");
					numeroDeFilho=scanner.nextInt();

						numeroDeFilhoTotal+=numeroDeFilho;
						salarioTotal+=salario;
					
					if(salario>maior)
					{
						maior=salario;
					}
					if(salario<150)
					{	
						p++;
					}
					contador++;
		}

		}while(salario>0);

		
		mediaSalarial=(double)salarioTotal/contador;
		mediaFilhos=(double)numeroDeFilhoTotal/contador;
		p=(double)(p/contador)*100;
		System.out.println("A media Salarial e de "+mediaSalarial);
		System.out.println("A media de numero de filhos da população e de "+mediaFilhos);
		System.out.println("O maior salario dos habitantes e de "+maior);
		System.out.println("O percentual das pessoas com salario menor que 150 e de "+p+"%");
	}
}