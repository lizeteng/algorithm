package com.lzt.algorithm.sorting;

import java.util.Arrays;

/**
 * @author lzt
 */
public class SelectionSort {

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
