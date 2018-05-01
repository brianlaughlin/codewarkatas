package kata.lambdas;


import java.util.function.Function;

public class PassingBehaviors {

    public static void lesson() {
        System.out.println(process("Hello World", String::toUpperCase));
    }

    private static String process(String str, Function<String, String> processor) {

        return processor.apply(str);

    }
}
