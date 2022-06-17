package jdk17.zgc;

import java.lang.management.ManagementFactory;

/**
 * GarbageCollectorMXBean 提供有关 GC 的信息。
 * 通过这个 bean，应用程序可以提取摘要信息（到目前为止完成的 GC 次数、累计花费的 GC 时间等）并监听 GarbageCollectionNotificationInfo 通知以获取有关单个 GC 的更细粒度的信息（GC 原因、开始时间、结束时间，ETC）。
 * vm args: -XX:+UseZGC
 * <p>
 * https://malloc.se/blog/zgc-jdk17
 *
 * @author huminxi2017@gmail.com
 * @since 2022/06/16 15:29
 */
public class GCCollectorMxBeans {
    public static void main(String[] args) {
        //运行 100 次 gc
        for (int i = 0; i < 100; i++) {
            System.gc();
        }
        //我们都看到 GC 运行了 100 个周期，每个周期平均需要约 4 毫秒才能运行。使用 JDK 17，我们现在还可以看到每个周期有 3 次 Stop-the-World 停顿，每个停顿的平均时间小于 0.01 毫秒（约 10 微秒）。
        for (final var bean : ManagementFactory.getGarbageCollectorMXBeans()) {
            System.out.println(bean.getName());
            System.out.println("count: " + bean.getCollectionCount());
            System.out.println("total time: " + bean.getCollectionTime() + " ms");
            System.out.println("average time: " + bean.getCollectionTime() / (double) bean.getCollectionCount() + " ms");
        }
    }
}
