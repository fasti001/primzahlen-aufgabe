import java.util.Scanner;



public class PrimzahlenMain
{

    public static final int MAXPRIM = 1000000;
    
    public static void main(String[] args)
    {
  
        int n;
        Primzahlen meinePrimzahlen = new Primzahlen(MAXPRIM);
        Scanner sc = new Scanner(System.in);

        PrimzahlenConsumer pc = new PrimzahlenConsumer(meinePrimzahlen); 
        PrimzahlenProducer pp = new PrimzahlenProducer(meinePrimzahlen);
        pp.start();
        do
        {
            // Einlesen einer Zahl
            n = sc.nextInt();
            if(n<MAXPRIM)
            {
                if(pc.istPrimzahl(n))
                { 
                    System.out.println(n + " ist eine Primzahl");
                }
                else
                { 
                    System.out.println(n + " ist keine Primzahl");
                }
            }
        }   
        while(n>0);
    }
}
    
