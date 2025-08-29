package pe.joedayz;

import static java.util.Arrays.*;

import java.util.List;

public class StaticImports {

    public static void main(String[] args) {
        List<String> list =
                asList("one", "two",
                        "three", "four");
    }
}
