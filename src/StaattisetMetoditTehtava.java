
import java.util.Scanner;

public class StaattisetMetoditTehtava {

public static void main(String[] args) {
	

//TULOSTAA PINTA-ALAN
System.out.println(Laskuri.laskePintaAla(2, 5));
//TULOSTAA YMPYRÄN PINTA-ALAN
System.out.println(Laskuri.laskePintaAla(3));

}

}

class Laskuri
{

public static int laskePintaAla(int pituus, int leveys)
{
return pituus*leveys;
}


public static double laskePintaAla(double sade)
{
return 2*Math.PI*sade;

}
}
