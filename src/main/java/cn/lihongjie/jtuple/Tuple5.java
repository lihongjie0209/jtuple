package cn.lihongjie.jtuple;

import lombok.*;

@Data
@ToString(includeFieldNames = false)
@RequiredArgsConstructor(staticName="of")
public class Tuple5<A, B, C, D, E> {

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
}