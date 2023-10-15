
//Q1 Apply inheritance n polymorphism
//a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
//b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
//c) Add suitable constructors.
//d) Override toString correctly to return state of all fruits (including : name ,color , weight )
//e) Add a taste() method : public String taste()
//For Fruit : it should return "no specific taste"
//Apple : should return "sweet n sour"
//Mango : should return "sweet"
//Orange : should return "sour"
//f) Add all of above classes under the package "com.app.fruits"
//g) Create java application FruitBasket , with main method , as a tester
//h) Prompt user for the basket size n create suitable data structure and give options
//0. Exit
//1. Add Mango
//case 1 : boundary checking
//basket[counter++]=new Mango(nm,weight,color);
//break;
//2. Add Orange
//3. Add Apple
//NOTE : You will be adding a fresh fruit in the basket , in all of above options.
//4. Display names of all fruits in the basket.
//eg : for-each --- null checking --getName()
//5. Display name,color,weight , taste of all fresh fruits , in the basket.
//eg : for-each , null checking --toString , taste, isFresh : getter
//6. Display tastes of all stale(not fresh) fruits in the basket.
//7. Mark a fruit as stale
//i/p : index
//eg : setter : isFresh : false
//o/p : error message (in case of invalid index) or mark it stale
//8. Mark all sour fruits stale (optional)
//eg : for-each , taste --equals(String)

package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit() {
		this("", 0, "", true);
	}

	public Fruit(String name) {
		this.name = name;

	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public Fruit(String colour, double weight, String name, boolean isFresh) {

		this.colour = colour;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;

	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the colour  = ");
		this.colour = sc.next();
		System.out.print("Enter the weight  = ");
		this.weight = sc.nextDouble();
		System.out.println("Enter the Fruit is fresh or not (0)for false and (1) for true =");
		this.isFresh = sc.hasNextBoolean();

	}

	public void displayData() {
		System.out.println("Name of the Fruit is = " + name);
		System.out.println("Color is = " + colour);
		System.out.println("Weight is = " + weight);
//	  if(isFresh==true)
//			System.out.println("Fruit is Fresh");
//			else
//		    System.out.println("Fruit is not fresh");
//		
	}

	public String taste() {
		return "no specific taste";
	}
}
