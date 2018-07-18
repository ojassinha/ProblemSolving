package com.zedrays.hackerrank;

import com.zedrays.Common.BasicExecutionPS;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by zedray on 1/28/18.
 */
public class HackerrankProblemsImpl implements HackerrankProblems , BasicExecutionPS {


    @Override
    public void run(String nameOfProblem) {
        switch(nameOfProblem) {
            case "nameofwinner" :
                this.nameOfWinner();
                break;
            case "getways" :
                this.runGetWays();
                break;
            case "equal" :
                this.equal();
                break;
            default :
                this.helloWorld();
        }
    }



    @Override
    public void runGetWays() {

        long[] options = new long[]{2l,5l,3l,6l};
        long response = this.getWays(10,options);
        System.out.println(response);
    }

    @Override
    public void equal() {



    }

    private void runEqual(int[] arr){

    }

    private long getWays(long n, long[] c){

        if(n == 0l)
            return 1;

        long[] table = new long[(int)n+1];
        table[0] = 1l;
        for(long i =0l;i<Long.valueOf(c.length);i++){
            for(long j = c[(int)i];j<=n;j++)
                table[(int)j] += table[(int)j-(int)c[(int)i]];
        }

        return table[(int)n];

    }


    public void helloWorld(){
        System.out.println("Hello Mars , about to land");
    }

    @Override
    public void nameOfWinner() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String nameOfWinner = "";
        int max = 0;
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int d = in.nextInt();
            int j = in.nextInt();

            if(j-d > max){
                max = j-d;
                nameOfWinner = name;
            }
        }
        in.close();

        System.out.println(nameOfWinner+ " "+ max);

    }
}

