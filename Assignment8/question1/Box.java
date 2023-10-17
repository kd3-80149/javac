package com.sunbeam.info;

class Box<T extends Employee> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public double getTotalSalary() {
		return obj.calculateSal();
	}

}
