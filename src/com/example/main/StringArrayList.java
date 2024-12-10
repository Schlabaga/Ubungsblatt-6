package com.example.main;

import java.util.ArrayList;

public class StringArrayList {

    private ArrayList<String> arrayList;

    // Konstruktor
    public StringArrayList() {
        this.arrayList = new ArrayList<>();
    }

    // Methode zur Überprüfung eines gültigen Index
    boolean isValidIndex(int index) {
        if (index >= 0 && index < this.arrayList.size()) {
            return true;
        }
        System.out.println(index + ": Index not valid!");
        return false;
    }

    // Getter-Methode
    public String get(int index) {
        if (isValidIndex(index)) {
            return arrayList.get(index);
        }
        return "Get(" + index + "): Index out of range";
    }

    // Setter-Methode
    public void set(int index, String value) {
        if (isValidIndex(index)) {
            arrayList.set(index, value);
        }
    }

    // Methode zur Rückgabe der Größe
    public int size() {
        return this.arrayList.size();
    }

    // Entfernen eines Elements
    public void remove(int index) {
        if (isValidIndex(index)) {
            arrayList.remove(index);
        }
    }

    // Hinzufügen eines Elements
    public int add(String value) {
        arrayList.add(value);
        return arrayList.size() - 1; // Rückgabe des hinzugefügten Index
    }

    public boolean contains(String value){
        return this.arrayList.contains(value);
    }

    public void clear(){
        this.arrayList.clear();
    }

    public String[] toArray(){
        return this.arrayList.toArray(new String[0]);
    }

    public boolean isEmpty(){
        return this.arrayList.isEmpty();
    }

}