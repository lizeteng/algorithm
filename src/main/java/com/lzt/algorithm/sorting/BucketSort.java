package com.lzt.algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lzt
 */
public class BucketSort {

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        int max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int bucketSize = max / 10 - min / 10 + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketSize);
        for (int i = 0; i < bucketSize; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i = 0; i < nums.length; i++) {
            buckets.get((nums[i] - min) / 10).add(nums[i]);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        for (int i = 0, j = 0; i < buckets.size(); i++) {
            for (int k = 0; k < buckets.get(i).size(); k++) {
                nums[j++] = buckets.get(i).get(k);
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
