package com.lzt.algorithm.sorting;

import java.util.Arrays;

/**
 * @author lzt
 */
public class QuickSort {

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        sort(nums, 0, nums.length - 1);

        return nums;
    }

    private static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = partition(nums, low, high);

        sort(nums, low, mid - 1);
        sort(nums, mid + 1, high);
    }

    private static int partition(int[] nums, int low, int high) {
        int i = low, j = low;
        while (j < high) {
            if (nums[j] < nums[high]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }

            j++;
        }

        int temp = nums[i];
        nums[i] = nums[high];
        nums[high] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
