/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Dobrocsi Kornél
 */
public class FajlKiiras {

    public FajlKiiras() {
    }
    
     public String FajlMegjelenito(String[][] T){
                String meg="";
        for (int i=0;i<T.length;i++){
            for (int x=0;x<T.length;x++){
                meg+=T[i][x];
            }
            meg+=";";
        }
        return meg;
    }
    public String Fajlkiirás(String szoveg,int i){
        return szoveg+" "+i;
    }; 
}
