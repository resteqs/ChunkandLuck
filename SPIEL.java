
public class SPIEL //Verwaltet das Spiel
{
    private int einsatz;
    private int gesetzteZahl;
    private int reingewinn;
    private int auszahlung;
    private int gewinne;
    WUERFEL wuerfel1;
    WUERFEL wuerfel2; 
    WUERFEL wuerfel3;
    public SPIEL()
    {
    wuerfel1 = new WUERFEL();
    wuerfel2 = new WUERFEL();
    wuerfel3 = new WUERFEL();
    gewinne = 0;
    }
    public void Brain(int einsatz, int gesetzteZahl) //Berechnet die Gewinne, Auszahlung und Reingewinn
    {
        if(gesetzteZahl == wuerfel1.ZahlAusgeben()) 
        {
            gewinne++;
        }
        if(gesetzteZahl == wuerfel2.ZahlAusgeben()) 
        {
            gewinne++;
        }
        if(gesetzteZahl == wuerfel3.ZahlAusgeben()) 
        {
            gewinne++;
        }
        
        auszahlung = einsatz * gewinne;
        reingewinn = auszahlung - einsatz;
        Konsole();
    }
    public void Konsole() //Gibt die Werte in er Konsole aus
    {
        System.out.println(wuerfel1.ZahlAusgeben());
        System.out.println(wuerfel2.ZahlAusgeben());
        System.out.println(wuerfel3.ZahlAusgeben());
        System.out.print("Auszahlung: " + auszahlung);
        System.out.print("Reingewinn: " + reingewinn);
    }
} 
