package jdk8.lambda;

/**
 * 通常情况下，方法会根据锁传递的数据产生不同的结果。如果想让一个方法在每次调用时都有不同的表现呢？
 * 如果将代码传递给方法，就可以控制其行为。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/05 23:08
 */
public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                msg1 -> msg1.substring(0, 5),
                Unrelated::twice
        };
        Strategize s = new Strategize("hello three");
        s.communicate();
        for (Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy);
            s.communicate();
        }
    }
}
