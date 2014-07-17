package co.think.pojo;

import java.util.ArrayList;

public class Row {
	private String text;
	private ArrayList<Cell> cells = new ArrayList<Cell>();
	
	public Row (String text, ArrayList<Cell> cells){
		this.text = text;
		this.cells = cells;
	}
	
	public String getText (){
		return text;
	}
	
	public void setText (String text){
		this.text = text;
	}
	
	public ArrayList<Cell> getCells(){
		return cells;
	}
	
	public void setCells (ArrayList<Cell> cells){
		this.cells = cells;
	}
}
