
public class Algoritmo {
	private String nome;
	private float [] parametros = new float[3];
	
	public Algoritmo(String nome, float parametros[]) { 
		this.nome = nome;

		for (int i = 0; i < 3; i++) {
			if (parametros[i] == 0.0f) {
				this.parametros[i] = Float.MAX_VALUE;			
			} else {
				this.parametros[i] = parametros[i];
			}			
		}		
	}

	public String getNome() {
		return nome;
	}

	public float [] getParametros() {
		return parametros;
	}
}
