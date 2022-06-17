package jdk15.block;

/**
 * jdk 15 中添加了文本块（text block），这是从 python 语言借鉴而来的一个新特性。
 * 我们使用三引号啦表示包含换行符的文本块。文本块可以让我们更轻松地创建多行文本。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/22 23:23
 */
public class TextBlocks {
    public static final String OLD="Yesterday, upon the stair,\n"+"I met a man who wasn't there\n";
    public static final String NEW = """
            Yesterday, upon the stair,
            I met a man who wasn't there
            """;

    public static void main(String[] args) {
        System.out.println(OLD.equals(NEW));
    }
}
