package com.sda.kolekcje;
// robimy arejlistę
public class MeinList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public Object[] getElements() {
        return elements;
    }

    public MeinList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T element) {
        if (size == elements.length) {
            growBigger();
        }
        elements[size++] = element;

    }

    void growBigger() {
        Object[] nowaLista = new Object[elements.length *2];
        for (int i = 0; i < elements.length; i++) {
            nowaLista[i] = elements[i];
        }
        elements = nowaLista;

    }
}
