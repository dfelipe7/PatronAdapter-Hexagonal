package co.unicauca.adapter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Unicauca
 */

import java.util.Collection;
import java.util.Collections;

/**
 * Clase adaptadora que encapsula una colección mutable y la convierte en una colección no modificable.
 * Cualquier operación que intente modificar la colección lanzará una {@link UnsupportedOperationException}.
 *
 * @param <E> Tipo de elemento contenido en la colección.
 */
public class UnmodifiableCollectionAdapter<E> implements CustomCollection<E> {

    /**
     * Colección interna encapsulada, no modificable.
     */
    private final Collection<E> wrappedCollection;

    /**
     * Constructor que adapta una colección mutable a una colección no modificable.
     *
     * @param collection Colección mutable que será encapsulada.
     */
    public UnmodifiableCollectionAdapter(Collection<E> collection) {
        this.wrappedCollection = Collections.unmodifiableCollection(collection);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return wrappedCollection.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        return wrappedCollection.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean contains(E element) {
        return wrappedCollection.contains(element);
    }

    /**
     * Lanza una excepción ya que esta colección no permite modificaciones.
     *
     * @param element Elemento que se intenta agregar.
     * @throws UnsupportedOperationException Siempre lanza esta excepción.
     */
    @Override
    public void add(E element) {
        throw new UnsupportedOperationException("Esta colección es no modificable");
    }

    /**
     * Lanza una excepción ya que esta colección no permite modificaciones.
     *
     * @param element Elemento que se intenta eliminar.
     * @throws UnsupportedOperationException Siempre lanza esta excepción.
     */
    @Override
    public void remove(E element) {
        throw new UnsupportedOperationException("Esta colección es no modificable");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<E> getCollection() {
        return wrappedCollection;
    }
}
