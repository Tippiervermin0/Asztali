
package modell;


public class Konzerv extends Elelmiszer{
    String lejaras, receptajanlas;

    public Konzerv(String nev, String gyarto, String datum) throws KonzervException {
        super(nev, gyarto, datum);
    }

    public Konzerv(String lejaras, String nev, String gyarto, String datum) throws KonzervException {
        super(nev, gyarto, datum);
        this.lejaras = lejaras;
    }

    public Konzerv(String lejaras, String receptajanlas, String nev, String gyarto, String datum) throws KonzervException {
        super(nev, gyarto, datum);
        this.lejaras = lejaras;
        this.receptajanlas = receptajanlas;
    }

    @Override
    public String toString() {
        return "Konzerv{" + "lejaras=" + lejaras + ", receptajanlas=" + receptajanlas + '}';
    }

  
    
    
    
    
}
