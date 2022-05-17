
package modell;




public abstract class Elelmiszer {
    
    private String nev, gyarto, datum;

    public Elelmiszer(String nev, String gyarto, String datum) {
        this.nev = nev;
        this.gyarto = gyarto;
        this.datum = datum;
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }

    @Override
    public String toString() {
        return "Elelmiszer{" + "nev=" + nev + ", gyarto=" + gyarto + ", datum=" + datum + '}';
    }
    
    
}
