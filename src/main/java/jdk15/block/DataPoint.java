package jdk15.block;

/**
 * 为了支持文本块，String 类里添加了一个新的 formatted() 方法。
 * formatted() 是一个成员方法，而不是一个像 String.format() 那样的静态函数。
 * <p>
 * 文本块的结果是一个常规的字符串，所以其它字符串能做的事情，它也可以做。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/22 23:28
 */
public class DataPoint {
    private String location;
    private Double temperature;

    public DataPoint(String loc, Double temp) {
        location = loc;
        temperature = temp;
    }

    /**
     * 支持格式化输出
     */
    @Override
    public String toString() {
        return """
                location: %s
                temperature: %.2f
                """.formatted(location, temperature);
    }

    public static void main(String[] args) {
        var hill = new DataPoint("hill", 45.2);
        var dale = new DataPoint("dale", 65.2);
        System.out.println(hill);
        System.out.println(dale);
    }
}
