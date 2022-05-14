/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifce.maracanau.lista;

/**
 *
 * @author talisson
 */
public interface TADLista {
    //Metodos Principais
    public void insereValor(Integer valor, int indice);
    public Integer removeValor(int indice);
    
    //Metodos Secundarios
    public boolean listaCheia();
    public boolean listaVazia();
    
    public void imprimeLista();
    
}
