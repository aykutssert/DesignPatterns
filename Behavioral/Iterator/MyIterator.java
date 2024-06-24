public interface MyIterator<E> {

    public boolean hasNext();
    public E next();
    public E currentItem();
    public void first();
}