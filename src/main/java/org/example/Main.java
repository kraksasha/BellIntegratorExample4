package org.example;

public class Main {
    public static void main(String[] args) {
        int massive[][] = new int[4][4];
        for (int i = 0; i < massive.length; i++){
            for (int j = 0; j < massive.length; j++){
                if (i == 0 || i == 3 || (i != 0 && j == 0) || (i != 0 && j == 3)){
                    massive[i][j] = 1;
                }
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int massive2[][] = new int[6][6];
        for (int i = 0; i < massive2.length; i++){
            for (int j = 0; j < massive2.length; j++){
                if (i == 0 || i == 5 || (i != 0 && j == 0) || (i != 0 && j == 5)){
                    massive2[i][j] = 2;
                } else if (i == 1 || i == 4 || (i != 1 && j == 1) || (i != 1 && j == 4)){
                    massive2[i][j] = 1;
                }
                System.out.print(massive2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int massive3[][] = new int[8][8];
        for (int i = 0; i < massive3.length; i++){
            for (int j = 0; j < massive3.length; j++){
                if (i == 0 || i == 7 || (i != 0 && j == 0) || (i != 0 && j == 7)){
                    massive3[i][j] = 3;
                } else if (i == 1 || i == 6 || (i != 1 && j == 1) || (i != 1 && j == 6)){
                    massive3[i][j] = 2;
                } else if (i == 2 || i == 5 || (i != 1 && j == 2) || (i != 1 && j == 5)){
                    massive3[i][j] = 1;
                }
                System.out.print(massive3[i][j] + " ");
            }
            System.out.println();
        }
    }
}