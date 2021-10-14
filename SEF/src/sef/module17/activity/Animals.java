package sef.module17.activity;

import jdk.internal.jimage.ImageStrings;

import java.util.ArrayList;

public class Animals {

    private ArrayList<String> special = new ArrayList<>();

// color which is String

    private String color;

    //Create a constructor which will add "Dog", "Cat", "Mouse" to Array List

    public Animals(ImageStrings species) {
        species.add("Dog");
        species.add("Cat");
        species.add("Mouse");
    }
//Create getters and setters for color

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

//    public void setSpecies(String species) {
//        this.species.add(species);
//    }

//    public String getSpecies(int index) {
//        return species.get(index);
//    }
//
//    public String getColorAndSpecies(String color, int index) {
//        return "Animals species is: " + this.species.get(index) + " and color is: " + color;
//    }
//
//    public ArrayList<String> getSpecies() {
//        return species;
//    }
//}


