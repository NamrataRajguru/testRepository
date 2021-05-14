package pkg1;

public class sample2 {
	
	public static void m1()
	{
		System.out.println("Print method m1");
	}
	
	public void m2() 
	{
	System.out.println("Print method m2");
	
	}
	
	public static void main(String[] args) {
		
		m1();
		sample2 s=new sample2();
		s.m2();
		
		Sample1 s1=new Sample1();
		s1.m3();
	    s1.m4();
		
	}

}
