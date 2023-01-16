package com.itproger.ujsn.table;

public class Table {

    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 32;
        nums[2] = 1;
        nums[3] = 9;
        nums[4] = 3;

        int res = nums[2] + nums[3];
        System.out.println(res);

        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};
        System.out.println(nums2[1]);

        for(int i = 0; i < nums2.length; i++) {
            System.out.println("Element: " + nums2[i]);
        }
    }
}
