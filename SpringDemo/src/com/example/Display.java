package com.example;

//Auto Wiring...
public class Display {
	private Table t;
	
	public Display(Table t)
	{
		this.t=t;
	}
	
	public Table getT() {
		return t;
	}

//	public void setT(Table t) {
//		this.t = t;
//	}

	public void disp()
	{
		t.print(1000);
	}
//	public static void main(String[] args) {
//		Table tbl=new Table();
//		Display d=new Display();
//		d.setT(tbl);
//	}
}
