package com.zedrays.hackerrank;

import com.zedrays.Common.BasicExecutionDS;
import com.zedrays.Common.BasicExecutionPS;
import com.zedrays.Common.CommonFactory;

/**
 * Created by zedray on 1/28/18.
 */

public class CommonImplHR implements CommonFactory {

    @Override
    public BasicExecutionPS returnPSProblem() {

        BasicExecutionPS problems = new HackerrankProblemsImpl();
        return problems;

    }

    @Override
    public BasicExecutionDS returnDSProblem() {
        return null;
    }
}
