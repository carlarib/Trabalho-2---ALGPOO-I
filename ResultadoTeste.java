import java.util.Arrays;

public class ResultadoTeste {
	public static void main(String[] args) {
		float [] parametros = {1.7523f, 0.0f, 923.19f};
		Algoritmo algoritmo = new Algoritmo("ALGORITMO TESTE", parametros);
		Dataset dataset = new Dataset(10, 4, 2, "ABCDEFGHI JKLMNOPQ");

		MedidaAvaliacao medida0 = new MedidaAvaliacao("TESTE", 6.34f, 896.12f);
		ValorAvaliacao avaliacao0 = new ValorAvaliacao(medida0);
		
		MedidaAvaliacao medida1 = new MedidaAvaliacao("TESTE", 6.34f, 896.12f);
		ValorAvaliacao avaliacao1 = new ValorAvaliacao(medida1);

		MedidaAvaliacao medida2 = new MedidaAvaliacao("acdefghi", 6.34f, 896.12f);
		ValorAvaliacao avaliacao2 = new ValorAvaliacao(medida2);

		MedidaAvaliacao medida3 = new MedidaAvaliacao("NUMTESTANDO", 0.4f, 6.91f);
		ValorAvaliacao avaliacao3 = new ValorAvaliacao(medida3);

		MedidaAvaliacao medida4 = new MedidaAvaliacao("medida 4", 9234.234f, 102.0f);
		ValorAvaliacao avaliacao4 = new ValorAvaliacao(medida4);

		Resultado resultado = new Resultado(algoritmo, dataset);

		System.out.println("--------------- TESTANDO O METODO ADDAVALIACAO() ---------------\n");
		System.out.println("Saida esperada: Nova avaliacao adicionada com sucesso");
		System.out.print("Saida obtida: ");
		resultado.addAvaliacao(avaliacao0);
		

		System.out.println("Saida esperada: Nao foi possivel adicionar a avaliacao pois ja existe outra avaliacao igual com a mesma medida de avaliacao.");
		System.out.print("Saida obtida: ");
		resultado.addAvaliacao(avaliacao1);
		

		System.out.println("Saida esperada: Nova avaliacao adicionada com sucesso!");
		System.out.print("Saida obtida: ");
		resultado.addAvaliacao(avaliacao2);
		

		System.out.println("Saida esperada: Nova avaliacao adicionada com sucesso!");
		System.out.print("Saida obtida: ");
		resultado.addAvaliacao(avaliacao3);
		

		System.out.println("Saida esperada: Nao foi possivel adicionar uma nova avaliacao pois o limite de avaliacoes ja foi alcancado. MAX: 3");
		System.out.print("Saida obtida: ");
		resultado.addAvaliacao(avaliacao4);
		
		System.out.println();
		System.out.println("Conferindo se as tres posicoes foram preenchidas: " + Arrays.toString(resultado.getAvaliacoes()));
		System.out.println();

		System.out.println("--------------- TESTANDO O METODO GETAVALIACAOPORMEDIDA() ---------------\n");
		System.out.println("Saida esperada: null");
		System.out.print("Saida obtida: ");
		System.out.println(resultado.getAvaliacaoPorMedida("NUM"));

		System.out.println("Saida esperada: HASHCODE DO OBJETO");
		System.out.print("Saida obtida: ");
		System.out.println(resultado.getAvaliacaoPorMedida("medida 4"));

		System.out.println("Saida esperada: HASHCODE DO OBJETO");
		System.out.print("Saida obtida: ");
		System.out.println(resultado.getAvaliacaoPorMedida("TESTE"));
	}
}