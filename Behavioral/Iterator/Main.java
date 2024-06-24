public class Main {
    
    public static void main(String[] args) {
        ShoppingCart<Product> cart = new ShoppingCart<Product>();
        cart.add(new Product("Apple", 0.99));
        cart.add(new Product("Banana", 0.59));
        cart.add(new Product("Orange", 0.79));
        cart.add(new Product("Grapes", 2.99));
        cart.add(new Product("Pineapple", 1.99));
        MyIterator<Product> iterator = cart.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
