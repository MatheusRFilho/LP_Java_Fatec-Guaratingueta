import java.util.Scanner;
class Exer25{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		boolean estado=false;


		do{
		String senha="",caracteres="!@#$%&*()+";
		int tamanho=0,numero=0,letras=0,letrasMais=0,letrasMin=0,simbolos=0;

		System.out.println("Digite a senha");
		senha=scanner.nextLine();
		
			
		
		for(int i=0;i<senha.length();i++)
		{
			if(senha.charAt(i)>=48 && senha.charAt(i)<=57)
			{
				numero++;
			}

			if(senha.charAt(i)>=65 && senha.charAt(i)<=90)
			{
				letrasMais++;
			}

			if(senha.charAt(i)>=65 && senha.charAt(i)<=90)
			{
				letrasMin++;
			}

			if(senha.charAt(i)==48 && senha.charAt(i)<=57)
			{
				numero++;
			}
			for(int k=0;k<caracteres.length();k++)
			{
				if(senha.charAt(i)==caracteres.charAt(k))
				{
					simbolos++;
				}
			}



		}
		letras=letrasMais+letrasMin;


			System.out.println("Regras");
			System.out.println("Tamanho ="+senha.length()+(senha.length()>=10?" ok":" X"));	
			System.out.println("Quantidade de letras ="+letras+(letras>=3?" Ok":" X"));
			System.out.println("Quantidade de Numeros ="+numero+(numero>=3?" Ok":" X"));
			System.out.println("Quantidade de simbolos ="+simbolos+(simbolos>=2?" Ok":" X"));
			System.out.println("------------------------------------------------------------");
			if(senha.length()>=10 && letras>=3 && numero>=3 && simbolos>=2)
			{
				estado=true;
			}
		}while(estado!=true);
	}
}