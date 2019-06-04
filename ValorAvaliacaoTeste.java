public class ValorAvaliacaoTeste {
	public static void main(String[] args) {
		MedidaAvaliacao medida = new MedidaAvaliacao("TESTE", 6.34f, 896.12f);
		ValorAvaliacao valorAvaliacao = new ValorAvaliacao(medida);

		System.out.println(valorAvaliacao.getMedida());
	}
}
