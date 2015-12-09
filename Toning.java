/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
/**
 *
 * @author admin
 */

public class Toning{
    
    public static TreeMap creatmap(TreeMap user) throws FileNotFoundException{
        String s1=null;
        File f1 = new File("C:\\Users\\admin\\Desktop\\study\\1\\detoning\\character-detoning");
        
        Scanner input = new Scanner(f1);
        String s=input.next();
        while(input.hasNext()){
            s1=s;
            s=input.next();
            user.put(s1,s);
        }
        return user;
    }
     
    public static String detone(String res) throws FileNotFoundException{
        TreeMap a= new TreeMap();
        creatmap(a);
        File f1 = new File("C:\\Users\\admin\\Desktop\\study\\1\\demo2\\demo2.txt");
        Scanner input = new Scanner(f1);
        String s=null;
        String t=null;
        do {
            s=input.next();
            for(int k=0; k<s.length(); k++) 
            {
                char sk = s.charAt(k);
                if( a.containsKey(sk)){
                    res += (char)a.get(sk);
                    System.out.print("\t" + sk);      
                }
                else res += (char)sk;
            }
        }while(input.hasNext());
        return res;
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        String t1=null;
        String t2=null;
        String w1=null;
        String w2=null;
        String z1=null;
        String z2=null;
        File f1 = new File("C:\\Users\\admin\\Desktop\\study\\toning");
        Scanner input = new Scanner(f1);
        TreeMap a = new TreeMap<String, String>();
        TreeMap b = new TreeMap<String, String>();
        t2=input.next();
        do{
           t1=t2;
           z1=detone(t1);
           t2=input.next();
           z2=detone(t2);
           if(!a.containsKey(t1)||!a.containsValue(t2)){
               a.put(t1,t2);
           }
           if(!b.containsKey(z1)||!a.containsValue(z2)){
               b.put(z1,z2);
           }
           if(t2==null)break;
        }while(true);
        Set set = a.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        
    }
    
}
 