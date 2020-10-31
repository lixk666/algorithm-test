package algorithm;

/**
 * @ClassNameMyThread
 * @Author lixkvip@126.com
 * @Date2020/10/31 14:40
 * @Version V1.0
 **/
public class MyThread extends Thread{
    int ticket;
    public MyThread(int ticket) {
        this.ticket = ticket;
    }



    @Override
    public void run() {
        while (ticket > 0) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "卖出了" + ticket);
            ticket--;
            //123

            ///222
            //333
        }
    }
}

