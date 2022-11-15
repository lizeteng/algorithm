package com.lzt.algorithm.binarysearch;

/**
 * @author lzt
 */
public class BinarySearch {

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }

        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                high = mid - 1;

                continue;
            }

            low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
    }
}
