package co.unicauca.adapter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Unicauca
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal para demostrar el uso de la clase adaptadora.
 */
public class Main {
    public static void main(String[] args) {
        // Colección mutable original
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Elemento 1");
        mutableList.add("Elemento 2");

        // Adaptar la colección a una colección no modificable
        CustomCollection<String> unmodifiableCollection = CollectionUtils.unmodifiableCollection(mutableList);

        // Operaciones permitidas
        System.out.println("Tamaño: " + unmodifiableCollection.size());
        System.out.println("Contiene 'Elemento 1': " + unmodifiableCollection.contains("Elemento 1"));

        // Intentar modificar la colección (lanzará una excepción)
        try {
            unmodifiableCollection.add("Nuevo Elemento");
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}

