
package vezerlo;

import model.Table;
import nezet.FajlKiiras;
import nezet.Nezet;


public class FájlKiirasKonzolra {
    
    private Table modell;
    private FajlKiiras nezet;
    
    public FájlKiirasKonzolra(Table modell,FajlKiiras nezet) {
        this.modell=modell;
        this.nezet=nezet;
    }
    public String FajlMegjelenito(){
        return this.nezet.FajlMegjelenito(modell.getT());
        
    }
    public String SorUresOsszealitó(){
            int i=modell.ÜresOszlopokSzáma();
            return nezet.Fajlkiirás("sorok:", i);
    }
    public String OszlopUresOsszealitó(){
            int x=modell.ÜresSorokSzáma();
            return nezet.Fajlkiirás("oszlop:", x);
    }
}
