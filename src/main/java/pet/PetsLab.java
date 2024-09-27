package pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetsLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of pets: ");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Pets> petList = new ArrayList<>();

        for (int i = 0; i < numberOfPets; i++) {

            System.out.print("Enter the type of pet (Dog, Cat, Parrot, or other): ");
            String petType = scanner.nextLine();


            System.out.print("Enter the pet's name: ");
            String petName = scanner.nextLine();


            if (petType.equalsIgnoreCase("Dog")) {
                petList.add(new Dog(petName));
            } else if (petType.equalsIgnoreCase("Cat")) {
                petList.add(new Cat(petName));
            } else if (petType.equalsIgnoreCase("Parrot")) {
                petList.add(new Parrot(petName));
            }
        }

        System.out.println("Here are your pets and the sounds they make:");
        for (Pets pet : petList) {
            System.out.println(pet.getName() + " says " + pet.speak());

        }

        scanner.close();
    }

}