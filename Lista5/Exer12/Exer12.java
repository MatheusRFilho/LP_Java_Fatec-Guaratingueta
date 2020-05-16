
import java.util.Scanner;
class exer12{
	public static void main(String[] args) {
	double preco,codigo,frete=0,precototal;
	String origem="";
	
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Digite o preço do produto");
		preco=scanner.nextDouble();
		System.out.println("Digite o codigo do produto");
		codigo=scanner.nextDouble();
		

		if(codigo == 1)
		{
			frete=(preco*10/100);
			origem="norte";
		}
		else if(codigo==2 || codigo==5 || codigo==9)
		{
			frete=(preco*3/100);
			origem="sul";
		}
		else if(codigo==3 || (codigo>=10 && codigo<=15))
		{
			frete=(preco*1.2/100);
			origem="leste";
		}
		else if(codigo==7 || codigo==20)
		{
			frete=(preco*7.3/100);
			origem="oeste";
		}
		else
		{
			frete=(preco*22.2/100);
			origem="Importado";
		}

		precototal=preco+frete;

		
		
		System.out.println("O preço do produto e de "+preco);
		System.out.println("O codigo do produto e  "+codigo);
		System.out.println("A origem do produto e  "+origem);
		System.out.println("o frete do produto e "+frete);
		System.out.println("O preço do produto total e de "+precototal);

	}
}

//Matheus Rodrigo Queiroz de Lima Filho