package com.zedrays.GFG;

import com.zedrays.Common.BasicExecutionDS;
import com.zedrays.Common.BasicExecutionPS;
import com.zedrays.Common.CommonFactory;

/**
 * Created by zedray on 2/27/18.
 */
public class CommonImplGFG implements CommonFactory {

    @Override
    public BasicExecutionPS returnPSProblem() {
        return null;
    }

    @Override
    public BasicExecutionDS returnDSProblem() {
        BasicExecutionDS basicExecutionGFG = new GFGProblemsDSImpl();
        return basicExecutionGFG;
    }
}
