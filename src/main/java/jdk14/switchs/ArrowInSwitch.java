package jdk14.switchs;

import static java.util.stream.IntStream.range;

/**
 * jdk14 增加了 switch 中使用一种不同的 case 的能力。
 * <p>
 * 在 colons() 中，为了防止继续向下执行，每个 case 语句（除了最后的 default）后面都要加上 break。
 * 而 arrows() 中将冒号替换为箭头之后，便不再需要 break 语句了。
 *
 * 注意：不能在一个 switch 中同时用冒号和箭头。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/23 19:03
 */
public class ArrowInSwitch {
    public static void main(String[] args) {
        range(0, 4).forEach(i -> colons(i));
        range(0, 4).forEach(i -> arrows(i));
    }

    static void colons(int i) {
        switch (i) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println(0);
        }
    }

    static void arrows(int i) {
        switch (i) {
            case 1 -> System.out.println(1);
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
            default -> System.out.println(0);
        }
    }
}
