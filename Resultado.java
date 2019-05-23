public class Resultado {
	private Algoritmo algoritmo;
	private Dataset dataset;
	private ValorAvaliacao [] avaliacao;

	public Resultado(Algoritmo algoritmo, Dataset dataset) {
		this.dataset = dataset;
		this.algoritmo = algoritmo;
		avaliacao = new ValorAvaliacao [3];
	}	
}