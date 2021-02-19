package bai2;

import java.util.Arrays;

public class List<E> {
    private int size =0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public List(){
        element = new Object[DEFAULT_CAPACITY];
    }

    private void increaseSize(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element,newSize);
    }

    public void add(E e){
        if(size == element.length){
            increaseSize();
        }
        element[size++] = e;
    }

    public E get(int i){
        if(i < 0 || i > size - 1){
            throw new IndexOutOfBoundsException("index " + i);
        }else{
            return (E) element[i];
        }
    }
}

