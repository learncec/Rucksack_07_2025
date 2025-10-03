public class Rucksack
{
   //Eigenschaften
    private String farbe;
    private int grosse;
    private boolean laptop;
    private int preis;
        
    //Constructor
    public Rucksack(String farbe, int grosse, boolean laptop, int preis)
    {
        setFarbe(farbe);
        setGrosse(grosse);
        setLaptop(laptop);
        setPreis(preis);
    }
    public Rucksack(String farbe, boolean laptop, int preis)
    {
        setFarbe(farbe);
        setGrosse(15);
        setLaptop(laptop);
        setPreis(preis);
           }
    public Rucksack()
    {
        setFarbe("Blau");
        setGrosse(20);
        setLaptop(true);
        setPreis(100);
    }
    
    //set-Methoden
    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }
    public void setGrosse(int grosse)
    {
        this.grosse = grosse;
    }
    public void setLaptop(boolean laptop)
    {
        this.laptop = laptop;
    }
    public void setPreis(int preis)
    {
        this.preis = preis;
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
    //ifAbfrage:Eigenschaft:laptop-es gibt Laptop, oder kein Laptop
    public void printRucksack()
    {
        if(laptop == true)
        {
        System.out.println("Die Farbe ist: " + farbe + ", die Größe: " + grosse + ", hat Platz für Laptop " + "und der Preis kostet " + preis + " Euro.");         
        }
        else{
        System.out.println("Die Farbe ist: " + farbe + ", die Größe: " + grosse + ", hat keinen Platz für Laptop " + ", der Preis kostet " + preis + " Euro.");
        }
    }
}