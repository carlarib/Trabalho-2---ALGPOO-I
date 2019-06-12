import java.util.Arrays;

public class Resultado {
	private Algoritmo algoritmo;
	private Dataset dataset;
	private ValorAvaliacao [] avaliacao;

	public Resultado(Algoritmo algoritmo, Dataset dataset) {
		this.algoritmo = algoritmo;
		this.dataset = dataset;
		this.avaliacao = new ValorAvaliacao[3];
	}

	public Algoritmo getAlgoritmo() {
		return algoritmo;
	}

	public Dataset getDataset() {
		return dataset;
	}

	public String getNomeDoAlgoritmo() {
		String nome;
		nome = this.algoritmo.getNome();
		return nome;
	}

	public String getNomeDoDataset() {
		String nome; 
		nome = this.dataset.getNome();
		return nome;
	}

	public boolean addAvaliacao(ValorAvaliacao avaliacao) {
		int posicao = 0; 
		boolean mesmaMedida = false, posVazia = false, retorno = false;	

		for (int i = 0; i < this.avaliacao.length && this.avaliacao[i] != null; i++) {
			if (this.avaliacao[i].equals(avaliacao)) {
				mesmaMedida = true;
			}
		}
		if (mesmaMedida) {
			System.out.println("Nao foi possivel adicionar a avaliacao pois ja existe outra avaliacao igual com a mesma medida de avaliacao.");
		}
		else {
			for (int i = 0; i < this.avaliacao.length && posVazia == false; i++) {
				if (this.avaliacao[i] == null) {
					posVazia = true;
					posicao = i;
				}
			}
			if (posVazia) {
				this.avaliacao[posicao] = avaliacao;
				System.out.println("Nova avaliacao adicionada com sucesso!");
				retorno = true;
			}
			else {
				System.out.println("Nao foi possivel adicionar uma nova avaliacao pois o limite de avaliacoes ja foi alcancado. MAX: 3");
			}
		}	
		return retorno;
	}

	public ValorAvaliacao [] getAvaliacoes() {
		return this.avaliacao;
	}

	public ValorAvaliacao getAvaliacoes(int indice) {
		return this.avaliacao[indice];
	}

	public ValorAvaliacao getAvaliacaoPorMedida(String medida) {
		// só preenchi assim pra não dar problema com a validação que você fez nas outras classes, mas antes tava "", 0.0f e 0.0f
		MedidaAvaliacao medidaTemporaria = new MedidaAvaliacao("vazia", 1.0f, 1.0f);
		ValorAvaliacao avaliacaoTemporaria = new ValorAvaliacao(medidaTemporaria);

		for (int i = 0; i < this.avaliacao.length && this.avaliacao[i] != null; i++) {
			if (this.avaliacao[i].getMedida().getNome().equals(medida)) {
				this.avaliacao[i] = avaliacaoTemporaria;
			}
			else {
				avaliacaoTemporaria = null;
			}
		}
		return avaliacaoTemporaria;
	}

	public boolean equals(Resultado resultado) {
		System.out.println(Arrays.toString(getAlgoritmo().getParametros()));
		System.out.println(Arrays.toString(resultado.getAlgoritmo().getParametros()));
		if (getAlgoritmo().getNome().equals(resultado.getAlgoritmo().getNome()) 
			&& Arrays.equals(getAlgoritmo().getParametros(), resultado.getAlgoritmo().getParametros())
			&& getDataset().getNumExemplos() == resultado.getDataset().getNumExemplos()
			&& getDataset().getNumAtributos() == resultado.getDataset().getNumAtributos()
			&& getDataset().getNumClasses() == resultado.getDataset().getNumClasses()
			&& getDataset().getNome().equals(resultado.getDataset().getNome())) {
			return true;
		}
		else {
			return false;
		} 
			
	}
}