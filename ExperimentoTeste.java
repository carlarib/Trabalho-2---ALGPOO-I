import java.util.Arrays;

public class ExperimentoTeste {
	public static void main(String[] args) {
		Experimento experimento = new Experimento(14, 5, 2019);

		/* TESTANDO O MÉTODO ADDRESULTADO() */

		float [] parametros = {1.7523f, 0.0f, 923.19f};
		Algoritmo algoritmo = new Algoritmo("ALGORITMO TESTE", parametros);
		Dataset dataset = new Dataset(10, 4, 2, "ABCDEFGHI JKLMNOPQ");

		Resultado resultado = new Resultado(algoritmo, dataset);

		System.out.println(experimento.addResultado(resultado));
	
		float [] parametros1 = {1.7523f, 0.0f, 923.19f};
		Algoritmo algoritmo1 = new Algoritmo("ALGORITMO TESTE", parametros1);
		Dataset dataset1 = new Dataset(10, 4, 2, "ABCDEFGHI JKLMNOPQ");

		Resultado resultado1 = new Resultado(algoritmo1, dataset1);

		System.out.println(experimento.addResultado(resultado1));

		float [] parametros2 = {0.398f, 9.0f, 1111.1111f};
		Algoritmo algoritmo2 = new Algoritmo("XPTO-LUMINUS", parametros2);
		Dataset dataset2 = new Dataset(5, 10, 7, "PRIMEIRO CONJUNTO");

		Resultado resultado2 = new Resultado(algoritmo2, dataset2);
		System.out.println(experimento.addResultado(resultado2));

		/* TESTANDO O MÉTODO GETVALORESRESULTADO */

		MedidaAvaliacao medida = new MedidaAvaliacao("MED-REQ", 6.34f, 896.12f);
		ValorAvaliacao avaliacao = new ValorAvaliacao(medida);
		avaliacao.setValor(79.124f);
		
		MedidaAvaliacao medida1 = new MedidaAvaliacao("MED-REQ", -1972.00f, 1972.00f);
		ValorAvaliacao avaliacao1 = new ValorAvaliacao(medida1);
		avaliacao1.setValor(633.21f);

		resultado.addAvaliacao(avaliacao);
		System.out.println("ARRAY DE AVALIACOES: " + Arrays.toString(resultado.getAvaliacoes()));
		resultado2.addAvaliacao(avaliacao1);
		System.out.println("ARRAY DE AVALIACOES: " + Arrays.toString(resultado2.getAvaliacoes()));

		System.out.println(Arrays.toString(experimento.getValoresResultado("MED-REQ")));
	}
}