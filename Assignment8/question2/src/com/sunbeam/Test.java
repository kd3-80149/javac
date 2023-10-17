package com.sunbeam;

public class Test {
	public static void PrintDisplayableBox(Box<? extends Displayable>b)
	{
	b.get().show();
	
	}	
	public static void PrintBox(Box<?>b)
	{
		System.out.println(b.get().toString());
	}

	public static void main(String[] args) {
		Box<Person>b1=new Box<>();
		b1.set(new Person("Anu",20));
		PrintDisplayableBox(b1);
		Box<Date> b2=new Box<>();
		b2.set(new Date(1,1,2023));
		PrintDisplayableBox(b2);
		
		Box<String> b3=new Box<>();
		b3.set("CDAC");
		//PrintDisplayableBox(b3);
		
		PrintBox(b3);
		PrintBox(b2);
		PrintBox(b1);

	}

}
