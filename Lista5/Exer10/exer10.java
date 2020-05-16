import java.util.Scanner;
class exer10{
	public static void main(String[] args) {
	double salarioFixo,valorDeVendas,ultrapassagem=0,salario;
	
		Scanner scanner = new Scanner(System.in);


		System.out.println("Digite o salario fixo");
		salarioFixo=scanner.nextInt();
		System.out.println("Digite o Valor de vendas");
		valorDeVendas=scanner.nextInt();
		
		
		
		if(valorDeVendas>1500){
			
			ultrapassagem=(valorDeVendas-1500)*5/100;
		}
		salario=salarioFixo+(valorDeVendas*3/100)+ultrapassagem;
		
	
		System.out.println("O salrio do funcionário e de "+salario);
	}
}

//Matheus Rodrigo Queiroz de Lima Filho