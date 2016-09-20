import java.io.*;
import java.util.*;



class hlo1
{
   
	public String withoutString(String base, String remove)
	{
		int blen = base.length();
		int rlen = remove.length();
		int now = 0;
		int pos;
		StringBuilder stbuild = new StringBuilder(blen);
		String blow = base.toLowerCase();
		String rlow = remove.toLowerCase();
		pos = blow.indexOf(rlow);
		
		while(pos !=-1)
		{
			for(; now < pos; now++)
			{
				stbuild.append(base.charAt(now));
			}
			now = pos+rlen;
			pos = blow.indexOf(rlow, now);
		}
		for(; now < blen; now++)
		{
			stbuild.append(base.charAt(now));
		}
		return stbuild.toString();
	}
	
	
}
public class  TestSolution1
{
public static void main(String[] args)
	{
		hlo1 s1=new hlo1();
		System.out.println(s1.withoutString("Hello there ","llo"));
		System.out.println(s1.withoutString("Hello there","ll"));
		System.out.println(s1.withoutString("Hello there", "x"));
	}
}
