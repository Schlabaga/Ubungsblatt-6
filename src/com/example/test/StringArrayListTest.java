package com.example.test;

import com.example.main.StringArrayList;

public class StringArrayListTest {

    public static void main(String[] args) {
        // Test de la méthode add et size
        StringArrayList list = new StringArrayList();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.size()); // Doit afficher 2

        // Test de la méthode get
        System.out.println(list.get(0)); // Doit afficher "Apple"
        System.out.println(list.get(2)); // Doit afficher "Get(2): Index out of range"

        // Test de la méthode remove
        list.remove(1);
        System.out.println(list.size()); // Doit afficher 1

        // Test de la méthode contains
        System.out.println(list.contains("Apple")); // Doit afficher true
        System.out.println(list.contains("Banana")); // Doit afficher false

        // Test de la méthode clear
        list.clear();
        System.out.println(list.isEmpty()); // Doit afficher true
    }
}