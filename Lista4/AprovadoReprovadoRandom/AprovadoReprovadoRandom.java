class AprovadoReprovadoRandom{
	public static void main(String[] args) {
		int nota = (int)(Math.random () * 11);
		if (nota<6)
		{
			System.out.println("reprovado");
		}
		else
		{
			System.out.println("Aprovado");
		}
		System.out.println(nota);
	}
}