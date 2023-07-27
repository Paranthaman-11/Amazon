package job.practice.restart;

public class JavaPractice {
	
	
	int var1=10;
	int var2=20;
	int add=var1+var2;
	int sub=var1-var2;
	int mul=var1/var2;
	int div=var1*var2;
	
	public void addNumbers()
	{
		System.out.println(add);
		
	}
	public void subNumbers()
	{
		System.out.println(sub);
		
	}
	public void mulNumbers()
	{
		System.out.println(mul);
		
	}
	public void divNumbers()
	{
		System.out.println(div);
		
	}
	
	
	public static void main(String[] args) {
		
		JavaPractice f = new JavaPractice();
		f.addNumbers();
		f.subNumbers();
		f.mulNumbers();
		f.divNumbers();
	}

}
