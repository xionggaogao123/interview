package com.keven.interview.suanfa;

/**
 * @author keven
 * @date 2018-05-28 上午12:11
 * @Description 快速排序
 *
 * https://blog.csdn.net/Yexiaofen/article/details/78018204
 */
public class QuickSort {


    private static void quickSort(int a[], int low, int height) {
        if (a.length < 0) {
            return;
        }

        if (low > height) {
            return;
        }

        int i = low;
        int j = height;
        int key = a[low];

        while (i < j) {

            // 从 左 往 右 找到第一个大于key 的数
            while ( i < j && a[i] <= key) {
                i ++;
            }

            // 从 右 往左 找到 第一个 小于 key 的数
            while (i< j && a[j] > key) {
                j --;
            }

            // 交换
            if (i < j) {
                int p = a[i];
                a[i] = a[j];
                a[j] = p;
            }
        }

        // 调整 Key 的 位置
        int p = a[i];
        a[i] = a[low];
        a[low] = p;

        // 对key 左边的数进行快排
        quickSort(a, low, i-1);
        // 对key 右边的数进行快排
        quickSort(a, i+1, height);
    }

    public static void main(String []args) {
        int [] a = {1,2,5,8,3,0};
        quickSort(a, 0, a.length -1);

        for (int i = 0; i< a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
