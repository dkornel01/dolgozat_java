
package vezerlo;

import model.Table;
import nezet.Nezet;


public abstract class Vezerlo {

    private Table modell;
    private Nezet nezet;
    public Vezerlo(Table modell,Nezet nezet ) {
        this.modell=modell;
        this.nezet=nezet;
        
    }
    
}
