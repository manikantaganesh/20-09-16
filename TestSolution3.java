import java.io.*;
import java.util.*;

class sepa{
public String repeatSeparator(String word, String sep, int count) {        
    if(count == 1) {       
        return word;        
    }    
    if(count > 1) {       
        for (int i = 0; i < count-1; i++){        
            word = word + sep + word;           
        }       
    }               
   return word;                         
}
}
public class TestSolution3
{
public static void main(String[] args)
	{
		sepa s1=new sepa();
		System.out.println(s1.repeatSeparator("Word", "X", 3));
		System.out.println(s1.repeatSeparator("This", "And", 2));
		System.out.println(s1.repeatSeparator("This", "And", 1));
		System.out.println(s1.repeatSeparator("99", ",", 3));
	}
}	