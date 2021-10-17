package com.problem.solving.Array;

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.
Example, Input --> [2, 0, 2]
        #   #
        # _ #
        2 0 2
        Output --> 2 units
*/

public class TappingRainWater {

    static int rainWater(int[] wallStructure) {
        int arrLength = wallStructure.length;
        int waterStored = 0;
        for(int i =0; i< arrLength; i++) {
            int leftHeight = wallStructure[i];
            for (int j = 0; j < i; j++) {
                leftHeight = Math.max(leftHeight, wallStructure[j]);
            }
            int rightHeight = wallStructure[i];
            for (int j = i + 1; j < arrLength; j++) {
                rightHeight = Math.max(rightHeight, wallStructure[j]);
            }
            waterStored += Math.min(leftHeight, rightHeight) - wallStructure[i];
        }
        return waterStored;
    }

    public static void main(String[] args) {
        int wallStructure[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(rainWater(wallStructure));
    }
}
