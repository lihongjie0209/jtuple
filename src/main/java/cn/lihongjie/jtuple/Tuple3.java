package cn.lihongjie.jtuple;

import lombok.*;

@Data
@ToString(includeFieldNames = false)
@RequiredArgsConstructor(staticName="of")
public class Tuple3<A, B, C> {

    private final A val0;
    private final B val1;
    private final C val2;
}