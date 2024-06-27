public class Main {
    
    public static void main(String[] args) {


        
        PersonNotContainPattern p1 = new PersonNotContainPattern("1234", "Metin", null, 35, 1);
        PersonNotContainPattern p2 = new PersonNotContainPattern(null, "Metin", "Yilmaz", null, null);
        PersonNotContainPattern p3 = new PersonNotContainPattern(null, null, "Yilmaz", null, null);
        PersonNotContainPattern p4 = new PersonNotContainPattern(null, "Metin","Yilmaz", 35, null);

        /*
            When creating an object, we pass objects that we do not want to value as null. 
                In this case, as the number of parameters increases, readability will decrease. 
                    The probability of error will increase. If the same class had twenty parameters, the examples would be as follows. 
        */


        // ----------> PersonNotContainPattern p5 = new PersonNotContainPattern(“1234”, “Metin”, null, 35, 1, “Ankara”, null, 12, 55, 126, null, null, “Sakarya”, “112233”, null, null, 12, null, null, 55);


        
        PersonContainPattern person = new PersonContainPattern.Builder()
                                    .identityNumber("12345")
                                    .name("Metin")
                                    .surname("Alnıaçık")
                                    .age(35)
                                    .gender(1)
                                    .build();

        System.out.println(person);
       
    }
}
