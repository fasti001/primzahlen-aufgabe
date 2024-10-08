public class PrimzahlenConsumer
{

    Primzahlen meinePrimzahlen;
   
    public PrimzahlenConsumer(Primzahlen meinePrimzahlen)
    {
        this.meinePrimzahlen = meinePrimzahlen;	
    }
    
    
    public boolean istPrimzahl(int l)
    {
        while (meinePrimzahlen.ready < l) {
            try { Thread.sleep(1); } catch (InterruptedException e) {};
        }
        return meinePrimzahlen.isPrim(l);
    }
        

    public void printPrimzahlen()
    {
        int n = meinePrimzahlen.getLength();
        
        for (int j = 1; j <= n; j++)
        {
            if (meinePrimzahlen.isPrim(j))
            {
                System.out.print(j + " ");
            }
        }
    }     
}