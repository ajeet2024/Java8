package com.ajeet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequncyElement1 {
    public static List<Integer> frequncy(int[] a, int[] b){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<a.length;i++){
            if(map.containsKey(a[i])==true){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<b.length;i++){
            if(map.containsKey(b[i])==true){
                ans.add(map.get(b[i]));
            }else{
                ans.add(0);
            }
        }
        return ans;
    }
    public static void main(String as[]){
        int[] a = {2,6,3,2,8,2,8,23,8,10};
        int[] q = {2,8,3,5};
        System.out.println(frequncy(a,q));


    }
}
