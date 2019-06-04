public class Resultado {
	private Algoritmo algoritmo;
	private Dataset dataset;
	private ValorAvaliacao [] avaliacao;

	public Resultado(Algoritmo algoritmo, Dataset dataset) {
		this.algoritmo = algoritmo;
		this.dataset = dataset;
		avaliacao = new ValorAvaliacao[3];

		for (int i = 0; i < 3; i++) {
			MedidaAvaliacao medida = new MedidaAvaliacao("", 0.0f, 0.0f);
			this.avaliacao[i] = new ValorAvaliacao(medida);
		}
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
		boolean mesmaMedida = false, posVazia = false;



		// verificando se há espaço no vetor
		for (int i = 0; i < 3 && posVazia == false; i++) {
			if (this.avaliacao[i].getMedida().getNome().equals("")) {
				posVazia = true;
				posicao = i;
			}
		}

		if (posVazia) {
		// conferindo se há outra medida existente que seja igual à medida que está sendo recebida na instanciação do objeto avaliação
			for (int i = 0; i < 3; i++) {
				if (avaliacao.getMedida().getNome().equals(this.avaliacao[i].getMedida().getNome())) {
					mesmaMedida = true;
				}
				else {
					mesmaMedida = false;
				}
			}
		}		
				
		// adicionando uma nova avaliação na posição vazia do vetor
		if (mesmaMedida != true) {
			this.avaliacao[posicao] = avaliacao;
			System.out.println("Nova avaliacao adicionada com sucesso.");
		}
		else if (posVazia == false) {			
			System.out.println("Nao ha espaco disponivel para uma nova avaliacao pois o numero maximo de avaliacoes permitidas foi atingido."); 
		}
		else if (posVazia == true && mesmaMedida == true) {
			System.out.println("Nao foi possivel adicionar a avaliacao pois ela ja existe."); 
		}
		return posVazia;		
	}

	public ValorAvaliacao [] getAvaliacoes() {
		return avaliacao;
	}
}