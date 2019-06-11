public class ExperimentoTeste {
	public static void main(String[] args) {
		Experimento experimento = new Experimento(14, 5, 2019);

		float [] parametros = {1.7523f, 0.0f, 923.19f};
		Algoritmo algoritmo = new Algoritmo("ALGORITMO TESTE", parametros);
		Dataset dataset = new Dataset(10, 4, 2, "ABCDEFGHI JKLMNOPQ");

		Resultado resultado = new Resultado(algoritmo, dataset);

		System.out.println(experimento.addResultado(resultado));
	
		float [] parametros1 = {1.7523f, 0.0f, 923.19f};
		Algoritmo algoritmo1 = new Algoritmo("ALGORITMO TESTE", parametros);
		Dataset dataset1 = new Dataset(10, 4, 2, "ABCDEFGHI JKLMNOPQ");

		Resultado resultado1 = new Resultado(algoritmo, dataset);

		System.out.println(experimento.addResultado(resultado1));
	}
}