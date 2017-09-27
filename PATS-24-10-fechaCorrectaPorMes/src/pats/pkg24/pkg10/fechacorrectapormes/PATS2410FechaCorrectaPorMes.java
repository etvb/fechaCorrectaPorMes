/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
 * Con meses de 28, 30, 31 días. Sin años bisiestos. 
 */
package pats.pkg24.pkg10.fechacorrectapormes;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS2410FechaCorrectaPorMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        short dia, mes, año;
        
        dia = Short.parseShort(JOptionPane.showInputDialog("Ingresa el DÍA"));
        mes = Short.parseShort(JOptionPane.showInputDialog("Ingresa el MES"));
        año = Short.parseShort(JOptionPane.showInputDialog("Ingresa el AÑO"));
       
        
        if((dia == 28) && (mes == 2) && (año > 0)){
            JOptionPane.showMessageDialog(null, "Fecha CORRECTA");
        }else if((dia ==31) && (año > 0)){
                if((mes == 1)||(mes == 3)||(mes == 5)||(mes == 7)||(mes == 8)||
                  (mes == 10)||(mes == 12)){
                    JOptionPane.showMessageDialog(null, "Fecha CORRECTA");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha INCORRECTA");    
                }
        }else if((dia > 0) && (dia <=30) && (mes !=2) && (año > 0)){ 
                    if((mes > 0) && (mes < 13)){
                        JOptionPane.showMessageDialog(null, "Fecha CORRECTA");
                    }else {
                        JOptionPane.showMessageDialog(null, "Fecha INCORRECTA");
                    }
        }else{
            JOptionPane.showMessageDialog(null, "Fecha INCORRECTA");
        }
    }
}
