package com.dev.homework1;

public class Cat implements Animal{
    String animalName;

    public Cat(String animalName){
        this.animalName = animalName;
    }

    @Override
    public String makeSound() {
        return "miau miau";
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
