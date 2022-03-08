class Box{
	double l;
	double b;
	double h;
	public Box(double l,double b,double h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public Box(){
		this.l=9.5;
		this.b=8.15;
		this.h=7.789;
	}
	public void area(){
		System.out.prinln("Area of Box: "+(this.l*this.b*this.h));
	}
}