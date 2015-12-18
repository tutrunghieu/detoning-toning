package character;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Nh {

	
	public static Map<Integer, Integer> loadDetoneMap(BufferedReader reader) throws Exception
	{
		Map<Integer, Integer> lut = new TreeMap<Integer, Integer>();
        
		while(true)
		{
			String line = reader.readLine();
			if(line == null) break;
			String[] cells = line.replace("->", " ").split("\\s+[ ?!:;]+");
			if(cells.length < 0) continue;
			lut.put((int)cells[0].charAt(0), (int)cells[1].charAt(0));
		}
		
		return lut;
	}
	
	public static void add(Map<String, List<String>> lut, String s, String t)
    {
        List<String> ls = lut.get(s);
        if(ls == null) {
            ls=new ArrayList<String>();
            ls.add(t);
            lut.put(s, ls);
        }
        else if(!ls.contains(t)){
            ls.add(t);
        }
    }
	
	
    public static void print(Map<String, List<String>> lut,String s)
    {
        
        for(String t: lut.get(s))
        System.out.println(s + " -> " + t); 
    }
    
    public static String res(String toned, Map<Integer, Integer> lut) 
	{
		String res = "";
		
		for(int k=0; k<toned.length(); k++)
		{
			int ck = toned.charAt(k);
			
			if(lut.containsKey(ck)) res += (char)(int)lut.get(ck);
			else res += (char)ck;
		}
		
		return res;
	}

	public static Map<String, List<String>> creatMapDetone(BufferedReader fit,Map lut) throws IOException {
		Map<String, List<String>> res=new TreeMap<String, List<String>>();
		BufferedReader reader = new BufferedReader(new BufferedReader(fit));
		String line;
		List<String> lis =new ArrayList<String>();
		while(true)
		{
	            line = reader.readLine();
	            if(line == null) break;
	            if(!lis.isEmpty())lis.removeAll(lis);
	            for(String sk: line.split("[ ,.:;!?~']+")){
	            	lis.add(sk);
	            }
	            for(int i=0;i<lis.size();i++){
	            	String sa1 = lis.get(i);
	            	String sb1=detoning(sa1,lut);
	            	add(res,sb1,sa1);
	                if (i+1<lis.size()) 
	                {
	                    String sa2=lis.get(i+1);
	                    sa1+=" ";
	                    sa1+=sa2;
	                    add(res,sb1,sa1);
	                    if (i+2<lis.size())
	                    {
	                        String sa3=lis.get(i+2);
	                        sa1+=" ";
		                    sa1+=sa3;
		                    add(res,sb1,sa1);
	                        if (i+3<lis.size())
	                        {
	                        	String sa4=lis.get(i+3);
		                        sa1+=" ";
			                    sa1+=sa4;
			                    add(res,sb1,sa1);
	                        }
	                    }
	                
	                }
	            }
		}
		return res;
	}
	
	public static String detoning(String toned, Map<Integer, Integer> lut) 
	{
		String res = "";
		
		for(int k=0; k<toned.length(); k++)
		{
			int ck = toned.charAt(k);
			
			if(lut.containsKey(ck)) res += (char)(int)lut.get(ck);
			else res += (char)ck;
		}
		
		return res;
	}
}
