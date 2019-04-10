package LongestSubstring;
import java.util.*;
import java.util.Scanner;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s){
		int n = s.length();
		int max_subStrlen = 0;
		for(int i = 0;i < n - 1;i++)
			for(int j = i + 1;j < n;j++)
				if(allSingle(s,i,j))
					max_subStrlen = Math.max(max_subStrlen,j - i);
		return max_subStrlen;
	}
	
	public static boolean allSingle(String s,int low,int high){
		Set<Character> set = new HashSet<>();
		for(int i = low;i < high;i++){
			Character c = s.charAt(i);
			if(!set.add(c))
				return false;
			set.add(c);
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(s);
		
		int subStrLen = lengthOfLongestSubstring(s);
		System.out.println("The length of longest substring:" + subStrLen);
		
	}

}
