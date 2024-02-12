
package dolgozat;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.Table;
import nezet.FajlKiiras;
import nezet.Nezet;
import vezerlo.FájlKiirasKonzolra;
import vezerlo.KonzolosVezerlo;
import vezerlo.Vezerlo;

public class Dolgozat {


    public static void main(String[] args) throws IOException {
        new Dolgozat().run();
    }
    public void run() throws IOException{
        Table table=new Table("#");
        Nezet nezet=new Nezet();
        table.Elhelyez(8);
        KonzolosVezerlo vez=new KonzolosVezerlo(table,nezet);
        vez.tabla_kiiras();
        vez.uresOsszealitó();
        kiirasFájlba();
       
    }
    public void kiirasFájlba() throws IOException{
        File myObj = new File("tabla64.txt");
        FileWriter myWriter = new FileWriter("table64.txt");
        for (int i=0;i<64;i++) {
            Table table=new Table("*");
            FajlKiiras nezet=new FajlKiiras();
            table.Elhelyez(8);
            FájlKiirasKonzolra vez=new FájlKiirasKonzolra(table,nezet);
            String[] tarto=vez.FajlMegjelenito().split(";");
            for (int x=0;x<tarto.length;x++){
                myWriter.write(tarto[x]);
            }
            myWriter.write(vez.OszlopUresOsszealitó());
            myWriter.write(vez.SorUresOsszealitó());
        }
        
    }
    
}
