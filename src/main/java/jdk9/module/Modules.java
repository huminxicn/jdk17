package jdk9.module;

/**
 * 模块化。
 * 1.使用 java --list-modules 会产生这样的输出:
 java.base@17.0.3.1
 java.compiler@17.0.3.1
 java.datatransfer@17.0.3.1
 java.desktop@17.0.3.1
 ...
 *
 * 2.使用 java --describe-module java.base 会产生这样的输出:
 java.base@17.0.3.1
 exports java.io
 exports java.lang
 ...
 * @author huminxi2017@gmail.com
 * @since 2022/05/11 23:42
 */
public class Modules {
}
