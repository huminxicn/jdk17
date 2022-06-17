package jdk14.switchs;

/**
 * switch 一直以来都只是一个语句，不会生成结果。
 * jdk14 使得 switch 还可以作为一个表达式来使用，因此它可以得到一个值。使用新的关键字 yield 可以从 switch 中返回结果。
 * 如果一个 case 需要多个语句，就将他们放在一对花括号中。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/23 19:16
 */
public class SwitchExpression {
    public static void main(String[] args) {
        for (var s : new String[]{"i", "j", "k"}) {
            System.out.format("%s %d %d \n", s, colon(s), arrow(s));
        }
    }

    static int colon(String s) {
        var result = switch (s) {
            case "i":
                yield 1;
            case "j":
                yield 2;
            default:
                yield 0;
        };
        return result;
    }

    static int arrow(String s) {
        var result = switch (s) {
            case "i" -> 1;
            case "j" -> 2;
            default -> {
                System.out.println("default");
                yield 0;
            }
        };
        return result;
    }
}
