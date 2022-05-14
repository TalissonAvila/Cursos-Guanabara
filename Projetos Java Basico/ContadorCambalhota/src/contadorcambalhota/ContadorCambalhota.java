/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorcambalhota;

/**
 *
 * @author talisson
 */
public class ContadorCambalhota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cc = 0;
        while( cc < 10){
            cc++;
            if(cc == 5 || cc == 7){
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
