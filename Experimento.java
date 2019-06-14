import java.util.Arrays;

public class Experimento {
	private int dia;
	private int mes;
	private int ano;
	private Resultado [] resultado;

	public Experimento(int dia, int mes, int ano) {
		if (dia <= 0 || dia > 31) {
			System.out.println("Dia invalido ");
			System.exit(0);
		
		}
		if (mes < 1 || mes > 12) {
			System.out.println("Mes invalido");
			System.exit(0);

		}
		if (mes == 2) {
			if (ano % 4 == 0) {
				if (dia > 29) {
					System.out.println("Dia invalido para o mes de fevereiro");
					System.exit(0);
				}
			
			}
			else if (dia > 28) {
				System.out.println("Dia invalido para o mes de fevereiro");
				System.exit(0);
			}
		
		}
		if (ano <= 0) {
			System.out.println("Ano invalido");
			System.exit(0);
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

		this.resultado = new Resultado[10];
	}

	public Resultado [] getResultado() {
		return this.resultado;
	}

	public void retornaObjeto() {
		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			System.out.println("----- RESULTADO " + i + " -----");
			System.out.println("NOME DO ALGORITMO: " + this.resultado[i].getNomeDoAlgoritmo());
			System.out.println("NOME DO DATASET: " + this.resultado[i].getNomeDoDataset());
			System.out.println("PARAMETROS: " + Arrays.toString(this.resultado[i].getAlgoritmo().getParametros()));
			System.out.println();
			
			for (int j = 0; j < 3 && this.resultado[i].getAvaliacoes(j) != null; j++) {
				System.out.println("----- AVALIACAO " + (j+1) + " -----");
				System.out.println("NOME DA MEDIDA DE AVALIACAO: " + this.resultado[i].getAvaliacoes(j).getMedida().getNome());
				System.out.println("VALOR: " + this.resultado[i].getAvaliacoes(j).getValor());
				System.out.println();
			}
		}
	}

	public boolean addResultado(Resultado resultado) {
		int posicao = 0;
		boolean mesmaMedida = false, posicaoVazia = false, retorno = false;

		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			if (this.resultado[i].equals(resultado)) {
				mesmaMedida = true;
			}
		}
		if (mesmaMedida) {
			System.out.println("Nao foi possivel adicionar um novo resultado pois ja existe outro resultado igual.");
		}
		else {
			for (int i = 0; i < this.resultado.length && posicaoVazia == false; i++) {
				if (this.resultado[i] == null) {
					posicaoVazia = true;
					posicao = i;
				}
			}
			if (posicaoVazia) {
				this.resultado[posicao] = resultado;
				System.out.println("Novo resultado adicionado com sucesso!");
				retorno = true;
			}
			else {
				System.out.println("Nao foi possivel adicionar um novo resultado pois o limite de resultados ja foi alcancado. MAX: 10");
			}
		}	
		return retorno;
	}

	public float [] getValoresResultado(String medida) {
		float [] medidas = new float [10];
		int posicao = 0;
		boolean encontrou = false;

		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			for (int j = 0; j < 3 && this.resultado[i].getAvaliacoes(j) != null; j++) {
				if (this.resultado[i].getAvaliacoes(j).getMedida().getNome().equals(medida)) {
					medidas[posicao] = this.resultado[i].getAvaliacoes(j).getValor();
					posicao++;
					encontrou = true;
				}
				else {
					medidas[posicao] = Float.MAX_VALUE;
					posicao++;
				}
			}
		}
		return medidas;
	}

	public float getMediaResultados(String medida) {
		float media = 0.0f;
		int contador = 0;
		boolean encontrou = false;

		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			for (int j = 0; j < 3 && this.resultado[i].getAvaliacoes(j) != null; j++) {
				if (this.resultado[i].getAvaliacoes(j).getMedida().getNome().equals(medida)) {
					media += this.resultado[i].getAvaliacoes(j).getValor();
					contador++;
					encontrou = true;
				}
			}
		}
		if (encontrou) {
			media = media/contador;
			return media;
		}
		else {
			return Float.MAX_VALUE;
		}
	}

	public float getMediaResultadosPorAlgoritmo(String algoritmo, String medida) {
		float media = 0.0f;
		int contador = 0;
		boolean encontrou = false;

		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			for (int j = 0; j < 3 && this.resultado[i].getAvaliacoes(j) != null; j++) {
				if (this.resultado[i].getNomeDoAlgoritmo().equals(algoritmo)) {
					if (this.resultado[i].getAvaliacoes(j).getMedida().getNome().equals(medida)) {
						media += this.resultado[i].getAvaliacoes(j).getValor();
						contador++;
						encontrou = true;
					} 
				}
			}
		}
		if (encontrou) {
			media = media/contador;
			return media;
		}
		else {
			return Float.MAX_VALUE;
		}
	}

	public float getMediaResultadosPorDataset(String dataset, String medida) {
		float media = 0.0f;
		int contador = 0;
		boolean encontrou = false;

		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			for (int j = 0; j < 3 && this.resultado[i].getAvaliacoes(j) != null; j++) {
				if (this.resultado[i].getNomeDoDataset().equals(dataset)) {
					if (this.resultado[i].getAvaliacoes(j).getMedida().getNome().equals(medida)) {
						media += this.resultado[i].getAvaliacoes(j).getValor();
						contador++;
						encontrou = true;
					} 
				}
			}
		}
		if (encontrou) {
			media = media/contador;
			return media;
		}
		else {
			return Float.MAX_VALUE;
		}
	}
	
	public Resultado getMelhorResultado(String medida) {
		float maiorResultado = 0.0f;
		int posicao = 0;
		boolean encontrou = false;

		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			for (int j = 0; j < 3 && this.resultado[i].getAvaliacoes(j) != null; j++) {
				if (this.resultado[i].getAvaliacoes(j).getMedida().getNome().equals(medida)) {
					if (this.resultado[i].getAvaliacoes(j).getValor() > maiorResultado) {
						maiorResultado = this.resultado[i].getAvaliacoes(j).getValor();
						posicao = i;
						encontrou = true;
					}
				}
			}
		}
		if (encontrou) {
			return this.resultado[posicao];
		}
		else {
			return null;
		}
	}

	public Resultado getMelhorResultadoPorAlgoritmo(String algoritmo, String medida) {
		float maiorResultado = 0.0f;
		int posicao = 0;
		boolean encontrou = false;

		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			for (int j = 0; j < 3 && this.resultado[i].getAvaliacoes(j) != null; j++) {
				if (this.resultado[i].getAvaliacoes(j).getMedida().getNome().equals(medida) && this.resultado[i].getNomeDoAlgoritmo().equals(algoritmo)) {
					if (this.resultado[i].getAvaliacoes(j).getValor() > maiorResultado) {
						maiorResultado = this.resultado[i].getAvaliacoes(j).getValor();
						posicao = i;
						encontrou = true;
					}
				}
			}
		}
		if (encontrou) {
			return this.resultado[posicao];
		}
		else {
			return null;
		}
	}

	public Resultado getMelhorResultadoPorDataset(String dataset, String medida) {
		float maiorResultado = 0.0f;
		int posicao = 0;
		boolean encontrou = false;

		for (int i = 0; i < this.resultado.length && this.resultado[i] != null; i++) {
			for (int j = 0; j < 3 && this.resultado[i].getAvaliacoes(j) != null; j++) {
				if (this.resultado[i].getAvaliacoes(j).getMedida().getNome().equals(medida) && this.resultado[i].getNomeDoDataset().equals(dataset)) {
					if (this.resultado[i].getAvaliacoes(j).getValor() > maiorResultado) {
						maiorResultado = this.resultado[i].getAvaliacoes(j).getValor();
						posicao = i;
						encontrou = true;
					}
				}
			}
		}
		if (encontrou) {
			return this.resultado[posicao];
		}
		else {
			return null;
		}
	}
}