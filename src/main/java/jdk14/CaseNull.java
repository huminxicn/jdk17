package jdk14;

/**
 * jdk17 新增了（预览）功能，在 switch 中引入原本非法的 case null。以前只能在 switch 外面检查是否为 null。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/23 19:10
 */
public class CaseNull {
    static void old(String s) {
        if (null == s) {
            System.out.println("null");
            return;
        }
        switch (s) {
            case "case1" -> System.out.println("case1");
            default -> System.out.println("default");
        }
    }

    static void checkNull(String s) {
        switch (s) {
            case "case1" -> System.out.println("case1");
//            case null -> System.out.println("null");
            default -> System.out.println("default");
        }
    }
}
