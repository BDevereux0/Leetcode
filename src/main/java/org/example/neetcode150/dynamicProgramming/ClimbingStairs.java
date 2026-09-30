package org.example.neetcode150.dynamicProgramming;

import java.util.Arrays;

//problem 70
/*

You are given an integer n representing the number of steps to reach the top of a staircase. You can climb
with either 1 or 2 steps at a time. Return the number of distinct ways to climb to the top of the staircase.
 */
public class ClimbingStairs {

    public static int climbStairs(int stairs){
        //represents the different ways we can get to stair i + 1
        int[] dp = new int[stairs];


        //Base cases; dp[0] = 1, because we took 1 action to get on stair 1.
        //dp[1] = 2 because we can take 2 actions to get there, either 1+1 or 2+0

        //These are like the 'rules' of the algo. That is, I'm telling the computer that it takes
        //1 action to go up 1 stair, and two actions to go up 2 stairs.
        dp[0]=1;
        dp[1]=2;

        for (int i = 2; i < stairs; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[stairs-1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
    }
}
