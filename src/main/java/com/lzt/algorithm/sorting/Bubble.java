package com.lzt.algorithm.sorting;

import java.util.Arrays;

/**
 * @author lzt
 */
public class Bubble {

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
