package com.zedrays.hackerrank;
import com.zedrays.Common;

/**
 * Created by zedray on 1/28/18.
 */
public class commonImplHR implements Common {
    @Override
    public BasicExecutionPS returnPSProblem() {

        BasicExecutionPS problems = new HackerrankProblemsImpl();
        return problems;

    }
}
