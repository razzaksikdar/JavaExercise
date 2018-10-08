package com.qa.raz.ShafiqsStaticTest;

public class Result {
	private static Result r;
	private static int a;
	private int b= 12;
	
	static {
		a=25;
	}

	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b=b;
	}
	
	public int calculate()
	{
		return 25*b;
	}
	public static Result createResult(){
		
		if(r==null) 
			r=new Result();
		return r;
	}
	
}
