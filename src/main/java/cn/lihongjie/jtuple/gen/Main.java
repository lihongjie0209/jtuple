package cn.lihongjie.jtuple.gen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) throws IOException {


        /**
         * package cn.lihongjie.jtuple;
         *
         * import lombok.*;
         *
         * @Data
         * @ToString(includeFieldNames = false)
         * @RequiredArgsConstructor(staticName="of")
         * public class Tuple<A, B> {
         *
         *     private final A val0;
         *     private final B val1;
         * }
         *
         *
         */


        for (int i = 2; i < 19; i++) {

            StringBuilder sb = new StringBuilder();

            String number = i > 2 ? i + "" : "";

            sb.append("package cn.lihongjie.jtuple;\n")
                    .append("\n")
                    .append("import lombok.*;\n")
                    .append("\n")
                    .append("@Data\n")
                    .append("@ToString(includeFieldNames = false)\n")
                    .append("@RequiredArgsConstructor(staticName=\"of\")\n");
            sb.append("public class Tuple").append(number).append("<");

            String gTypes = IntStream.range(0, i)
                    .map(item -> item + 'A')
                    .mapToObj(item -> String.valueOf(((char) item)))
                    .collect(Collectors.joining(", "));
            sb.append(gTypes);

            sb.append("> {\n");
            sb.append("\n");


            String fields = IntStream.range(0, i)
                    .map(item -> item + 'A')
                    .mapToObj(item -> String.format("    private final %s val%d;\n",
                            String.valueOf(((char) item)),
                            item - 'A'))
                    .collect(Collectors.joining(""));

            sb.append(fields);

            sb.append("}");


            String fileName = ".\\src\\main\\java\\cn\\lihongjie\\jtuple\\Tuple" + number + ".java";
            Files.write(Paths.get(fileName), sb.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);


        }


    }
}
