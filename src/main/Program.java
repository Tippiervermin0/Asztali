
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modell.Elelmiszer;
import modell.Konzerv;
import modell.KonzervException;
import modell.Raktar;


public class Program {

   
    public static void main(String[] args) throws KonzervException, IOException {
        
        Raktar r = new Raktar();

        r.felvesz(new Konzerv("Bab", "XYZ","2022-04-20"));
        r.felvesz(new Konzerv("Borsó", "XYZ","2023-04-10"));
        r.felvesz(new Konzerv("Savanyúság", "PKK","2032-06-20"));
        r.felvesz(new Konzerv("Eper", "TTT","2024-01-00"));
        
        kiir(r);
        
        mentes(r);
        
        r=null;
        
        r = betoltes();
        
        kiir(r);
        
    }
    
    public static void kiir(Raktar r) {
        for (Elelmiszer el : r) {
            System.out.println(el);
        }
    }
    
    public static void mentes(Raktar r) throws IOException {
        try {
            FileOutputStream fajlKi = new FileOutputStream("raktar.bin");
            ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(r);
            objKi.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
     public static Raktar betoltes() {
        Raktar r = null;
        try {
            r = (Raktar) new ObjectInputStream(new FileInputStream("raktar.bin")).readObject();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        } finally {
            return r;
        }
    }
    
}
