/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicializar;

import com.formdev.flatlaf.FlatLightLaf;
import conexion.ConectarBD;

/**
 *
 * @author CHAPARRO
 */
public class Iniciar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlatLightLaf.setup();
        new BarraProgreso().setVisible(true);
        
    }
    
}
