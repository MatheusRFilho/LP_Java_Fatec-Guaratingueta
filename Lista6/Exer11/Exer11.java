
import java.util.Scanner;
class exer11{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int alunos = scanner.nextInt();
		double media=0;
		for(int contador=1;contador<=alunos;contador++) {
			System.out.println("Digite a nota do aluno");
			media+=scanner.nextDouble();
		}
		media=media/alunos;
		System.out.println("A media da turma e de "+media);

	}
}