package Java;

public class Metodo2 {
	
	int num1,num2;
	
	public Metodo2(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public Metodo2() {// Constructor

	}

	public static void main(String[] args) {
		
	}

	public void mostrarMensaje() {// Metodo tipo void no nos regresa nada

		System.out.println("Hola Mundo");
	}

	public int sumatoria() {// Metodo tipo int, nos regresa valor entero

		int sumatoria = num1 + num2;
		return sumatoria;

	}

	public String mostrarNombre(String Nombre) {// Metodo String
		System.out.println(Nombre);
		return Nombre;

	}

}
