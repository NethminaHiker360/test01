import java.util.*;
class Date{
	int year;
	int month;
	int day;
	
	public static final int YEAR=0;
	public static final int MONTH=1;
	public static final int DAY=2;
	
	Date(){
		year=1970;
		month=1;
		day=1;
	}
	Date(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void set(int field, int value){
		switch(field){
			case 0 : this.year=value;break;
			case 1 : this.month=value;break;
			case 2 : this.day=value;break;
		} 
	}
	public void setDate(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void setDate(Date date){
		setDate(date.year, date.month, date.day);
	}
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
	public static Date getInstance(){
		Date temp=new Date();
		return temp;
	}
}
class Demo{
	public static void main(String args[]){
		Date d1=Date.getInstance();
		d1.printDate(); //1970-1-1;
		
		d1.set(Date.YEAR,1992);
		d1.set(Date.MONTH,8);
		d1.set(Date.DAY,12);
		d1.printDate(); //1992-8-12

		
	}
}

