package com.pluralsight.calcengine;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        //list which will store final score
        List<Integer>score =new ArrayList<>();
        int aliceScore=0;
        int bobScore=0;
        //iterate the list
        //can use any of the two as comparator
        for (int i=0;i<a.size();i++){
            if (a.get(i)>b.get(i)){
                //we have to increase alice score if its greater that bob
                aliceScore=aliceScore+1;
                //aliceScore +=1;
            }
            else if(b.get(i)>a.get(i)){
                bobScore=bobScore+1;
                //bobScore +=1;
            }
        }
        score.add(aliceScore);
        score.add(bobScore);
        return score;


    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = Result.compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
