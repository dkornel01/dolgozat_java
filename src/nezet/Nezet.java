package nezet;

public class Nezet {

    public Nezet() {
        
    }
    public void Megjelenito(String[][] T){
        for (int i=0;i<T.length;i++){
            for (int x=0;x<T.length;x++){
                System.out.print(T[i][x]);
            }
            System.out.println("");
        }
    }
    public void kiirás(String szoveg,int i){
        System.out.println(szoveg+" "+i);
    } 
    
}
