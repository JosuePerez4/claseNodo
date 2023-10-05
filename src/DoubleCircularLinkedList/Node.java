package DoubleCircularLinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Node <E>{
    
    private E datos;
    private Node <E> siguiente;
    private Node <E> anterior;
    
	public Node(E ele) {
		datos = ele;
	}
	
	public E getDatos() {
		return datos;
	}
	public void setDatos(E datos) {
		this.datos = datos;
	}
	public Node<E> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Node<E> siguiente) {
		this.siguiente = siguiente;
	}
	public Node<E> getAnterior() {
		return anterior;
	}
	public void setAnterior(Node<E> anterior) {
		this.anterior = anterior;
	}
}
