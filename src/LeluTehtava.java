
public class LeluTehtava {

	public static void main(String[] args) {
		
		//TEEN LELU-AUTON, JOLLA PÄÄSEN KOVAA
		
		Lelu lelu = new Lelu("Saab", 5);
		lelu.tulostaTiedot();
		
		VieteriAuto vieteriAuto = new VieteriAuto("Audi", 10, 100);
		vieteriAuto.tulostaTiedot();
		
	
		

		}		
} //End of the Lelutehtava



class Lelu { //class
	
	public String nimi; 
	public int paino;
	
	
	//DEFAULT CONSTRUCTOR (EI ARVOJA)
	public Lelu()
	{
		nimi="";
		paino=0;
	}


	
	//PARAMETERIZED CONSTRUCTOR
	public Lelu(String nimi, int paino) 
	{
		this.nimi = nimi;
		this.paino = paino; //-> TEE OBJEKTI 2 TÄLLE YLÖS
	}
	

	
	
	public void tulostaTiedot() 
	{
		System.out.println("Nimi: " + nimi);
		System.out.println("Paino: " + paino + "kg");
		
	}
	
} //MONITOR CLASS ENDS HERE

//UUSI LUOKKA, JOKA PERII YLLÄOLEVAN:

class VieteriAuto extends Lelu
{
	public int nopeus;
	
	//DEFAULT CONSTRUCTOR
	public VieteriAuto() 
	{
		paino = 0; //SAMA KUIN YLLÄ OLEVASSA LUOKASSA, KOSKA CONSTRUCTORIT EI PERIYDY
		nimi = ""; 
		nopeus = 0; //UUSI ATTRIBUUTTI
	}
	
	//PARAMETHERIZED CONSTRUCTOR
	public VieteriAuto(String nimi, int paino, int nopeus)
	{
		this.nimi = nimi;
		this.paino = paino;
		this.nopeus = nopeus;
	}
	
	public void kiihdyta(int nopeus)
	{
		this.nopeus = nopeus;
		nopeus = nopeus++;
	}
	
	
	@Override  
	public void tulostaTiedot()
	{    
super.tulostaTiedot();
		//LISÄKSI TÄMÄ:
		System.out.println("Nopeus: " + nopeus + "km/h");
	}	
}
