package com.problem.solving;

import com.problem.solving.Array.TappingRainWater;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TappingRainWater tappingRainWater = new TappingRainWater();
        int wallStructure[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        tappingRainWater.implement(wallStructure);
    }
}
