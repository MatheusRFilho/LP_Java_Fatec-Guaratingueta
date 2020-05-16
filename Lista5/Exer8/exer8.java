import java.util.Scanner;
class exer8{
	public static void main(String[] args) {
		
	int horaInicio,horaFinal,totalHoras=0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite quando começou o jogo de xadrez");
		horaInicio=scanner.nextInt();
		System.out.println("Digite quando o jogo terminou");
		horaFinal=scanner.nextInt();
		
		if(horaInicio<horaFinal){
			totalHoras=horaFinal-horaInicio;
		}
		else {
			totalHoras=(24-horaInicio)+horaFinal;
		}
		System.out.println("O jogo Durou "+ totalHoras +" horas");
	}
}

//Matheus Rodrigo Queiroz de Lima Filho