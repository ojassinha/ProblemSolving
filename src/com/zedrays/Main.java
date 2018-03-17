package com.zedrays;

import com.zedrays.Common.BasicExecutionDS;
import com.zedrays.Common.BasicExecutionPS;
import com.zedrays.Common.CommonFactory;
import com.zedrays.Common.TreeNode;
import com.zedrays.GFG.CommonImplGFG;
import com.zedrays.hackerrank.CommonImplHR;

public class Main {

    public static void main(String[] args) {

//        CommonFactory hrCommon = new CommonImplHR();
//        BasicExecutionPS execution = hrCommon.returnPSProblem();
//        execution.run("");

        CommonFactory gfgCommon = new CommonImplGFG();
        BasicExecutionDS dsExec = gfgCommon.returnDSProblem();
        TreeNode node=  dsExec.build();
        dsExec.run("topview",node);


    }
}
