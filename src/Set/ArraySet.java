package Set;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySet<E extends Comparable<E>> implements Set<E>{

    private Array array;

    @Override
    public void add(E e) {
//        array = new Array();
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
