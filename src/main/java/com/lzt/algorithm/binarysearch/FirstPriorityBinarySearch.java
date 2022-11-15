package com.lzt.algorithm.binarysearch;

/**
 * @author lzt
 */
public class FirstPriorityBinarySearch {

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }

        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >>> 1);

            if (nums[mid] == target && (mid == 0 || nums[mid - 1] != target)) {
                return mid;
            }

            if (nums[mid] < target) {
                low = mid + 1;

                continue;
            }

            high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {1, 1, 1, 1, 1, 6, 7, 8, 9}, 1));
    }
}
