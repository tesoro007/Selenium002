package Java;

import javax.swing.JOptionPane;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = JOptionPane.showInputDialog("Ingresa Radio");
		double radio = Double.parseDouble(valor);
		double area = Math.PI * Math.pow(radio, 2);

		JOptionPane.showMessageDialog(null, "El area  del circulo es:" + area);

	}

}
  