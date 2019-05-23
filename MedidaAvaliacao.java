public class MedidaAvaliacao {
	private String nome;
	private float menorValor;
	private float maiorValor;

	public MedidaAvaliacao(String nome, float menorValor, float maiorValor) {
		this.nome = nome;
		this.menorValor = menorValor;
		this.maiorValor = maiorValor;
	}

	public String getNome() {
		return nome;
	}

	public float getMenorValor() {
		return menorValor;
	}

	public float getMaiorValor() {
		return maiorValor;
	}
}