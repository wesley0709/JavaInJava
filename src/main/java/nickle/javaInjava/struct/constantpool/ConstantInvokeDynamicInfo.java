package nickle.javaInjava.struct.constantpool;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantInvokeDynamicInfo extends CPInfo{

    {
        u2("bootstrapMethodAttrIndex");
        u2("nameAndTypeIndex");
    }
    private short bootstrapMethodAttrIndex;
    private short nameAndTypeIndex;


}
