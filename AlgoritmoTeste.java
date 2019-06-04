import java.util.Arrays;

public class AlgoritmoTeste {
	public static void main(String[] args) {
		float [] parametros = {1.7523f, 0.0f, 923.19f};
		Algoritmo algoritmo = new Algoritmo("ALGORITMO TESTE", parametros);
		
		System.out.printf("Nome: %s\n", algoritmo.getNome());
		System.out.println("Parametros: " + Arrays.toString(algoritmo.getParametros()));
	}
}