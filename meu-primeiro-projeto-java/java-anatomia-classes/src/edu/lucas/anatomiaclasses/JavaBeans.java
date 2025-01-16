package edu.lucas.anatomiaclasses;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaBeans {
    
    public static void main(String[] args) {
        
        //Writing definition for variables
        //InputedData
        String firstName = "";
        String lastName = "";
        int age = 0;
        double height = 0.0;
        String email = "";
        String adressCity = "";
        String adressStreet = "";
        String adressNeighborhood = "";
        String academicLevel = "";
        ArrayList<String> gender = new ArrayList<>(Arrays.asList("Male", "Female", "Other"));
        System.out.println(gender);

        for (int i = 0; i < gender.size(); i += 1) {
            System.out.println("The gender is "+ gender.get(i));
        }

    };

    public static String completeName (String firstName, String secondName) {
            return "The complete name is "+ firstName.concat(" ").concat(secondName);
    }

    String fullName = completeName(firstName, lastName);
}