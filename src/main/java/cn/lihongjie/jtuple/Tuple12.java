package cn.lihongjie.jtuple;

import lombok.*;

@Data
@ToString(includeFieldNames = false)
@RequiredArgsConstructor(staticName="of")
public class Tuple12<A, B, C, D, E, F, G, H, I, J, K, L> {

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    private final H val7;
    private final I val8;
    private final J val9;
    private final K val10;
    private final L val11;
}