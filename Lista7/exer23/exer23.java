import java.util.Scanner;
class Exer23{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		String nome="",sobrenome="";
		System.out.println("Digite o nome");
		nome=scanner.nextLine();
		int i=nome.length()-1;
		do{
			
			sobrenome=nome.charAt(i) + sobrenome;
			i--;
		}while(nome.charAt(i)!=(char)32);


		System.out.println(sobrenome);
	}
}