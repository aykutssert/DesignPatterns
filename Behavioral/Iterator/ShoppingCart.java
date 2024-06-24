import java.util.ArrayList;

public class ShoppingCart<E> implements MyList<E> {

    private ArrayList<E> myArray;

    public ShoppingCart() {
        myArray = new ArrayList<E>();        
    }

    public void add(E e) {
        myArray.add(e);
    }
    public MyIterator<E> createIterator() {
        return new ShoppingCartIterator<E>(this);
    }
    public int size() {
        return myArray.size();
    }
    public E get(int index) {
        return myArray.get(index);
    }
}