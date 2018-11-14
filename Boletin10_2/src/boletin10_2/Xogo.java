/*
2- Programa o exercicio  anterior para xogar contra o ordenador . 
Para eso, o ordenador xenera un número aleatorio, entre 1 e 50 ,.
Este programa dará as seguintes pistas sobre lonxe que esté de adivinar o número :
Se a distancia entre o número a adivinar e o tecleado é maior de 20  “ moi lonxe “
Entre 10 e 20 , ambos incluidos,  lonxe
Maior de 10 e menor de 5  preto
Menor ou igual de 5  moi preto .  
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Xogo {

    private int numIntentos;
    private int num1;
    private int num2;

    public void xogo() {
        num1 = (int) (Math.random() * 50) + 1;
        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de intentos."));
        do {
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número que creas correcto"));
            if (Math.abs(num1 - num2) > 20) {
                JOptionPane.showMessageDialog(null, "moi lonxe");
            } else if (Math.abs(num1 - num2) >= 10) {
                JOptionPane.showMessageDialog(null, "lonxe");
            } else if (Math.abs(num1 - num2) > 5) {
                JOptionPane.showMessageDialog(null, "preto");
            } else if (Math.abs(num1 - num2)>0){
                JOptionPane.showMessageDialog(null, "moi preto");
            }else if(Math.abs(num1 - num2)==0){
            JOptionPane.showMessageDialog(null, "ADIVINASTE");
            break;
            }
            numIntentos = numIntentos - 1;
        } while (numIntentos != 0);
    }

}
