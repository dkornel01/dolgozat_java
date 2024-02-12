/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import model.Table;
import nezet.Nezet;

/**
 *
 * @author Dobrocsi Kornél
 */
public class KonzolosVezerlo extends Vezerlo{

    private Table modell;
    private Nezet nezet;
    public KonzolosVezerlo(Table modell,Nezet nezet) {
        super(modell, nezet);
        this.modell=modell;
        this.nezet=nezet;

    }

    public void tabla_kiiras(){
        nezet.Megjelenito(modell.getT());
    }
    public void uresOsszealitó(){
    int i=modell.ÜresOszlopokSzáma();
    int x=modell.ÜresSorokSzáma();
    nezet.kiirás("oszlopk:", x);
    nezet.kiirás("sorok:", i);
    }
    

    
    
}
