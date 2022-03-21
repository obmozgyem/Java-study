package Archive.HomeWork0203.third;

public class Main {
    public static void main(String[] args) {
        Dogs dog1= new Dogs("Dana", 16   , "white with black", "female" );
        System.out.println(dog1.toString());
        System.out.println();
        Dogs mike = new Mike("mike",7, "chocolate", "male", "Bobruisk");
        Dogs palm = new Palm("palm", 5,"spotted", "female", "village", 4);
        System.out.println(mike.toString());
        System.out.println();
        System.out.println();
        System.out.println(palm.getAge() + palm.getDogName());
        dog1.eat("soup", "");
        mike.eat("meat", "");

    }
}
