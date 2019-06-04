public class ResultadoTeste {
	public static void main(String[] args) {
		float [] parametros = {1.7523f, 0.0f, 923.19f};
		Algoritmo algoritmo = new Algoritmo("ALGORITMO TESTE", parametros);
		Dataset dataset = new Dataset(10, 4, -2, "ABCDEFGHI JKLMNOPQ");

		MedidaAvaliacao medida = new MedidaAvaliacao("TESTE", 6.34f, 896.12f);
		ValorAvaliacao avaliacao = new ValorAvaliacao(medida);

		MedidaAvaliacao medida1 = new MedidaAvaliacao("TESTE", 6.34f, 896.12f);
		ValorAvaliacao avaliacao1 = new ValorAvaliacao(medida1);

		Resultado resultado = new Resultado(algoritmo, dataset);

		System.out.println(resultado.addAvaliacao(avaliacao));
		System.out.println(resultado.addAvaliacao(avaliacao1));
	}
}