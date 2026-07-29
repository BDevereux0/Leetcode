package org.example.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*

offer() → O(logn)
poll() → O(logn)
peek() → O(1) because it just returns the root.
 */
public class HeapTemplate {

    public static void main(String[] args) {
        //note: this is a min-heap (smallest number on top)
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int[] values = {1,2,3,4,4,5,6};
        for (int value :values){
            heap.offer(value);

        }

        while (!heap.isEmpty()){
            int current = heap.poll();
        }


        PriorityQueue<Integer> heap2 =
                new PriorityQueue<>(Collections.reverseOrder());
    }
}
