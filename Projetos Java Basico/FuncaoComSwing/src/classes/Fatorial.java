/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author talisson
 */
public class Fatorial {
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void setValor(int n){
        numero = n;
        int f = 1;
        String s = "";
        for(int contador = n; contador > 1;contador--){
            f *= contador;
            s += contador + " x ";
        }
        s += "1 = ";
        fatorial = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fatorial;
    }
    
    public String getFormula(){
        return formula;
    }
}
