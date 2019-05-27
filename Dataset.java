public class Dataset {
	private int numExemplos;
	private int numAtributos;
	private int numClasses;
	private String nome;

	public Dataset(int nExemplos, int nAtributos, int nClasses, String nome) {
		if (nExemplos >= 0) {
			this.numExemplos = nExemplos;
		} else {
			this.numExemplos = 0;
		}

		if (nAtributos >= 0) {
			this.numAtributos = nAtributos;
		} else {
			this.numAtributos = 0;
		}

		if (nClasses >= 0) {
			this.numClasses = nClasses;
		} else {
			this.numClasses = 0;
		}
		
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