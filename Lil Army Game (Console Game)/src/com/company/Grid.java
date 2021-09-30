package com.company;

public class Grid {
    public static void initGrid(int Size)
    {
        if(Size % 3 != 0)
            Size = Size + (3 - (Size % 3));

        Integer grid[][] = new Integer[Size][Size];
        for (int y = 0; y < Size; y++)
        {
            for (int x = 0; x < Size; x++)
            {
                grid[x][y] = 0;
            }
        }
        drawGrid(grid);
        userPlacement(grid);
    }

    public static void drawGrid(Integer grid[][])
    {
        System.out.println();
        System.out.println();
        for (int i = 0; i < grid.length; i++) {
            if(i == 0)
                System.out.print("         (" + (i + 1) + ")");
            if(i > 0 && i < 10)
                System.out.print("  (" + (i + 1) + ")");
            if(i >= 10 && i <100)
                System.out.print(" (" + (i + 1) + ")");

            if(i == grid.length - 1) {
                System.out.println();
                System.out.println();
            }
        }

        for (int y = 0; y < grid.length; y++)
        {
            if(y >= 0 && y < 9)
                System.out.print("    (" + (y + 1) + ")   ");
            if(y >= 9 && y <100)
                System.out.print("   (" + (y + 1) + ")   ");

            for (int x = 0; x < grid.length; x++)
            {
                if(grid[x][y] == 0)
                {
                    System.out.print("O    ");
                }
                else if(grid[x][y] == 1)//Red Infantry
                {
                    System.out.print(colourSelect.RED + "I    ");
                    System.out.print(colourSelect.RESET);
                }
                else if(grid[x][y] == 2)//Blue Infantry
                {
                    System.out.print(colourSelect.BLUE + "I    ");
                    System.out.print(colourSelect.RESET);
                }
                else if(grid[x][y] == 3)//Red Tank
                {
                    System.out.print(colourSelect.RED + "T    ");
                    System.out.print(colourSelect.RESET);
                }
                else if(grid[x][y] == 4)//Blue Tank
                {
                    System.out.print(colourSelect.BLUE + "T    ");
                    System.out.print(colourSelect.RESET);
                }
                else if(grid[x][y] == 5)//Red Artillery
                {
                    System.out.print(colourSelect.RED + "A    ");
                    System.out.print(colourSelect.RESET);
                }
                else if(grid[x][y] == 6)//Blue Artillery
                {
                    System.out.print(colourSelect.BLUE + "A    ");
                    System.out.print(colourSelect.RESET);
                }
                else if(grid[x][y] == 7)//Red Plane
                {
                    System.out.print(colourSelect.RED + "P    ");
                    System.out.print(colourSelect.RESET);
                }
                else if(grid[x][y] == 8)//Blue Plane
                {
                    System.out.print(colourSelect.BLUE + "P    ");
                    System.out.print(colourSelect.RESET);
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void userPlacement(Integer grid[][])
    {
        int xCoor;
        int yCoor;
        int totalredInfantry = grid.length;
        int totalblueInfantry = grid.length;
        int totalredPlanes = grid.length / 3;
        int totalbluePlanes = grid.length / 3;
        int totalredTanks = grid.length / 3;
        int totalblueTanks = grid.length / 3;
        int totalredArtillery = grid.length / 3;
        int totalblueArtillery = grid.length / 3;

        System.out.println("Red has " + totalredInfantry + " Infantry, " + totalredTanks + " Tanks, " + totalredPlanes + " Planes and " +totalredArtillery+ " Artillery");
        System.out.println("Blue has " + totalblueInfantry + " Infantry, " + totalblueTanks + " Tanks, " + totalbluePlanes + " Planes and " +totalblueArtillery+ " Artillery");

        System.out.print("Red you First, ");
        while(totalredArtillery > 0)
        {
            while(totalredPlanes > 0)
            {
                while(totalredTanks > 0)
                {
                    while(totalredInfantry > 0)
                    {
                        System.out.print("\nWhere would you like to place your infantry (XCoor): ");
                        xCoor = input.userInt() - 1;
                        System.out.print("Now the YCoor Please: ");
                        yCoor = input.userInt() - 1;
                        grid[xCoor][yCoor] = 1;
                        totalredInfantry--;
                    }
                    System.out.print("\nWhere would you like to place your Tanks (XCoor): ");
                    xCoor = input.userInt() - 1;
                    System.out.print("Now the YCoor Please: ");
                    yCoor = input.userInt() - 1;
                    grid[xCoor][yCoor] = 3;
                    totalredTanks--;
                }
                System.out.print("\nWhere would you like to place your Planes (XCoor): ");
                xCoor = input.userInt() - 1;
                System.out.print("Now the YCoor Please: ");
                yCoor = input.userInt() - 1;
                grid[xCoor][yCoor] = 7;
                totalredPlanes--;
            }
            System.out.print("\nWhere would you like to place your Artillery (XCoor): ");
            xCoor = input.userInt() - 1;
            System.out.print("Now the YCoor Please: ");
            yCoor = input.userInt() - 1;
            grid[xCoor][yCoor] = 5;
            totalredArtillery--;
        }
        drawGrid(grid);

        System.out.print("Next up Blue, ");
        while(totalblueArtillery > 0)
        {
            while(totalbluePlanes > 0)
            {
                while(totalblueTanks > 0)
                {
                    while(totalblueInfantry > 0)
                    {
                        System.out.print("\nWhere would you like to place your infantry (XCoor): ");
                        xCoor = input.userInt() - 1;
                        System.out.print("Now the YCoor Please: ");
                        yCoor = input.userInt() - 1;
                        grid[xCoor][yCoor] = 1;
                        totalblueInfantry--;
                    }
                    System.out.print("\nWhere would you like to place your Tanks (XCoor): ");
                    xCoor = input.userInt() - 1;
                    System.out.print("Now the YCoor Please: ");
                    yCoor = input.userInt() - 1;
                    grid[xCoor][yCoor] = 3;
                    totalblueTanks--;
                }
                System.out.print("\nWhere would you like to place your Planes (XCoor): ");
                xCoor = input.userInt() - 1;
                System.out.print("Now the YCoor Please: ");
                yCoor = input.userInt() - 1;
                grid[xCoor][yCoor] = 7;
                totalbluePlanes--;
            }
            System.out.print("\nWhere would you like to place your Artillery (XCoor): ");
            xCoor = input.userInt() - 1;
            System.out.print("Now the YCoor Please: ");
            yCoor = input.userInt() - 1;
            grid[xCoor][yCoor] = 5;
            totalblueArtillery--;
        }
        drawGrid(grid);
    }
}
