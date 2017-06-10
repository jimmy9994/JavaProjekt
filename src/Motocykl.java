
public class Motocykl extends Pojazd
{
	private int przyspieszenie;
	
	public Motocykl()
	{
		super();
		przyspieszenie = 0;
	}
	
	public Motocykl(String marka, String model, int pojemnosc, int moc, int przyspieszenie)
	{
		super(model, marka, pojemnosc, moc);
		this.przyspieszenie = przyspieszenie;
	}
	
	public void setPrzyspieszenie(int przyspieszenie)
	{
		this.przyspieszenie = przyspieszenie;
	}
	
	public int getPrzyspieszenie()
	{
		return przyspieszenie;
	}
}
