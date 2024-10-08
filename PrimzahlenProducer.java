public class PrimzahlenProducer extends Thread
{
    boolean prim[];
    long ready = 0;
    Primzahlen meinePrimzahlen;


    public PrimzahlenProducer(Primzahlen meinePrimzahlen) {
        this.meinePrimzahlen = meinePrimzahlen;
    }

    @Override
    public void run() {
        int n = meinePrimzahlen.getLength()-1;

        // Alle Zahlen von 1 bis n aufschreiben
        for (int j = 1; j <= n; j++)
        {

           meinePrimzahlen.setPrim(j); 
           // Jedes Feldelement wird erst einmal auf wahr (= Primzahl) gesetzt
        }
         
        // 1 ist keine Primzahl
        meinePrimzahlen.setNonPrim(1); 
        meinePrimzahlen.setReady(1); 
    	System.out.println("Primzahlen bis " + 1 + " verfuegbar");
   
        for (int i = 2; i * i <= n; i++)
        {
           	
           if (meinePrimzahlen.isPrim(i)) // not durchgestrichen(i)
           {
               // durchstreichenVielfaches(i)
               for (int j = 2*i; j <= n; j = j+i)
               {
                   meinePrimzahlen.setNonPrim(j); 
               }
           }
           meinePrimzahlen.setReady(i); 
    	   System.out.println("Primzahlen bis " + i + " verfuegbar");
           try {
               this.sleep(1000);
           } catch (InterruptedException e) {

           }
        }
        meinePrimzahlen.setReady(n); 
    	System.out.println("Primzahlen bis " + n + " verfuegbar");

   } //eo-Konstruktor
   
}