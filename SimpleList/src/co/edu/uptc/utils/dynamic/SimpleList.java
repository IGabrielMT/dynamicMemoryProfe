package co.edu.uptc.utils.dynamic;

import java.util.*;

public class SimpleList<T> implements List<T> {
    Node<T> header;
    Node<T> tail;

    @Override
    public int size() {
        int i = 0;
        Node<T> aux = header;
        while(aux != null){
            i++;
            aux = aux.getNext();
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return header == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new SimpleListIterator();
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node<T> aux = header;
        int i = 0;
        while(aux != null){
            array[i++] = aux.getInfo();
            aux = aux.getNext();
        }
        return array;
    }

    @Override
    public boolean add(T o) {
        Node<T> newNode = new Node<>();
        newNode.setInfo(o);
        if (header == null) {
            header = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        Node<T> aux = header;
        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
        }
        return aux.getInfo();
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    private class SimpleListIterator implements Iterator<T> {
        private Node<T> current = header;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.getInfo();
            current = current.getNext();
            return data;
        }
    }
}