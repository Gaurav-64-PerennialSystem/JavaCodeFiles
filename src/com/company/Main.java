package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Gaurav", 10, 15);
        System.out.println(player.toString());
        saveObject(player);
        player.setHitPoints(8);
        System.out.println(player);
        player.setWeapon("strombringer");
        saveObject(player);
        loadObject(player);
        System.out.println(player);
    }
        public static ArrayList<String> readValues(){

        ArrayList<String> values = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choosen\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("choose an option:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = sc.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;

            }
        }return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+"to storage Device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String > values=readValues();
        objectToLoad.read(values);
    }
}
