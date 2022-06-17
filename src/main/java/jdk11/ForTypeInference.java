package jdk11;

/**
 * 类型推断特别适合 for 循环。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/11 23:16
 */
public class ForTypeInference {
    public static void main(String[] args) {
        for (var s : Spiciness.values()) {
            System.out.println(s);
        }
    }
}

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}
