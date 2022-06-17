package jdk16.records;

/**
 * record 会为其参数生成一个访问器，而这个访问器账号匹配接口 Star 中的 brightness()。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/17 00:29
 */
public record RedDwarf(double brightness) implements Star {
    @Override
    public double brightness() {
        return 100.0;
    }

    @Override
    public double density() {
        return 0;
    }
}
