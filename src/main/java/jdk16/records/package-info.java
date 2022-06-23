/**
 * 要让一个类的对象可以用作 Map（或 Set ）中的键，需要重写 equals() 和 hashCode() 方法。写对很难，如果以后要修改这个类的话，还很容易破坏它们。
 * <p>
 * JDK16 增加了 record 关键字。record 定义的是希望成为数据传输对象的类。当使用 record 关键字时，编译器会自动生成：
 * 1.不可变字段。
 * 2.一个规范的构造器。
 * 3.每个元素都有的访问器方法。
 * 4.equals()
 * 5.hashCode()
 * 6.toString()
 * <p>
 * 对于大多数 record，我们只需要给它一个名字和参数，不需要在定义体中添加任何东西。
 * 不能向 record 中添加字段，只能将其定义在头部。不过可以加入静态的方法、字段和初始化器。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/17 00:04
 */
package jdk16.records;