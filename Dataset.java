public class Dataset {
	private int numExemplos;
	private int numAtributos;
	private int numClasses;
	private String nome;

	public Dataset(int nExemplos, int nAtributos, int nClasses, String nome) {
		this.numExemplos = nExemplos;
		this.numAtributos = nAtributos;
		this.numClasses = nClasses;
		this.nome = nome;
	}

	public int getNumExemplos() {
		return numExemplos;
	}

	public int getNumAtributos() {
		return numAtributos;
	}

	public int getNumClasses() {
		return numClasses;
	}

	public String getNome() {
		return nome;
	}
}