
class exer47{
	public static void main(String[] args) {
		
		int comparador=0;

		for(int valor=1;valor<=100;valor++)
		{
			comparador=0;
		 for (int contador=1;contador<=valor;contador++)
		 {
		 	if(valor%contador==0)
		 	{

		 		comparador++;
		 	}
		 }
		 	if(comparador==2)
		 	{
		 		System.out.println(valor);
		 	}
		 	
		}
		}

}
