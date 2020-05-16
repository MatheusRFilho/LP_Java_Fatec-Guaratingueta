class VerificaValorProdutoRandom{
	public static void main(String[] args) {
		int precoProduto1 = (int)(Math.random () * 1001);
		int precoProduto2 = (int)(Math.random () * 1001);

		System.out.println(precoProduto1 + " , " +precoProduto2);

		if (precoProduto1 > precoProduto2)
		{
			System.out.println("O produto 2 e mais barato");
		}
		else
		{
			System.out.println("O produto 1 e mais barato");
		}
	}
}