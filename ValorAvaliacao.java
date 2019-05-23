public class ValorAvaliacao {
	private float valor;
	private MedidaAvaliacao medida = new MedidaAvaliacao();

	public ValorAvaliacao(MedidaAvaliacao medida) {
		valor = 0.0f;
		this.medida = medida;
	}

	public boolean setValor(float valor) {
		this.valor = valor;
		if (getMenorValor < valor < getMaiorValor){
			return true;
		}
		else {
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
