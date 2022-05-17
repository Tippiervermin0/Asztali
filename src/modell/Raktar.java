
package modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Raktar implements Serializable, Iterable<Elelmiszer>{
    
    private ArrayList<Elelmiszer> elelmiszerek;

    public Raktar() {
        this.elelmiszerek = elelmiszerek;
    }
    
    public List<Elelmiszer> getModosithatatlan() {
        return Collections.unmodifiableList(elelmiszerek);
    }
    
    public void felvesz(Elelmiszer elelmiszer){
        elelmiszerek.add(elelmiszer);
    }

    @Override
    public Iterator<Elelmiszer> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
