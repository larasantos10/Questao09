/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01e0208;

/**
 *
 * @author Lara
 */
public class TestaAnimais {
    public static void main(String[] args) {
        Papagaio p = new Papagaio("Robin", true, "Lara Lara Lara");
        p.talk();
        p.imprime();

        Arara a = new Arara("Nana", true);
        a.talk();
        a.imprime();

        Cachorro c = new Cachorro("Tobbie", 3, true);
        c.talk();
        c.imprime();

        Vaca v = new Vaca("Mococa", 3, true);
        v.talk();
        v.imprime();


    }
}
