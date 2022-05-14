/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author talisson
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1, nota2, media;
        
        System.out.println("Digite a nota 1: ");
        Scanner scanner1 = new Scanner(System.in);
        nota1 = scanner1.nextFloat();
        System.out.println("Digite a nota 2: ");
        Scanner scanner2 = new Scanner(System.in);
        nota2 = scanner2.nextFloat();
        media = (nota1 + nota2) / 2;
        System.out.print("Media =  " + media + ".");
        if(media > 9){
            System.out.println("Parabens!");
        } else System.out.println("");
        
        
    }
    
}
