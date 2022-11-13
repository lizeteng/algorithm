package com.lzt.algorithm.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        sort(nums, 0, nums.length - 1);

        return nums;
    }

    private static void sort(int[] nums, int low, int high) {
        if (low == high) {
            return;
        }

        int mid = (high + low) >>> 1;

        sort(nums, low, mid);
        sort(nums, mid + 1, high);

        int[] newNums = new int[high - low + 1];

        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (nums[i] > nums[j]) {
                newNums[k++] = nums[j++];

                continue;
            }

            newNums[k++] = nums[i++];
        }

        int l = i, m = mid;
        if (i > mid) {
            l = j;
            m = high;
        }

        while (l <= m) {
            newNums[k++] = nums[l++];
        }

        int n = 0;
        while (low <= high) {
            nums[low++] = newNums[n++];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
