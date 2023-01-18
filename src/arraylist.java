import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		lista.add("Ana");
		lista.add("Pepe");
		lista.add(1);
		
		System.out.println(lista);

		lista.add("Cata");
		
		System.out.println(lista);
		System.out.println((Integer)lista.get(2)+9);
		System.out.println(lista.size());
		
		
		
	}

}
