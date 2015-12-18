package character;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;



public class test1 {

	public static void main(String[] args) throws Exception{ 
		File f1 =  DataFolder.desktop("map-character-detoning");
		BufferedReader fis = DataFolder.openReaderUtf8(f1);
		Map<Integer, Integer> lut = Nh.loadDetoneMap(fis);
		fis.close();
		File f2 =  DataFolder.desktop("Truyen-Kieu.txt");
		BufferedReader fit = DataFolder.openReaderUtf8(f2);
		Map<String,List<String>> detone = Nh.creatMapDetone(fit,lut);

		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		        String word = "";
		        try
		        {
		            word = dataIn.readLine();
		        }
		        catch( IOException e )
		        {
		            System.out.println("Error!");
		        }
		        if(detone.containsKey(word)){
		            Nh.print(detone,word);
		        }
	}

}
