
public class Menu 
{
	public void pokazMenu()
	{
		System.out.println("SALON MOTORYZACYJNY");
		System.out.println("1. Przegladaj");
			// 1.1 Usun 
			// 1.2 Edytuj
		System.out.println("2. Dodaj");
		System.out.println("3. Zapisz baze");
		System.out.println("4. Wczytaj baze");
		System.out.println("5. Wyszukaj");
			// Wedlug parametru
		System.out.println("6. Posortuj");
			// Wedlug parametru
		System.out.println("7. Wyjscie");
	}
	
	public int wybierzOpcje(int opcja)
	{
		switch(opcja)
		{
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		default:
			System.out.println("Opcja ktora wybrales jest niedostepna! Sproboj ponownie.");
		}
		return opcja;
	}
	
}
