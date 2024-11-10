package co.unicauca.adapter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Unicauca
 */

import java.util.Collection;

/**
 * Interfaz que define las operaciones básicas de una colección.
 * Esta interfaz permite operaciones de lectura y escritura, 
 * aunque las implementaciones específicas pueden restringir ciertas operaciones.
 *
 * @param <E> Tipo de elemento contenido en la colección.
 */
public interface CustomCollection<E> {

    /**
     * Retorna el número de elementos en la colección.
     *
     * @return Número de elementos en la colección.
     */
    int size();

    /**
     * Indica si la colección está vacía.
     *
     * @return {@code true} si la colección no contiene elementos, {@code false} en caso contrario.
     */
    boolean isEmpty();

    /**
     * Verifica si la colección contiene un elemento específico.
     *
     * @param element Elemento que se desea verificar.
     * @return {@code true} si el elemento está en la colección, {@code false} en caso contrario.
     */
    boolean contains(E element);

    /**
     * Agrega un elemento a la colección.
     * Este método puede ser sobrescrito para lanzar una excepción en colecciones no modificables.
     *
     * @param element Elemento que se desea agregar.
     */
    void add(E element);

    /**
     * Elimina un elemento de la colección.
     * Este método puede ser sobrescrito para lanzar una excepción en colecciones no modificables.
     *
     * @param element Elemento que se desea eliminar.
     */
    void remove(E element);

    /**
     * Retorna la colección interna encapsulada.
     *
     * @return La colección interna.
     */
    Collection<E> getCollection();
}
