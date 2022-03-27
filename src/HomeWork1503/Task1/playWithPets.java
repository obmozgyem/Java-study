package HomeWork1503.Task1;
//1. Написать класс Человек, у которого есть поле "питомец". Питомцы бывают 3х видов: Котик, Собачка и Рыбка.
//        Каждый питомец умеет играть, но делают они это по-разному.
//        Котик мяукает, Собака лает и прыгает,
//        Рыбка плавает по кругу.
//        Описать у человека метод, который позволяет играть со своим питомцем,
//        и метод, который позволяет играть с любым питомцем.


public class playWithPets {
    public static void main(String[] args) {
        // техн. вопрос когда делаешь сеторы\геторы и конструктов, автоматом делается сверху, как сделать чтобы добавллялось ниже
        Pet barsik = new Cat("Barsik");
        Pet gavriil = new Dog("Gavriil");
        Pet plotva = new Fish("Plotva");
        Human human1 = new Human("Petr", barsik);
        Human human2 = new Human("Ivan",gavriil);
        Human human3 = new Human("Igor",plotva);
        human1.play();
        human2.play();
        human3.play();
        System.out.println();
        human2.play(human3.getPet());
        human1.play(human2.getPet());
        human3.play(human1.getPet());


//        human.play("", " ");
//        Cat cat = new Cat("Cat ", " ");
//        Dog dog = new Dog( "Dog " , " ");
//        Fish fish = new Fish("fish ", " ");
//        cat.play(" ", " ");
//        fish.play(" ", " ");
//        dog.play( " ", " ");
//


    }
}
