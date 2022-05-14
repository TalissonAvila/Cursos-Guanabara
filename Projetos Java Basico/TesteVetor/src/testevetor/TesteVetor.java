/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testevetor;

import java.util.Scanner;

/**
 *
 * @author talisson
 */
public class TesteVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        int TamVetor;
        
        System.out.println("Informe o tamanho do vetor:");
        TamVetor = entrada.nextInt();
        System.out.println("");
         int[] VetorLista = new int[TamVetor]; 
         
        for(int add = 0; add < TamVetor; add++){
            Scanner posicaovetor = new Scanner(System.in);
          System.out.println("Informe o valor da posicao "+ add + " do vetor");
          VetorLista[add] = posicaovetor.nextInt();
        }
        //while(boolean teste == 1){
        
        Scanner removeposicao = new Scanner(System.in);
        int remove;
        System.out.println("Qual indice do vetor voce deseja remover?");
        remove = removeposicao.nextInt();
        VetorLista[remove] = 0;
        //}
        
        
        System.out.println("");
        for(int i = 0; i < VetorLista.length; i++){
            System.out.println("Posicao " + i + ": " + VetorLista[i]);
        }
        
        Scanner buscaposicao = new Scanner(System.in);
        int busca;
        System.out.println("Qual indice do vetor voce deseja mostrar?");
        busca = buscaposicao.nextInt();
        System.out.println("");
        System.out.println("O indice '" + busca + "' do vetor : " + VetorLista[busca]);
    }
    
}
