/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;


public class Table {
    private String[][] T;
    private String Ürescella;
    private Random rnd=new Random();

    public Table(String Ürescella) {
        this.Ürescella = Ürescella;
        T=new String[8][8];
        for (int i=0;i<T.length;i++){
            for (int x=0;x<T.length;x++){
                T[i][x]=Ürescella;
            }
        }
        this.T=T;
    }

    public void setT(String[][] T) {
        this.T = T;
    }
    
    public void Elhelyez(int N){
        int x=0;
        int y=0;
        for (int i=0;i<N;i++){
            do{
                x=rnd.nextInt(0,8);
                y=rnd.nextInt(0,8);
            }while(T[x][y]!=Ürescella);
        this.T[x][y]="K";
        }
    }
    public boolean ÜresOszlop(int i){
        boolean ures=true;
        for (int x=0;x<T.length;x++){
            if (T[i][x]=="K"){
                ures=false;
            }
        }
        return ures;
    }
    public boolean ÜresSor(int i){
        boolean ures=true;
        for (int x=0;x<T.length;x++){
            if (T[x][i]=="K"){
                ures=false;
            }
        }
        return ures;
    }
    public int ÜresOszlopokSzáma(){
    int szamlalo=0;
    for (int k=0;k<T.length;k++){
            boolean ures=true;
        for (int x=0;x<T.length;x++){
            if (T[k][x]=="K"){
                ures=false;
            }
        }
        if (ures==true){
            szamlalo+=1;
        }
        ures=true;
    }
    return szamlalo;
    }
    public int ÜresSorokSzáma(){
    int szamlalo=0;
    for (int k=0;k<T.length;k++){
        boolean ures=true;
        for (int x=0;x<T.length;x++){
            if (T[x][k]=="K"){
                ures=false;
            }
        }
        if (ures==true){
            szamlalo+=1;
        }
        ures=true;
    }
    return szamlalo;
    }

    public String[][] getT() {
        return T;
    }
     public String Megjelenito(){
        String meg="";
        for (int i=0;i<this.T.length;i++){
            for (int x=0;x<this.T.length;x++){
                meg+=this.T[i][x];
            }
            meg+=";";
        }
        return meg;
    }
    
}
