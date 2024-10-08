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
            n = sc.nextInt();;
            final var x = n;
            new Thread(() -> {
                if(x < MAXPRIM)
                {
                    if(pc.istPrimzahl(x))
                    {
                        System.out.println(x + " ist eine Primzahl");
                    }
                    else
                    {
                        System.out.println(x + " ist keine Primzahl");
                    }
                }
            }).start();
        }   
        while(n>0);
    }
}
    
