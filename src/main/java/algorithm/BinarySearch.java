package algorithm;

/**
 * @ClassNameBinarySearch
 * @Author lixkvip@126.com
 * @Date2020/11/8 18:51
 * @Version V1.0
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr, 5, 0, arr.length-1));
    }

    /**
     * 二分查找算法，需要初始数组有序
     *
     * @param arr    查找元素的数组
     * @param number 要查找的元素
     * @return 数组中元素的下标，没有则返回null
     */
    public static int binarySearch(int[] arr, int number, int low, int high) {
        //初始值为数组的长度
        int middle = (low + high) / 2;

        if (low > high) {
            return -1;
        }

        if (number == arr[middle]) {
            return middle;
        } else if (number > arr[middle]) {
            return binarySearch(arr, number,middle+1, high);

        } else if (number < arr[middle]) {
            return binarySearch(arr, number,low,middle-1);
        }

        return middle;
    }
}
