package HomeWork1503.Task1;
//1. Написать класс Человек, у которого есть поле "питомец". Питомцы бывают 3х видов: Котик, Собачка и Рыбка.
//        Каждый питомец умеет играть, но делают они это по-разному.
//        Котик мяукает, Собака лает и прыгает,
//        Рыбка плавает по кругу.
//        Описать у человека метод, который позволяет играть со своим питомцем,
//        и метод, который позволяет играть с любаым питомцем.

public class Human {

    private String name;
    private Pet pet;

    public Human(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Human() {

    }

    public void play() {
        System.out.println(this.name + " is playing with his OWN pet " + this.pet.getName() + ":" + this.pet.play());

    }

    public void play(Pet pet) {
        System.out.println(this.name + " is playing with his ANY pet " + pet.getName() + ":" + pet.play());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


//
//    }
//    public void play() {
//        System.out.println(this.name + " is playing with his own pets " + this.pet );
//
//    }


//    public Human(String pet, String reaction) {
//        this.pet = pet;
//        this.reaction = reaction;
//    }
//
//    public void play(String pet, String reaction) {
//        System.out.println(this.pet + this.reaction);
//    }


}









