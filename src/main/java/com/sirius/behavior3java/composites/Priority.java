package com.sirius.behavior3java.composites;

import com.sirius.behavior3java.constant.B3Status;
import com.sirius.behavior3java.core.Tick;
import com.sirius.behavior3java.core.Composite;

/**
 * 选择节点
 * @author SilenceSu
 * @Email Silence.Sx@Gmail.com
 * Created by Silence on 2019/3/2.
 */
public class Priority extends Composite {
    @Override
    public B3Status onTick(Tick tick) {
        for (int i = 0; i < this.getChildCount(); i++) {
            B3Status status = this.getChild(i).execute(tick);
            if (status != B3Status.FAILURE) {
                return status;
            }
        }
        return B3Status.FAILURE;
    }
}
