#java学习笔记
1.1995年java诞生第一个版本。现阶段常用8和11两个版本。
2.java语言的特点：是跨平台性的<一个编译好的.class文件可以在多个系统下运行>；java语言是解释型的。
3.JDK：Java development kit  Java开发工具包。JDK=JRE+Java的开发工具<java,javac,javadoc,javap>
4.JRE=JVM（java虚拟机）+Java的核心类库<类>
5.综上：JDK=JRE+开发工具集
        JRE=JVM+Java SE标准类库
        JDK=JVM+Java SE标准类库+开发工具集。
6.public class Hello中，Hello表示是一个 类 ，public static void main(String.[] args)表示一个类的入口。
7.顺序：Hello.java---（编译javac）---Hello.class---（运行）java---JVM for Windows
javac是运行Java语言的编译器;.java文件是我能看懂的形式，.class文件是javac编译过后的语言；JVM是.class文件的专属运行环境。
8.生成.class文件的目的是为了让机器看懂代码，.Java文件中的代码只有人能看懂。（.java文件是源文件，.class文件是字节码文件）
9.一些注意事项：
 1>.Java 源文件以 .java 为扩展名。源文件的基本组成部分是类（class），如本类中的 Hello 类。
 2>.Java 应用程序的执行入口是 main() 方法。它有固定的书写格式：public static void main(String[] args) {...}
 3>.Java 语言严格区分大小写。
 4>.Java 方法由一条条语句构成，每个语句以 ; 结束。(同c语言)
 5>.大括号都是成对出现的，缺一不可。[习惯：先写 {} 再写代码]
 6>.一个源文件中最多只能有一个 public 类。其它类的个数不限。[重点]
 7>.如果源文件包含一个 public 类，则文件名必须按该类名命名！[重点]
 [例如]：
public class Study{...}  Study则为源文件的名称。
 8>.一个源文件中最多只能有一个 public 类。其它类的个数不限，也可以将 main 方法写在非 public 类中，然后指定运行非 public 类，这样入口方法就是非 public 的 main 方法[重点]
 [思考]：我觉得这里就像c语言中，一串代码你只能有一个主函数（main），下面可以调用其他的函数，有点不一样的就是java里有一个入口main。
10.转义字符的常见的几个类型
 \n换行  \t对齐  \\表示输出\  \\\\表示输出\\  \r回车  \"表述输出"(其他同理)
11.java的简单注释（comment）： 
//表示单行注释，/*   */表示多行注释
