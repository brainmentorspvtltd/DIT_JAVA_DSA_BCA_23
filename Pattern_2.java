package ControlFlow;

public class Pattern_2 {
    public static void main(String[] args) {
    //      *
    //     **
    //    ***
    //   ****
    //  *****
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5-i; j++) {
            System.out.print(" ");
        }
        for(int k = 0; k < i+1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("=======================");

    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5-i; j++) {
            System.out.print(" ");
        }
        for(int k = 0; k < i+1; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    System.out.println("=======================");

    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5-i; j++) {
            System.out.print(" ");
        }
        for(int k = 0; k < 2*i+1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }

    }
}
