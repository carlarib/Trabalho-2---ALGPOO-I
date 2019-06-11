public class Experimento {
	private int dia;
	private int mes;
	private int ano;
	private Resultado [] resultado;

	public Experimento(int dia,int mes,int ano) {
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
	
}