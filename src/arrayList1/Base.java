
package arrayList1;

import java.util.ArrayList;

public class Base {

	public static void main(String[] args)
	{
		ArrayList lista = new ArrayList();
		
		for(int i = 0;i < 5; i++)
		{
			lista.add(i*2);
		}
		
		int[] tab = new int[5];
		
		for (int i = 0; i < lista.size(); i++)
		{
			System.out.print(lista.get(i) + "\t\t");
			tab[i] = (int) lista.get(i);
			System.out.println(tab[i]);
		}
		
		System.out.println(lista.toString());
		lista.add(3, 999);
		System.out.println("Po dodaniu 999 pod indeksem 3" + lista.toString());
		System.out.println("Liczba elementow:" + lista.size());
		
		lista.set(3, 888);
		System.out.println("Po ustawieniu 888 pod indeksem 3"+ lista.toString());
		
		lista.remove(2);
		System.out.println("usuniecie elementu z indeksem 2"+ lista.toString());
		
		if( lista.contains(888))
			System.out.println("Jest 888");
		
		lista.clear();
		System.out.println("Usuniecie WSZYSTKICH elementow z listy"+ lista.toString());
	}
}
