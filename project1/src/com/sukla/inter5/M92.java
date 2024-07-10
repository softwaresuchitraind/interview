package com.sukla.inter5;

import java.util.HashMap;
import java.util.Map;

 class M92 {
    public static void main(String[] args) {
        // Creating a map (HashMap) in Java
        Map<String, Object> personInfo = new HashMap<>();
        personInfo.put("name", "John Doe");
        personInfo.put("age", 30);
        personInfo.put("city", "New York");

       System.out.println(personInfo);
        /*
        // Printing the contents of the map using a for loop
        for (Map.Entry<String, Object> entry : personInfo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/
       
       for(Map.Entry<String,Object> entry :personInfo.entrySet())
       {
    	   System.out.println(entry.getKey()+"--"+entry.getValue());
       }
       System.out.println("-------------");
       personInfo.forEach((x,y)->System.out.println(x+" "+y));
    }
}
