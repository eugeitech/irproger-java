package com.itproger.ujsn.table;

public class Multivariate {

//    []
//    [ [], [] ]
//    [ [ [], [] ], [ [], [] ] ]

    public static void main(String[] args) {
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        int[][] nums = new int [][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        nums[1][1] = 67;
        System.out.println("Table 1: " + nums[2][2]);


        for(int i = 0; i < nums.length; i++) {
            for (int n = 0; n < nums.length; n++) {
                System.out.println(nums[i][n]);
            }
        }
    }
}
