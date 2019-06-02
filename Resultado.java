public class Resultado{

	private Algoritmo algoritmo;
	private Dataset dataset;
	private ValorAvaliacao [] avaliacao;

	public Resultado(Algoritmo algoritmo, Dataset dataset){
		
		this.algoritmo = algoritmo;

		this.dataset = dataset;

		avaliacao = new ValorAvaliacao[3];

	}

	public Algoritmo getAlgoritmo(){

		return algoritmo;
	}

	public Dataset getDataset(){
	
		return dataset;
	}

	public String getNomeDoAlgoritmo(){
		String nome;

		nome = this.algoritmo.getNome();
		return nome;
	}

	public String getNomeDoDataset(){
		String nome;

		nome = this.dataset.getNome();
		return nome;
	}

	public boolean addAvaliacao(ValorAvaliacao avaliacao){

		int posicao = 0; 
		boolean verif = false, vazio = false;

		//- avaliar se ha espaço em "this.avaliacao[]"
		for(int i = 0; i < 3; i++){

			if(this.avaliacao[i].getMedida() == null){
				vazio = true;
				posicao = i;
			}
			else {
				vazio = false;
			}	
		}

		if(vazio == false){
			verif = false;
		}
		else{
		//- avaliar se medida avaliacao do atributo (this.avaliacao[]) é igual a medida do parametro
				for(int j = 0; j < 3; j++){
					if(this.avaliacao[j].getMedida() != avaliacao.getMedida()){
						verif = true;
					}
					else{
						verif = false;
					}
				}		
				
		//- alocar a avaliacao(parametro) no vetor(atributo), retornar o valor e exibir mensagem.

				if(verif == true){
					this.avaliacao[posicao] = avaliacao;
					return verif;
				}
				else{			
					System.out.println("Não foi possivel alocar esta avaliacao. Nao existe espaco disponivel ou esta medida de avaliacao ja existe no vetor.");
					return verif; 
				}
		}
			
	}

	public ValorAvaliacao[] getAvaliacoes(){
		return avaliacao;
	}

	public ValorAvaliacao getAvaliacaoPorMedida(String medida){	
	//variavel verif ira verificar a existencia de um objeto com a mesma medida de avaliacao
	boolean verif = false;
	MedidaAvaliacao medidaParaComparar;
	ValorAvaliacao avaliacaoMesmaMedida = new ValorAvaliacao();	
	//- Pelo nome da medida eu recebo o valor que essa "medida" guarda ou nao no vetor.
	
	for(int i = 0; i < 3; i++){
		medidaParaComparar = this.avaliacao[i].getMedida();

		if(medida.equalsIgnoreCase(medidaParaComparar.getNome())){
			avaliacaoMesmaMedida = this.avaliacao[i];
			verif = true;

		}
		else{
			verif = false;
		}
	}

	if(verif == true){
		return avaliacaoMesmaMedida;
	}
	else{
		return null;		
	}
	

	
		
	}

}
