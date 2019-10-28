package cn.lihongjie.jtuple;

import lombok.*;

@Data
@ToString(includeFieldNames = false)
@RequiredArgsConstructor(staticName="of")
public class Tuple<A, B> {

    private final A val0;
    private final B val1;
}