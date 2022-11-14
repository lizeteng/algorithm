package com.lzt.algorithm.sorting;

import java.util.Arrays;

/**
 * @author lzt
 */
public class CountingSort {

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int[] countNums = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            countNums[nums[i]]++;
        }

        for (int i = 1; i < countNums.length; i++) {
            countNums[i] += countNums[i - 1];
        }

        int[] tempNums = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            tempNums[--countNums[nums[i]]] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempNums[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
