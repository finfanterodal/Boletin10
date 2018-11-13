/*
 *1- Codifica un programa que permita o seguinte xogo  para adiviñar un número .
 *O primeiro xogador  teclea ( utilizando a clase JoptionPane ), 
 *un número a adiviñar ( entre 1 e 50 ) e o número máximo de intentos que ten 
 *o segundo xogador para dar con el . O programa irá sacando por pantaia mensaxes
 *que orienten o segundo xogador sobre se o número tecleado e maior ou menor que o número a adiviñar . 
 *Fai o programa repetitivo.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Xogo {

    private int num1;
    private int num2;
    private int numIntentos;

    public void xogo() {

        do {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero a adiviñar."));
        } while (num1 < 1 || num1 > 50);
        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de intentos."));
        do {
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número que creas correcto"));
                if (num2>num1) {
                    JOptionPane.showMessageDialog(null,"O número é menor");
                } else if(num2<num1){
                   JOptionPane.showMessageDialog(null,"O número é maior"); 
                }else{
                    JOptionPane.showMessageDialog(null,"ADIVINASTE"); 
                }
                numIntentos=-1;
        } while (num2!=num1||numIntentos!=0);
    }

}
