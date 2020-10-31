package algorithm;

/**
 * @ClassNameBubbleSort
 * @Author lixkvip@126.com
 * @Date2020/10/30 23:02
 * @Version V1.0
 **/
public class SortMain extends Thread{
    private static int ticket;

    public static void main(String[] args) {
        ticket = 100;

//        Thread thread1 = new Thread(new InnerThread(ticket));
//        Thread thread2 = new Thread(new InnerThread(ticket));
//        Thread thread1 = new Thread(new MyThread(ticket));
//        Thread thread2 = new Thread(new MyThread(ticket));

        SortMain thread1 = new SortMain();
        SortMain thread2 = new SortMain();

        thread1.setName("A窗口");
        thread2.setName("B窗口");
        thread1.start();
        thread2.start();

    }

    /**
     * 冒泡排序
     *
     * @param arr 需要排序的数组
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        int tmp;

        for (int i = 0; i < len - 1; i++) {

            for (int j = i; j < len - 1 - i; j++) {
                System.out.println("====");
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    /**
     * 选择排序
     *
     * @param arr 传入的需要排序的数组
     * @return 排序好的数组
     */
    public static int[] selectSort(int[] arr) {
        //数组的长度
        int len = arr.length;
        //标记比较过程中最小的数的下标
        int min;
        //交换值用到的临时变量
        int tmp;

        //首先来遍历数组
        for (int i = 0; i < len; i++) {
            min = i;
            //拿数组的一个数据和右边的所有数据一一对比
            for (int j = i; j < len - 1; j++) {
                if (arr[min] > arr[j + 1]) {
                    min = j + 1;
                }
            }
            //交换值
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;

        }
        return arr;
    }

    @Override
    public void run() {
        while (ticket > 0) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "卖出了" + ticket);
            ticket--;
        }
    }
}


class InnerThread implements Runnable {

    int ticket;

    public InnerThread(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (ticket > 0) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "卖出了" + ticket);
            ticket--;
        }
    }
}


