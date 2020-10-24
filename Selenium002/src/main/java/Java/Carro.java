package Java;

public class Carro {

	public static void main(String[] args) {
		int numero1 = 3;
		int numero2 = 3;
		if (numero1 >= numero2) {

			if (numero1 == numero2) {
				System.out.println("El numero 1: " + numero1 + "numero 2:" + numero2 + "son iguales");

			} // end de mi if anidado

			else {

				System.out.println("El numero 1 es mayor: " + numero1 + "que el numero 2:" + numero2);
			}
		} // end

		else {
			System.out.println("El numero 2: " + numero2 + "es mayor que el numero 1:" + numero1);
		}
	}

}
