public class Batata{
	private String nome;
	private float [] parametros;

	public Algoritmo(String nome, float [] parametros) {
		this.nome = nome;
		parametros = new float [3];
	}

	public String getNome() {
		return nome;
	}

	public float getParametros() {
		return parametros;
	}
}
