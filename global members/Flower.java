class Flower{
	String fName;
	int noOfPettals;
	String color;
	public Flower(String fName,int noOfPettals,String color){
		this.fName=fName;
		this.noOfPettals=noOfPettals;
		this.color=color;
	}
	public Flower(){
		this.fName="Jasmine";
		this.noOfPettals=50;
		this.color="Yellow";
	}
	public void pooja(){
		System.out.println("Flowers used for pooja: "+this.fName+"||"+this.noOfPettals+"||"+this.color);
	}
	}
		
