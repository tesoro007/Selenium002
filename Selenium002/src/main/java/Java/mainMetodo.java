package Java;

import java.util.List;

public class mainMetodo extends Metodo3 {//Clase instanciada de Metodo2

	public static void main(String[] args) {
		Metodo2 nombreObjeto = new Metodo2();// Valores llamados de mi construtor
		Metodo2 nombreObjeto2 = new Metodo2(9,3);// Valores llamados de mi construtor
		Metodo3 objeto= new Metodo3();

		System.out.println(nombreObjeto.sumatoria());// panalla de mi constructor
		System.out.println(nombreObjeto2.sumatoria());
		
		System.out.println(heredar);
		
		List<String> listaNombres= objeto.listaDeNombres();
		List<Integer> listaNumeros= objeto.listaNumeros();
		
		for(String Nombre: listaNombres) {
			System.out.println(Nombre);
			System.out.println("For con dos puntos");
			
		}
		
		for (int indice= 0; indice<listaNombres.size(); indice++) {
			System.out.println(listaNombres.get(indice));
			
		}
		
		System.out.println("For con index");
		

	}

}
