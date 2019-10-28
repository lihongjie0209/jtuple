package cn.lihongjie.jtuple.gen;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.Wither;

@Data
@ToString(includeFieldNames = false)
@RequiredArgsConstructor(staticName="of")
public class Tuple<A, B> {

    private final A val0;
    private final B val1;
}