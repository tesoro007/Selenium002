package Java;

import java.util.ArrayList;
import java.util.List;

public class Metodo3 {
	
	static String heredar ="Mensaje de texto";

	public List<String> listaDeNombres() {
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Alejandra");
		listaNombres.add("Sergio");
		listaNombres.add("Mike");
		listaNombres.add("Jose Luis");
		return listaNombres;
	}
	
	public List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(23);
		listaNumeros.add(34);
		listaNumeros.add(25);
		return listaNumeros;
}

}
