package org.example.heap;
//problem 1046

//take two heavies stones, smash them together. If:
//x == y, both stones are destroyed
//x != y, the stone of weight x is destroyed, and the stone of weight y
//has the new weight y -x.
//At the end there is at most 1 stone


import java.util.Collections;
import java.util.PriorityQueue;

/*
Algo:


 */
public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        int stoneY = 0;
        int stoneX = 0;

        if (stones.length ==1){
            return stones[0];
        }

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int n : stones){
            maxHeap.offer(n);
        }

        while(maxHeap.size()>1){
            stoneY = maxHeap.poll();
            stoneX = maxHeap.poll();

            //I don't need this condition because when I take them off the heap (poll), they are destroyed.
            /*if (stoneY == stoneX){
                maxHeap.offer(0);
            }*/
            if (stoneY != stoneX){
                maxHeap.offer(stoneY-stoneX);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
        int[] stones2 = {2,2};
        System.out.println(lastStoneWeight(stones2));
    }

}
