class ADivisivelPorBRandom{
	public static void main(String[] args) {
		int a = (int)(Math.random () * 1001);
		int b = (int)(Math.random () * 21);


		System.out.println("A = "+a+"\nB ="+b);




		if(a%b==0)
		{
			System.out.println("é divisivel");
		}
		else
		{
			System.out.println("Nao e divisivel");
		}
	}
}