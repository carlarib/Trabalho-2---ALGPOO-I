public class ValorAvaliacao {
	private float valor;
	private MedidaAvaliacao medida;
	
	public ValorAvaliacao(MedidaAvaliacao medida) {
		valor = 0.0f;
		this.medida = medida;
		this.valor = valor;
	}
	
	public boolean setValor(float valor) {
		if (valor > medida.getMenorValor() && valor < medida.getMaiorValor()){
			this.valor = valor;
			return true;
		}
		else {
			System.out.println("Atribuição impossível");
			return false;
		}
	}
	
	public float getValor() {
		return valor;
	}

	public MedidaAvaliacao getMedida() {
		return medida;
	}
}