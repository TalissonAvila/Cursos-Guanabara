/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author talisson
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Digite seu ano de nascimento: ");
        Scanner scanner1 = new Scanner(System.in);
        int ano = scanner1.nextInt();
        int idade = 2022 - ano;
        System.out.println("Sua idade eh " + idade);
        if(idade >= 18){
            System.out.println("Voce eh maior de idade");
        }else{
            System.out.println("Voce nao eh maior de idade");
        }
    }
    
}
