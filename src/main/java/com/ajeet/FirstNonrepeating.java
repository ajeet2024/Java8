package com.ajeet;

import java.util.HashMap;
import java.util.Map;

public class FirstNonrepeating {
    public static int firstNonrep(int[] arr){
        int ans=0;
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])==true){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }else {
                map.put(arr[i],1);
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String as[]){
        int[] p ={1,2,3,1,4,5,6,2,8,3,5,6,4};
        int f = firstNonrep(p);
        System.out.println(f);
    }
}
