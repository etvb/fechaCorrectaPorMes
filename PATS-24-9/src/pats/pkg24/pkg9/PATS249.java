/*
 *Ejercicio 9: Pedir el día, mes y año de una feha e indicar si la fecha es 
 *correcta. Suponiendo que todos los meses son de 30 días..
 */
package pats.pkg24.pkg9;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS249 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        short dia, mes, año;
        
        dia = Short.parseShort(JOptionPane.showInputDialog("Ingresa el DÍA"));
        mes = Short.parseShort(JOptionPane.showInputDialog("Ingresa el MES"));
        año = Short.parseShort(JOptionPane.showInputDialog("Ingresa el AÑO"));
        
        if((dia > 0)&&(dia <= 30)){
            if((mes > 0)&&(mes <= 12)){
                if(año > 0){
                    JOptionPane.showMessageDialog(null, "Fecha CORRECTA :-) ");   
                }else{
                    JOptionPane.showMessageDialog(null, "año INCORRECTO");
                }
            }else{
                JOptionPane.showMessageDialog(null, "mes INCORRECTO");
            }
        }else{
            JOptionPane.showMessageDialog(null, "día INCORRECTO");
        }
        
        
    }
    
}
