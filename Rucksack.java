public class Rucksack
{
   //Eigenschaften
   
    private String farbe;
    private int grosse;
    private boolean laptop;
    private int preis;
        
    //Constructor
    public Rucksack(String newFarbe, int newGrosse, boolean newLaptop, int newPreis)
    {
        setFarbe(newFarbe);
        setGrosse(newGrosse);
        setLaptop(newLaptop);
        setPreis(newPreis);
    }
    
    //set-Methoden
    public void setFarbe(String newFarbe)
    {
        farbe = newFarbe;
    }
    public void setGrosse(int newGrosse)
    {
        grosse = newGrosse;
    }
    public void setLaptop(boolean newLaptop)
    {
        laptop = newLaptop;
    }
    public void setPreis(int newPreis)
    {
        preis = newPreis;
    }
        
    //get-Methoden
    public String getFarbe()
    {
        return farbe;
    }
        public int getGrosse()
    {
        return grosse;
    }
    public boolean getLaptop()
    {
        return laptop;
    }
    public int getPreis()
    {
        return preis;
    }
    
    //Print
    public void printRucksack()
    {
        System.out.println("Die Farbe ist: " + farbe + ", die Größe: " + grosse + ", hat Platz für Laptop " + laptop + " und der Preis kostet " + preis + " Euro.");
    }
}