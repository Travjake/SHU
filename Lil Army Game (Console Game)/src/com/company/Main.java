package com.company;

public class Main {

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        System.out.print("\nLil Army Simulation Game\n By Travis Chapple, SHU\n\nLets get started Input the size of the battlefield: ");
        Grid.initGrid(input.userInt());
    }
}
