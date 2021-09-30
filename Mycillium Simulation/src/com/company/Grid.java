package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Grid {

    public static void initGrid(int Size)
    {
        if(Size % 2 == 1)
            Size++;

        boolean grid[][] = new boolean[Size][Size];

        for (int y = 0; y < Size; y++)
        {
            for (int x = 0; x < Size; x++)
            {
                if(x >= Size / 2)
                {
                    grid[x][y] = true;
                }
            }
        }

        updateGrid(Size, grid);
    }

    public static void updateGrid(int Size, boolean grid[][])
    {
        int oTally = 0;
        int xTally = 0;

        for (int y = 0; y < Size; y++) {

            System.out.println();

            for (int x = 0; x < Size; x++) {

                if(grid[x][y] == false)
                {
                    System.out.print("O ");
                    oTally++;
                }
                if(grid[x][y] == true)
                {
                    System.out.print("X ");
                    xTally++;
                }
            }
        }
        System.out.println();

        boolean winCondition = false;

        if(xTally == Size * Size || oTally == Size * Size)
            winCondition = true;

        pause(800);

        simulateGrid(winCondition, Size, grid);
    }

    public static void simulateGrid(boolean winCondition, int Size, boolean grid[][])
    {
        ArrayList<Integer> Position = new ArrayList<>();
        for (int i = 0; i < Size * Size; i++)
            Position.add(i);

        for (int i: Position)
        {
            int ranPos = getRandom(Position);
            int x = ranPos / Size;
            int y = ranPos % Size;

            int options = 0;
            int xInc = 1;
            int yInc = 0;

            while(options <= 3)
            {
                if(x + xInc >= 0 && x + xInc < Size && y + yInc >= 0 && y + yInc < Size)
                {
                    if (grid[x][y] != grid[x + xInc][y + yInc]) {
                        if (generateChance()) {
                            grid[x + xInc][y + yInc] = grid[x][y];
                        }
                    }
                }

                options++;
                if (options == 1)
                {
                    xInc = -1;
                    yInc = 0;
                }
                if (options == 2)
                {
                    xInc = 0;
                    yInc = 1;
                }
                if (options == 3)
                {
                    xInc = 0;
                    yInc = -1;
                }
            }


        }

        if(!winCondition)
        {
            updateGrid(Size, grid);
        }
        else
        {
            System.out.print("Simulation Complete Returning to Menu");
            Main.displayMenu();
        }


    }

    public static boolean generateChance()
    {
        boolean Success;
        double ran = Math.random();
        if (ran< 0.5)
            Success = true;
        else
            Success = false;

        return Success;
    }

    public static void pause(long timeInMilliSeconds) {

        long timestamp = System.currentTimeMillis();


        do {

        } while (System.currentTimeMillis() < timestamp + timeInMilliSeconds);

    }

    public static int getRandom(ArrayList<Integer> array) {
        int rnd = new Random().nextInt(array.size());
        return array.get(rnd);
    }
}
