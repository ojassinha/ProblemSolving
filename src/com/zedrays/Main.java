package com.zedrays;

import com.zedrays.Common.*;
import com.zedrays.GFG.CommonImplGFG;
import com.zedrays.GFG.GFGProblemsDS;
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


        //CommonFactory hrCommon = new CommonImplHR();
        //BasicExecutionPS execution = hrCommon.returnPSProblem();
        //execution.run("getways");

            CommonFactory gfgCommon = new CommonImplGFG();
            BasicExecutionDS dsExec = gfgCommon.returnDSProblem();
            Graph node=  dsExec.buildGraph();
            dsExec.runGraph("bfs",node);
            //dsExec.run("lot",node);

        //https://www.geeksforgeeks.org/flood-fill-algorithm-implement-fill-paint/
        //  BasicExecutionPS psExec = gfgCommon.returnPSProblem();
        //  psExec.run("FIBONACCI");

    }
}
