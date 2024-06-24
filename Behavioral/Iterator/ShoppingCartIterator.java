public class ShoppingCartIterator<E> implements MyIterator<E>{
    private ShoppingCart<E> cart;
    private int index = 0;
    public ShoppingCartIterator(ShoppingCart<E> cart) {
        this.cart = cart;
    }

    @Override
    public boolean hasNext() {
        if (index < cart.size()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public E next() {
        if (this.hasNext()) {
            return cart.get(index++);
        }
        else {
            return null;
        }
    }

    @Override
    public E currentItem() {
        return cart.get(index);
    }

    @Override
    public void first() {
        index = 0;
    }
}
