
public class SukellusTankkiApp {

	public static void main(String[] args) {
		
		
		SukellusTankki sukellusTankki2 = new SukellusTankki("alumiini");
		sukellusTankki2.tulostaTiedot();
		
		
		SukellusTankki sukellusTankki3 = new SukellusTankki("teras", true);
		sukellusTankki3.tulostaTiedot();
		
		}		
	}



class SukellusTankki //class
{
	public boolean onAuki; 
	public String materiaali; 
	
	
	public SukellusTankki()  
	{
		materiaali=""; 
		onAuki=false; 
	}
	
	public SukellusTankki(String materiaali) 
	{
		onAuki=false; 
		this.materiaali = materiaali; //->luo uusi object 2
	}
	
	
		public SukellusTankki(String materiaali, boolean onAuki)//(parametrit)
		{
			this.onAuki=onAuki; 
			this.materiaali = materiaali;
		}
	
	
	
	
	public void avaa()
	{
		 onAuki = true;
	}
	
	public void sulje()  
	{
		onAuki = false;
	}
	

	public void tulostaTiedot() 
	
	{
		System.out.println("Sukellustankkisi tarkastus: ");
		System.out.println("Materiaali: " + materiaali);
		if (onAuki==true) 
		{
			System.out.println("Sukellustankkisi on auki, saat ilmaa.");
		}
		else
		{
			System.out.println("Sukellustankkisi on kiinni, et saa ilmaa");
		}
		
	}
	
}