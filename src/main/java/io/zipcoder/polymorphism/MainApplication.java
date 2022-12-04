package io.zipcoder.polymorphism;

import pets.Cat;
import pets.Dog;
import pets.Hamster;
import pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int numberOfPets = scanner.nextInt();
        ArrayList<Pet> petList = new ArrayList<Pet>();
        for(int i = 0; i < numberOfPets; i++) {
            System.out.println("What type is pet number "+ (i + 1));
            String petType = scanner.next();
            if (petType.equalsIgnoreCase("Dog")) {
                Dog dog = new Dog();
                petList.add(dog);
            }
            if (petType.equalsIgnoreCase("Cat")) {
                Cat cat = new Cat();
                petList.add(cat);
            }
            if (petType.equalsIgnoreCase("Hamster")) {
                Hamster hamster = new Hamster();
                petList.add(hamster);
            }
        }
        for (int i = 0; i < petList.size(); i++) {
            System.out.println("Pet number "+ (i + 1) + " is a " + petList.get(i).getClass().getSimpleName() + " it says " + petList.get(i).speak());
        }
    }
}
