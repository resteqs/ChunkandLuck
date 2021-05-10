import java.util.Random;
public class WUERFEL 
{
    private int zahl;
    public WUERFEL()
    {
     Wuerfeln();

    }
    public void Wuerfeln() //erzäugt eine zufällige Zahl
    {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(6) +1;
        zahl = rand_int1;
    }
    public int ZahlAusgeben() //Gibt eine Zahl aus
    {
        return zahl;
    }
}
