/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detoning;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

/**
 *
 * @author admin
 */
public class Detoning {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        char detoning;
        char character='a';
        ArrayList listword = new ArrayList();
        ArrayList listword1 = new ArrayList();
        ArrayList listword2 = new ArrayList();
        ArrayList listcharacter = new ArrayList();
        ArrayList listint = new ArrayList();
        File f1 = new File("C:\\Users\\admin\\Desktop\\study\\1\\demo2\\demo2.txt");
        File f2 = new File("C:\\Users\\admin\\Desktop\\study\\1\\demo2\\timchu.txt");
        Scanner input = new Scanner(f1);
        FileWriter writer;
        writer = new FileWriter(f2);
        String s=null;
        String t=null;
        s=input.next();
        while(input.hasNext()){
            t=s;
            //s la khong co dau
            //t la co dau
            char characterdetoning[]= s.toCharArray();
            for(int i=0;i<s.length();i++){
                detoning=s.charAt(i);
                switch (detoning){
                    case 'À' : case'Á' :case 'Ạ' :case 'Ã' : case 'Ả':
                    case 'Ấ' :case 'Ầ' :case 'Ậ' :case 'Ẩ' : case 'Ẫ': case 'Â':
                    case 'Ắ' :case 'Ằ' :case 'Ẳ' :case 'Ẵ' : case 'Ặ': case 'Ă':
                    {
                        character=detoning;
                        detoning = 'A';
                        s.replace(character, 'A');
                        break;
                    }
                    case 'É':case 'È':case 'Ẹ':case 'Ẽ':case 'Ẻ':
                    case 'Ế':case 'Ề':case 'Ễ':case 'Ể':case 'Ệ': case 'Ê':
                    {
                        character=detoning;
                        detoning = 'E';
                        s.replace(character, 'E');
                        break;
                    }
                    case 'Ì': case 'Í': case 'Ĩ': case 'Ỉ': case 'Ị':
                    {
                        character=detoning;
                        detoning = 'I';
                        s.replace(character, 'I');
                        break;
                    }
                    case 'Ò': case 'Ó': case 'Õ': case 'Ọ': case 'Ỏ':
                    case 'Ồ': case 'Ố': case 'Ổ': case 'Ỗ': case 'Ộ': case 'Ô':
                    case 'Ớ': case 'Ờ': case 'Ở': case 'Ỡ': case 'Ợ': case 'Ơ':
                    {
                        character=detoning;
                        detoning = 'O';
                        s.replace(character, 'O');
                        break;
                    }
                    case 'Ú': case 'Ù': case 'Ủ': case 'Ũ': case 'Ụ':
                    case 'Ứ': case 'Ừ': case 'Ử': case 'Ữ': case 'Ự': case 'Ư':
                    {
                        character=detoning;
                        detoning = 'U';
                        s.replace(character, 'U');
                        break;
                    }
                    case 'Ý': case 'Ỳ': case 'Ỷ': case 'Ỵ': case 'Ỹ':
                    {
                        character=detoning;
                        detoning = 'Y';
                        s.replace(character, 'Y');
                        break;
                    }
                    case 'à': case 'á': case 'ả': case 'ã': case 'ạ':
                    case 'ầ': case 'ấ': case 'ẩ': case 'ẫ': case 'ậ': case 'â':
                    case 'ằ': case 'ắ': case 'ẵ': case 'ẳ': case 'ặ': case 'ă':
                    {
                        character=detoning;
                        detoning = 'a';
                        s.replace(character, 'a');
                        break;
                    }
                    case 'é': case 'è': case 'ẻ': case 'ẽ': case 'ẹ':
                    case 'ề': case 'ế': case 'ể': case 'ễ': case 'ệ': case'ê':
                    {
                        character=detoning;
                        detoning = 'e';
                        s.replace(character, 'e');
                        break;
                    }
                    case 'đ':
                    {
                        character=detoning;
                        detoning = 'd';
                        s.replace(character, 'd');
                        break;
                    }
                    case 'Đ':
                    {
                        character=detoning;
                        detoning = 'D';
                        s.replace(character, 'D');
                        break;
                    }
                    case 'í' : case 'ì' : case 'ỉ' : case 'ĩ' : case 'ị':
                    {
                        character=detoning;
                        detoning = 'i';
                        s.replace(character, 'i');
                        break;
                    }
                    case 'ò': case 'ó': case 'ỏ': case 'õ': case 'ọ':
                    case 'ồ': case 'ố': case 'ổ': case 'ỗ': case 'ộ': case 'ô':
                    case 'ờ': case 'ớ': case 'ở': case 'ỡ': case 'ợ': case 'ơ':
                    {
                        character=detoning;
                        detoning = 'o';
                        s.replace(character, 'o');
                        break;
                    }
                    case 'ù': case 'ú': case 'ủ': case 'ũ': case 'ụ':
                    case 'ừ': case 'ứ': case 'ử': case 'ữ': case 'ự': case'ư':
                    {
                        character=detoning;
                        detoning = 'u';
                        s.replace(character, 'u');
                        break;
                    }
                    case 'ý': case 'ỳ': case 'ỷ': case 'ỵ': case 'ỹ':
                    {
                        character=detoning;
                        detoning = 'y';
                        s.replace(character, 'y');
                        break;
                    }
                    case ',':case '.':case '"':case '/': case '?':
                    case ':':case '>':case '<':case ';': case'(': case')':
                    case '_':case '-':case '=':case '+':
                    {
                        character=detoning;
                        detoning = ' ';
                        s.replace(character, ' ');
                        break;
                    }            //tại sao cái này ko hoạt động a????
                    default:{
                        detoning=detoning;
                        
                    }
                }
                characterdetoning[i]=detoning;
                
                
            }
            s=s.copyValueOf( characterdetoning);
            s=s.toLowerCase();
            s=s.trim();
            if(listword.isEmpty()){
                listword1.add(t);
                listword.add(s);
            }
            if(listword.contains(s))
            {
                 if(!listword1.contains(t))
                {
                    int a=listword.indexOf(s);
                    String a1 =new String();
                    a1=listword1.get(a).toString();
                    
                    a1=a1.concat(t);
                    listword1.remove(a);
                    listword1.add(a,a1);
                }
            
            }
            else if (!listword.contains(s))
            {
                listword1.add(t);
                listword.add(s);
            }
            
            s=input.next();
        }
        input.close();
        writer.close();
        for (int i = 0; i < listword.size(); i++) 
        {
            System.out.println(listword.get(i).toString());
        }        
    }
}
