public class ValorAvaliacao {
	private float valor;
	private MedidaAvaliacao medida;

	public ValorAvaliacao(MedidaAvaliacao medida) {
		valor = 0.0f;
		this.medida = medida;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public MedidaAvaliacao getMedida() {
		return medida;
	}
}