package jdk8.lambda;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/05 23:06
 */
public class Soft implements Strategy {
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}
