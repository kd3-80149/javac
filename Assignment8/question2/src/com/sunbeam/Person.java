package com.sunbeam;

 class Person implements Displayable{
	
	    private String name;
	    private int age;

	    public Person(String name,int age) {
	        this.name = name;
	        this.age=age;
	    }
	    @Override
	    public void show() {
	        System.out.println("Person: " + name);
	        System.out.println("Person: "+age);
	    }
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
	    
	}


