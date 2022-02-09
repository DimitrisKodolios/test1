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
public class Kostas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        skilos giwrgos = new skilos(10, "mavros" ,30,4);
        giwrgos.onoma();
        giwrgos.na_milisei();
        giwrgos.dilwse_autia(2);
        giwrgos.dilwse_matia(2);
        // TODO code application logic here
   
        int k = giwrgos.getMATIAAPOSKILO();
        System.out.println("TA MATIA:" + k);
        int t = giwrgos.autia;
        int r = t+k;
        System.out.println("to a8roima einai: "+ r);
        
        gata eleni = new gata();
        eleni.autia = 2;
        eleni.podia = 4;
        eleni.baros = 6;
        eleni.xwrma = "mauro";
        
        int w = eleni.podia;
        int q = eleni.autia;
        int o = w+q;
        int n = o+giwrgos.autia+giwrgos.podia;
        System.out.println("to a8roima einai: " + eleni.autia+giwrgos.autia);
        
    
    
    
    
    }
    
}
