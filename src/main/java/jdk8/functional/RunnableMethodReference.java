package jdk8.functional;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/05 23:53
 */
public class RunnableMethodReference {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous");
            }
        }).start();

        new Thread(() -> System.out.println("lambda")).start();

        new Thread(Go::go).start();
    }

    static class Go {
        static void go() {
            System.out.println("Go::go");
        }
    }

}
