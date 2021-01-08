public class Demo {
    public static void main(String[] args) {
        def str1 = "Hello"
        def clos = { param -> println "${str1} ${param}" }
        clos.call("World!")
    }
}