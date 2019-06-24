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
public class Cachorro extends Mamifero{

    private boolean late;

    public Cachorro (String n, int p, boolean l){
        super(n, p);
        setLate(late);
    }

    public boolean isLate(){
        return late;
    }

    public void setLate(boolean l){
        this.late = l;
    }

    public void talk(){
        System.out.println("Au au");
    }


}
