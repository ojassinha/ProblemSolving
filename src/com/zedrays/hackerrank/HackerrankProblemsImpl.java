package com.zedrays.hackerrank;

import com.zedrays.Common.BasicExecutionPS;

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
            default :
                this.helloWorld();
        }
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

