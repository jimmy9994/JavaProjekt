
public class Samochod extends Pojazd
{
	private int iloscDrzwi;
	
	public Samochod()
	{
		super();
		iloscDrzwi = 0;
	}
	
	public Samochod(String marka, String model, int pojemnosc, int moc, int iloscDrzwi)
	{
		super(marka, model, pojemnosc, moc);
		this.iloscDrzwi = iloscDrzwi;
	}
	
	public void setIloscDrzwi(int iloscDrzwi)
	{
		this.iloscDrzwi = iloscDrzwi;
	}
	
	public int getIloscDrzwi()
	{
		return iloscDrzwi;
	}
	
	public static Samochod stworzSamochod(String marka, String model, int pojemnosc, int moc, int iloscDrzwi)
	{
		return new Samochod(marka, model, pojemnosc, moc, iloscDrzwi);
	}
	
}
