package Java;

import javax.swing.JOptionPane;

public class Divisible {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Ingresa un numero");
		int numero = Integer.parseInt(texto);
		if (numero % 2 == 0) {
			System.out.println("El numero ingresado [" + numero + "] es divisible entre 2");

		} // end if

		else {
			System.out.println("El numero ingresado [" + numero + "] no es divisible entre 2");
		}

	}

}
