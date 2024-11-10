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
 * Clase de utilidad que proporciona métodos para trabajar con colecciones.
 */
public class CollectionUtils {

    /**
     * Convierte una colección mutable en una colección no modificable.
     *
     * @param collection Colección mutable que será adaptada.
     * @param <E> Tipo de elemento contenido en la colección.
     * @return Una instancia de {@link UnmodifiableCollectionAdapter} que encapsula la colección.
     */
    public static <E> CustomCollection<E> unmodifiableCollection(Collection<E> collection) {
        return new UnmodifiableCollectionAdapter<>(collection);
    }
}
