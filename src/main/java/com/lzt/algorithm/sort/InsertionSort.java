package com.lzt.algorithm.sort;

import java.util.Arrays;

/**
 * @author lzt
 */
public class InsertionSort {

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > num) {
                    nums[j + 1] = nums[j];

                    continue;
                }

                break;
            }

            nums[j + 1] = num;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
