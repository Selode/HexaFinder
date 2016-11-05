import java.util.ArrayList;
import java.util.Scanner;

public class HexaFinder {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> letters = new ArrayList<String>();
		for(String word: "0	1	2	3	4	5	6	7	8	9	a	b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z".split("	")){
			letters.add(word);
		}
		
		System.out.println("Write whatever");
		String inp = scan.nextLine();
		
		int exp = 0;
		long sum = 0;
		for(int i = inp.length()-1; i>=0; i--){
			if(letters.contains(Character.toString(inp.charAt(i)))){
				sum += (long) (letters.indexOf(Character.toString(inp.charAt(i))) * Math.pow(36, exp));
				exp++;
			}
			
		}
		System.out.println(sum);
	}

}
