
public abstract class Pojazd 
{
	private String marka;
	private String model;
	private int pojemnosc;
	private int moc;
	
	public Pojazd()
	{
		marka="";
		model="";
		pojemnosc=0;
		moc=0;
	}
	
	public Pojazd(String marka, String model, int pojemnosc, int moc)
	{
		this.marka = marka;
		this.model = model;
		this.pojemnosc = pojemnosc;
		this.moc = moc;
	}
	
	public void setMarka(String marka)
	{
		this.marka = marka;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public void setPojemnosc(int pojemnosc)
	{
		this.pojemnosc = pojemnosc;
	}
	
	public void setMoc(int moc)
	{
		this.moc = moc;
	}
	
	public String getMarka()
	{
		return marka;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getPojemnoc()
	{
		return pojemnosc;
	}
	
	public int getMoc()
	{
		return moc;
	}
	
}
