package pkg1;

public class arrayex
{

	public static void main(String[] args) {
		String[] ar=new String[4];
		ar[0]="anu";
		ar[1]="namu";
		ar[2]="Nani";
		ar[3]="hony";
		
		System.out.println(ar[3]);
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
