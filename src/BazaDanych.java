import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BazaDanych 
{
	public BazaDanych()
	{
		
	}
	
	public void wczytaj(List lista) throws FileNotFoundException
	{
		File plik = new File("samochody.txt");
		Scanner wczytaj = new Scanner(plik);
		int ilePojazdow = Integer.parseInt(wczytaj.nextLine()); // Konwersja stringa na inta
		String marka, model;
		int pojemnosc, moc, iloscDrzwi;
		
		for (int i = 0;i < ilePojazdow;i++)
		{
			
		}
	}
	
	public void zapisz()
	{
		
	}
}
