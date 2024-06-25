## Singleton Design Pattern

Singleton design pattern is a software design pattern that aims to have only one instance of a class and provide a global access point to that instance. Singleton is used especially for applications where a single instance is needed, such as configuration settings, connection pools, log managers.

### Basic Principles of Singleton Design Pattern

1. Preventing the creation of objects from outside the class by using a private constructor.
2. Using a static method to access an instance of the class (getter).
3. Using a static variable to store a single instance. (static instance)

### Singleton Pattern Usage Areas

- Configuration Settings: Managing the settings to be used throughout the entire application from a central location.
- Connection Pools: Management of limited resources such as database connections.
- Log Managers: Providing a common logging mechanism throughout the entire application.
- Cache: Managing the data kept in memory from a central location.

### Implementing the Singleton Pattern in Java

1. Basit Singleton (Eager Initialization):

   - The object is created while loading the class.
   - It is an easy and thread-safe method, but since the object is created immediately, its use is not always preferred.

   ```
       public class Singleton {
           private static final Singleton instance = new Singleton();

           // Özel yapıcı (constructor)
           private Singleton() {}

           public static Singleton getInstance() {
               return instance;
           }

           public void showMessage() {
               System.out.println("Hello World!");
           }
       }

   ```

2. Lazy Initialization Singleton:

   - The object is created only when it is needed.
   - It may cause problems in multi-thread environments, so it should be made thread-safe.

   ```
   public class Singleton {
       private static Singleton instance;

       private Singleton() {}

       public static Singleton getInstance() {
           if (instance == null) {
               instance = new Singleton();
           }
           return instance;
       }

       public void showMessage() {
           System.out.println("Hello World!");
       }
   }

   ```

3. Thread-Safe Singleton:

   - It is made thread-safe by using the synchronized keyword together with Lazy Initialization.
   - In terms of performance, synchronized might slow it down a bit.

   ```
   public class Singleton {
        private static Singleton instance;

        private Singleton() {}

        public static synchronized Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Hello World!");
        }
    }

   ```

4. Double-Checked Locking Singleton:

   - Provides thread-safe and better performance.
   - It takes both synchronized and performance concerns into account.

   ```
   public class Singleton {
       private static volatile Singleton instance;

       private Singleton() {}

       public static Singleton getInstance() {
           if (instance == null) {
               synchronized (Singleton.class) {
                   if (instance == null) {
                       instance = new Singleton();
                   }
               }
           }
           return instance;
       }

       public void showMessage() {
           System.out.println("Hello World!");
       }
   }

   ```

5. Bill Pugh Singleton Design:

   - Thread-safe and lazy initialization is provided by using the inner static helper class.
   - It is one of the most recommended methods.

   ```
   public class Singleton {
        private Singleton() {}

        private static class SingletonHelper {
            private static final Singleton INSTANCE = new Singleton();
        }

        public static Singleton getInstance() {
            return SingletonHelper.INSTANCE;
        }

        public void showMessage() {
            System.out.println("Hello World!");
        }
    }

   ```

   ```
    Bill Pugh Working Mechanism
        - When the Singleton class is loaded for the first time, the SingletonHelper class is not loaded yet.
        - When the getInstance() method is called, the SingletonHelper class is loaded and the INSTANCE variable is created.
        - This class loading process is performed in a thread-safe manner by Java's class loading mechanism. This ensures thread safety during the creation and initialization of the INSTANCE variable.
   ```

   #### Usage

   ```
   public class Main {
        public static void main(String[] args) {
            // Singleton nesnesine erişim
            Singleton singleObject = Singleton.getInstance();

            // Singleton metotunu kullanma
            singleObject.showMessage();
        }
    }

   ```
