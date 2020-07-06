/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6ques2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Desafio6ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int cont, cod, quant, acRato, acCoelho;
      acRato = 0; 
      acCoelho = 0;
      for (cont = 1;cont <= 5;cont++){
      cod = Integer.parseInt(JOptionPane.showInputDialog("Escolha\n"
              +"1 - ratos\n" 
              +"2 - coelhos\n"
              +"digite:"));
             if (cod == 1){
                 quant = Integer.parseInt(JOptionPane.showInputDialog("quantos ratos?)"));
             acRato = acRato + quant;
             } else if (cod == 2){
                 quant = Integer.parseInt(JOptionPane.showInputDialog("quantos coelhos?"));
             acCoelho = acCoelho + quant;
             }else {
                 JOptionPane.showMessageDialog(null, "codigo invalido, apenas 1 ou 2" 
                    + "-tente novamente");
    }
    }
      JOptionPane.showMessageDialog(null, "em "+(cont-1)+" experiências"
               + " foram usadis "+acRato+"ratos e "+acCoelho+" coelhos");
    }
}