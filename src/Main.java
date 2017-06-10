import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException
	{
		List<Samochod> lista = new ArrayList<>();
		
		BazaDanych b = new BazaDanych();
		b.wczytaj(lista);
	}

}
