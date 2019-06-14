import java.util.Arrays;

public class ExperimentoTeste {
	public static void main(String[] args) {
		Experimento experimento = new Experimento(14, 5, 2019);

		/* TESTANDO O MÉTODO ADDRESULTADO() */
		System.out.println("---------- TESTANDO O METODO ADDRESULTADO() ----------");

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

		float [] parametros3 = {2009.35f, 1.0f, 301.127f};
		Algoritmo algoritmo3 = new Algoritmo("ABC-ARG", parametros3);
		Dataset dataset3 = new Dataset(34, 41, 9, "CONJUNTO TESTE");

		Resultado resultado3 = new Resultado(algoritmo3, dataset3);
		System.out.println(experimento.addResultado(resultado3));

		float [] parametros4 = {-45.30f, 9.0f, 453000.30f};
		Algoritmo algoritmo4 = new Algoritmo("ABC-ARG", parametros4);
		Dataset dataset4 = new Dataset(99, 45, 13, "CONJUNTO TESTE");

		Resultado resultado4 = new Resultado(algoritmo4, dataset4);

		System.out.println(experimento.addResultado(resultado4));

		/* TESTANDO O MÉTODO GETVALORESRESULTADO */

		System.out.println("---------- TESTANDO O METODO GETVALORESRESULTADO() ----------");

		// primeira avaliação do primeiro resultado
		MedidaAvaliacao medida = new MedidaAvaliacao("MED", 6.34f, 896.12f);
		ValorAvaliacao avaliacao = new ValorAvaliacao(medida);
		avaliacao.setValor(79.124f);
		
		// primeira avaliação do segundo resultado aceito (na ordem ali de cima ele seria o terceira, mas o resultado1 não foi aceito)
		MedidaAvaliacao medida2 = new MedidaAvaliacao("MED", -1972.00f, 1972.00f);
		ValorAvaliacao avaliacao2 = new ValorAvaliacao(medida2);
		avaliacao2.setValor(633.21f);

		// primeira avaliação do terceiro resultado aceito
		MedidaAvaliacao medida3 = new MedidaAvaliacao("MED-REQ", 4.00f, 20000.00f);
		ValorAvaliacao avaliacao3 = new ValorAvaliacao(medida3);
		avaliacao3.setValor(10394.168f);

		// segunda avaliação do terceiro resultado 
		MedidaAvaliacao medida4 = new MedidaAvaliacao("MED", 999.10f, 1999.10f);
		ValorAvaliacao avaliacao4 = new ValorAvaliacao(medida4);
		avaliacao4.setValor(1005.00f);

		// terceira avaliação do terceiro resultado 
		MedidaAvaliacao medida5 = new MedidaAvaliacao("MED-REQ", 99.10f, 999.10f);
		ValorAvaliacao avaliacao5 = new ValorAvaliacao(medida5);
		avaliacao5.setValor(105.00f);

		// primeira avaliação do quarto resultado 
		MedidaAvaliacao medida6 = new MedidaAvaliacao("MED-REQ", -2.10f, 200009.10f);
		ValorAvaliacao avaliacao6 = new ValorAvaliacao(medida6);
		avaliacao6.setValor(30005.00f);

		resultado.addAvaliacao(avaliacao);
		System.out.println("ARRAY DE AVALIACOES: " + Arrays.toString(resultado.getAvaliacoes()));
		resultado2.addAvaliacao(avaliacao2);
		System.out.println("ARRAY DE AVALIACOES: " + Arrays.toString(resultado2.getAvaliacoes()));
		resultado3.addAvaliacao(avaliacao3);
		System.out.println("ARRAY DE AVALIACOES: " + Arrays.toString(resultado3.getAvaliacoes()));
		resultado3.addAvaliacao(avaliacao4);
		System.out.println("ARRAY DE AVALIACOES: " + Arrays.toString(resultado3.getAvaliacoes()));
		resultado3.addAvaliacao(avaliacao5);
		System.out.println("ARRAY DE AVALIACOES: " + Arrays.toString(resultado3.getAvaliacoes()));
		resultado4.addAvaliacao(avaliacao6);
		System.out.println("ARRAY DE AVALIACOES: " + Arrays.toString(resultado4.getAvaliacoes()));

		System.out.println(Arrays.toString(experimento.getValoresResultado("MED-REQ")));
		System.out.println(Arrays.toString(experimento.getValoresResultado("MED")));

		System.out.println("---------- TESTANDO O METODO GETMEDIARESULTADOS() ----------");
		System.out.println(experimento.getMediaResultados("MED-REQ"));
		System.out.println(experimento.getMediaResultados("MED-R"));

		System.out.println("---------- TESTANDO O METODO GETMEDIARESULTADOSPORALGORITMO() ----------");
		System.out.println(experimento.getMediaResultadosPorAlgoritmo("ABC-ARG", "MED-REQ"));
		System.out.println(experimento.getMediaResultadosPorAlgoritmo("XPTO-LUMINUS", "MED"));
		System.out.println(experimento.getMediaResultadosPorAlgoritmo("XPTO", "MED"));

		System.out.println("---------- TESTANDO O METODO GETMEDIARESULTADOSPORDATASET() ----------");
		System.out.println(experimento.getMediaResultadosPorDataset("CONJUNTO TESTE", "MED-REQ"));
		System.out.println(experimento.getMediaResultadosPorDataset("ABCDEFGHI JKLMNOPQ", "MED-REQ"));
		System.out.println(experimento.getMediaResultadosPorDataset("XPTO", "MED"));

		System.out.println("---------- TESTANDO O METODO GETMELHORRESULTADO() ----------");
		System.out.println(experimento.getMelhorResultado("MED"));
		System.out.println(Arrays.toString(experimento.getResultado()));

		System.out.println("---------- TESTANDO O METODO GETMELHORRESULTADOPORALGORITMO() ----------");
		System.out.println(experimento.getMelhorResultadoPorAlgoritmo("ABC-ARG", "MED-REQ"));
		
		System.out.println("---------- TESTANDO O METODO GETMELHORRESULTADOPORDATASET() ----------");
		System.out.println(experimento.getMelhorResultadoPorDataset("CONJUNTO TESTE", "MED-REQ"));
		
		System.out.println("---------- TESTANDO O METODO GETPIORRESULTADO() ----------");
		System.out.println(experimento.getPiorResultado("MED-REQ"));
		System.out.println(experimento.getPiorResultado("medida"));
		System.out.println(experimento.getPiorResultado("MED"));

		System.out.println("---------- TESTANDO O METODO GETPIORRESULTADOPORALGORITMO() ----------");
		System.out.println(experimento.getPiorResultadoPorAlgoritmo("ABC-ARG", "MED-REQ"));
		
		System.out.println("---------- TESTANDO O METODO GETPIORRESULTADOPORDATASET() ----------");
		System.out.println(experimento.getPiorResultadoPorDataset("CONJUNTO TESTE", "MED-REQ"));
		
		System.out.println();
		experimento.retornaObjeto();
	}
}