package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

//public class test1 {
//
//	public static void main(String[] args) {
//		
//		Map<String,String> M=nh.creatmap();
//		double s = nh.similar("a b c d", "1 2 3 4", M);
//		System.out.println(s);
//		s = nh.similar("a a c d", "1 1 3 4", M);
//		System.out.println(s);
//	}
//
//}

public class test1 {

	public static void main(String[] args) throws Exception{ 
		File f1 =  DataFolder.desktop("map-character-detoning");
		BufferedReader fis = DataFolder.openReaderUtf8(f1);
		Map<Integer, Integer> lut = nh.loadDetoneMap(fis);
		fis.close();
		File f2 =  DataFolder.desktop("Truyen-Kieu.txt");
		BufferedReader fit = DataFolder.openReaderUtf8(f2);
		Map<String,List<String>> detone = nh.creatMapDetone(fit,lut);

		
//		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
//		        String word = "";
//		       
//		        try
//		        {
//		            word = dataIn.readLine();
//		        }
//		        catch( IOException e )
//		        {
//		            System.out.println("Error!");
//		        }
//		        if(detone.containsKey(word)){
//		            nh.print(detone,word);
//		        }
		
		String w = "Chu tai chu menh kheo la ghet nhau.";
		String s1= "Chữ tài chữ mệnh khéo là ghét nhau.";
		String s2= "Chu tai chữ mệnh khèo là ghét nhau.";
		double st1 = nh.similar(w, s1, detone);
		System.out.println(st1);
		double st2 = nh.similar(w, s2, detone);
		System.out.println(st2);
		
	}

}
