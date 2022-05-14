/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifce.maracanau.lista;

/**
 *
 * @author talisson
 */
public class Lista implements TADLista {
    
    private Integer[] lista;
    private int posicao;
    
    public Lista(){
        int tamanho = 0;
        lista =(Integer[]) new Object[tamanho];
        posicao = -1;
    }
    
    @Override
    public void insereValor(Integer valor, int indice) {
        //Realizar validacoes
        if(ListaCheia()){
            System.out.println("Lista Cheia! Valor '" + valor + "' nao inserido.");
            return;
        }
        //Verifica a validade do indice
        if(indice < 0 || indice > posicao + 1){
            System.out.println("Indice " + indice + " invalido. Valor " + valor + " nao inserido!");
            return;
        }
        
        //Desloca todos elementos iguais ou maiores que o indice uma posicao a direita
        for(int i = posicao; i >= indice; i--){
            lista[i+1] = lista[i];
        }
        lista[indice] = valor;
        posicao++;
     }

    @Override
    @SuppressWarnings("empty-statement")
    public Integer removeValor(int indice) {
        //Realiza validacoes
        if(listaVazia()){
            System.out.println("Lista Vazia.");
            return null;
        }
        //valida se o indice é valido
        if(indice < 0 || indice > posicao){
           System.out.println("indice invalido.");
           return null;
        }
        
        Integer valorRemovido = lista[indice];
        int i;
        
        //desloca todos os elementos posteriores ao indice uma posicao a esquerda
        for(int = i = indice; i < posicao; i++){
            lista[i] = lista[i + 1];
    }
        lista[posicao--] = null;
        return valorRemovido;
    }

    @Override
    public boolean listaCheia() {
        if(posicao == lista.length - 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean listaVazia() {
        if(posicao == -1){
            return true;
        }
        return false;
    }

    @Override
    public void imprimeLista() {
        if(listaVazia()){
            System.out.println("Lista vazia.");
            return;
        }
      for(int i = 0; i <= posicao; i++){
          System.out.print(lista[i] + "\t");
       }
      System.out.println("");
    }

    private boolean ListaCheia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
