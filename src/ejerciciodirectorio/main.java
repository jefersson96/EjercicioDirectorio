/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodirectorio;

/**
 *
 * @author jefersson
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Directorio raiz=new Directorio(" Principal ",200,"publicos",null);
        raiz.addCarpeta(new Directorio("sub",200,"privados",null));
       raiz.addCarpeta(new Directorio("sub2",200,"privados",null));
        raiz.Prueba();
    }
    
}
