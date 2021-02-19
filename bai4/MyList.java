package bai4;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity){
        elements = new Object[capacity];
    }

    public int size(){
        return size;
    }
    public void add(int index, E element){
        size++;
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            if(i < index){
                temp[i] = (E) elements[i];
            }else if(i == index){
                temp[i] = element;
            }else{
                temp[i] = (E) elements[i-1];
            }
        }
        elements = temp;
    }

    public void remove(int index){
        size--;
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            if(i < index){
                temp[i] = elements[i];
            }else if(i > index){
                temp[i] = elements[i+1];
            }
        }
        elements = temp;
    }

    public boolean contains(E obj){
        for(int i = 0; i < size; i++){
            if(elements[i] == obj){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E obj){
        for (int i = 0; i < size; i++) {
            if(elements[i] == obj){
                return i;
            }
        }
        return -1;
    }

    boolean add(E e){
        add(size, e);
        return true;
    }

    public E get(int i){
        if(i < 0 || i>= size){
            throw new IndexOutOfBoundsException("not exit");
        }
        return (E) elements[i];
    }

    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]+" ");
        }
        System.out.println("");
    }
}
