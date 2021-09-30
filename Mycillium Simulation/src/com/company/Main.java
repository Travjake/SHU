package com.company;

public class Main {

    public static void main(String[] args) {
	displayMenu();
    }

    public static void displayMenu(){
        System.out.print("\nPatch Simulation\n By Travis Chapple, SHU\n\nLets get started Input the size of the grid you would like: ");
        int gridSize = inputHandle.userInt();
        Grid.initGrid(gridSize);

        inputHandle.clearConsole();
        displayMenu();
    }

}
