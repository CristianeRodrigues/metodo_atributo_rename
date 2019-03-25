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
public class A {
    float codigoA;
    B ClassB;
    
   public float getCodigoA() {
        return this.codigoA;
    }

   public void dependencia(){
       int codigo = ClassB.getCodigoB();
       ClassB.codigoB = 200;
   }
    public void setCodigoA(float codigoA) {
        this.codigoA = codigoA;
    }  
}
