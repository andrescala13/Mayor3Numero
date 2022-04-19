/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor3numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Mayor3Numeros
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Declaraci+ón de variables
        
        int x, y, z, mayor;
        
        //Input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y: "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite z: "));
        
        //Processing
        if(x>y && x>z)
        {
            mayor= x;
        }    
        else if(y>x && y>z)
        {
            mayor = y;
        }
        else
        {
            mayor= z;
        }
     
        //Output
        JOptionPane.showMessageDialog(null, "El mayor es" + mayor, "12+1", JOptionPane.WARNING_MESSAGE);
        
        //End
        System.exit(0);
    }
    
}
