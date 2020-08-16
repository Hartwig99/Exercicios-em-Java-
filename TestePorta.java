/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan Bissoto
 */
public class TestePorta {
    public static void main(String[] args) {
        Porta porta1 = new Porta();
        porta1.setCor("preto");
        porta1.setAltura(1);
        porta1.setLargura(2);
        System.out.println(porta1.getAltura());
        System.out.println(porta1.getLargura());
        porta1.abre();
        System.out.println(porta1.getCor());
        System.out.println(" a Porta está aberta ? "+porta1.isAberta());
        porta1.altera(0.50);
    }
}
