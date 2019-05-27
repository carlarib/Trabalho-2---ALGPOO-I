public class ValorAvaliacao {
	private float valor;
	private MedidaAvaliacao medida = new MedidaAvaliacao("TESTE", 6.34f, 896.12f);

	public ValorAvaliacao(MedidaAvaliacao medida) {
		valor = 0.0f;
		this.medida = medida;
	}

	/*
	public boolean setValor(float valor) {
		this.valor = valor;
		if (getMenorValor < valor < getMaiorValor){
			return true;
		}
		else {
			return false;
		}
	}
	*/

	public float getValor() {
		return valor;
	}

	public MedidaAvaliacao getMedida() {
		return medida;
	}
}
