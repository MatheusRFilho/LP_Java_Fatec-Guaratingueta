import java.util.Scanner;
class exer9{
	public static void main(String[] args) {
	double salario,horaExtras=0,horaTrabalhadas,salarioPorHora;
	
		Scanner scanner = new Scanner(System.in);


		System.out.println("Digite o numero de horas trabalhadas");
		horaTrabalhadas=scanner.nextInt();
		System.out.println("Digite o salario por hora");
		salarioPorHora=scanner.nextInt();
		
		
		
		if(horaTrabalhadas>40){
			horaExtras=(salarioPorHora*(horaTrabalhadas-40))*50/100;

		}
		salario=salarioPorHora*horaTrabalhadas+horaExtras;
	
		System.out.println("O salrio do funcionário e de "+salario);
	}
}

//Matheus Rodrigo Queiroz de Lima Filho