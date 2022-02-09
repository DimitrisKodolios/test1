/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostas;

/**
 *
 * @author ELLINIKIfeta
 */
public class skilos extends animals {
    public int podia;
    public int autia;
    private int matia;
    
    public skilos(int ilikia, String xrwma, int baros, int podia)
    {
     super.ilikia = ilikia;
     super.xwrma = xrwma;
     super.baros = baros;
     this.podia = podia;
    }
    
    public int getMATIAAPOSKILO(){
    return this.matia;
    }
    
            
            
            
    public void dilwse_autia (int x){
    this.autia = x;
    }
    
   public void dilwse_matia (int y){
    this.matia = y;
    }
   
   public void setDILWSETAMATIA(int y){
   this.matia=y;}
   
    public void onoma()
    {
        System.out.println("...");
    }
}
