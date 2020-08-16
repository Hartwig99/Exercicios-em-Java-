
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan Bissoto
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("ivan \n ");
        p1.setIdade(17);
        System.out.println(p1.getNome()+ p1.fazaniverario ());
    }
}