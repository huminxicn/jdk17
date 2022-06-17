package jdk16.instanceOf;

/**
 * jdk16 中增加了针对 instanceof 的模式匹配（Pattern Matching for instanceof）。
 * 可以简单称其为模式匹配，因为一旦确定类型后，就永远不需要对其转型了。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/23 19:31
 */
public class SmartCasting {
    public static void main(String[] args) {
        dumb("dumb");
        smart("smart");
    }

    static void dumb(Object x) {
        if (x instanceof String) {
            String s = (String) x;
            if (s.length() > 0) {
                System.out.format("%d %s %n", s.length(), s.toLowerCase());
            }
        }
    }

    static void smart(Object x) {

        if (x instanceof String s && s.length() > 0) {
            System.out.format("%d %s %n", s.length(), s.toLowerCase());
        }
    }

    /**
     * 在 if 智能转型表达式中只能使用 &&。使用 || 则意味着可能 x 是个 instanceof String，或者 s.length > 0。
     * 这意味着 x 可能不是 String，在这种情况下，Java 就不会将 x 智能转型生成 s，因此 s 在 || 右侧是不可用的。
     *
     * @param x
     */
    static void wrong(Object x) {
        //|| 永远不会生效。
        //if (x instanceof String s || s.length() > 0) {}
    }
}
