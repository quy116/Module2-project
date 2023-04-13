package ss10_danh_sach_java.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void TangKichThuocArr() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            TangKichThuocArr();
        }
        elements[size++] = e;
    }

    public E getIndex(int index) {
        if (index>=size || index < 0 ) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }
    public Object remove(int index) {
        if (index  >= 0 && index < size){
            for (int i = index; i < size; i++) {
                elements[i] = elements[i+1];
            }
            --size;
        }
        return (E) elements[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
