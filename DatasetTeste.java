public class DatasetTeste {
	public static void main(String[] args) {
		Dataset conjunto1 = new Dataset(10, 4, -2, "ABCDEFGHI JKLMNOPQ");
		Dataset conjunto2 = new Dataset(923, -5654, 23, "ABACATEGUACAMOLE");

		System.out.printf("Numero de exemplos: %d\n", conjunto1.getNumExemplos());
		System.out.printf("Numero de atributos: %d\n", conjunto1.getNumAtributos());
		System.out.printf("Numero de classes: %d\n", conjunto1.getNumClasses());
		System.out.printf("Nome: %s\n", conjunto1.getNome());
		System.out.println();
		System.out.printf("Numero de exemplos: %d\n", conjunto2.getNumExemplos());
		System.out.printf("Numero de atributos: %d\n", conjunto2.getNumAtributos());
		System.out.printf("Numero de classes: %d\n", conjunto2.getNumClasses());
		System.out.printf("Nome: %s\n", conjunto2.getNome());
	}
}