package com.zedrays;

import com.zedrays.Common.BasicExecutionDS;
import com.zedrays.Common.BasicExecutionPS;
import com.zedrays.Common.CommonFactory;
import com.zedrays.Common.TreeNode;
import com.zedrays.GFG.CommonImplGFG;
import com.zedrays.hackerrank.CommonImplHR;

public class Main {

    public static void main(String[] args) {

        /* Uncomment based on your requirement
            GeeksForGeeks has 2 sections : PS and DS
            Initialize CommonImplGFG and use returnDSProblem for DS and vice versa.
            Run using the constant strings from the github readme where you can find questions
            link and solutions link on github.

            Same goes for HackerRank as well.

            Please contact me on ojassinha88@yahoo.com for any further clarification.
         */


//        CommonFactory hrCommon = new CommonImplHR();
//        BasicExecutionPS execution = hrCommon.returnPSProblem();
//        execution.run("");

          CommonFactory gfgCommon = new CommonImplGFG();
        //BasicExecutionDS dsExec = gfgCommon.returnDSProblem();
//        TreeNode node=  dsExec.build();
       // dsExec.run("topview",node);
        //dsExec.run("lot",node);

        //https://www.geeksforgeeks.org/flood-fill-algorithm-implement-fill-paint/
          BasicExecutionPS psExec = gfgCommon.returnPSProblem();
          psExec.run("FIBONACCI");

    }
}
