/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_atributo_rename;

/**
 *
 * @author Cristiane
 */
public class Beta {

    float codigoB;
    A ClassA;

    public float getCodigoB() {
        System.out.println("codigo B");
        return this.codigoB;
    }

    public void setCodigoB(float codigoB) {
        this.codigoB = codigoB;
    }

    public void dependenciaB() {
        this.codigoB = ClassA.codigoA;
        System.out.println("dependenciaB");
    }

    public void outradependenciaB() {
        System.out.println("outra dependenciaB");
    }
}
