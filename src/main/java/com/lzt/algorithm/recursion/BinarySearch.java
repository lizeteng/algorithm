package com.lzt.algorithm.recursion;

/**
 * @author lzt
 */
public class BinarySearch {

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }

        return search(nums, target, 0, nums.length - 1);
    }

    private static int search(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) >>> 1;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            return search(nums, target, low, mid - 1);
        }

        return search(nums, target, mid + 1, high);
    }


    public static void main(String[] args) {
        System.out.println(search(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
    }
}
