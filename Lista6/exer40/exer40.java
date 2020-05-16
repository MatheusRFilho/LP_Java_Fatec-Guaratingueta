import java.util.Scanner;
class exer40{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigo=0,n=0,variavel=1;

			do{
				System.out.println("Digite o Valor");
				codigo=scanner.nextInt();
			}while(codigo<0);

			if(codigo!=0)
			{
			
			for(int c=1;c<=codigo;c++){
				if(c<=codigo/2)
				{

					System.out.println(++n);
					if(codigo%2==1)
					{

						if(c>=codigo/2)
							System.out.println(++n);
						
					}
					
				}
				else if(c>codigo/2)
				{
					
					if(codigo%2==1)
					{
						if(variavel==1)
						{
							n--;
							variavel++;
						}
					}
					if(n!=0){
					System.out.println(n--);
					}
				}
			}
			}
		
}
}