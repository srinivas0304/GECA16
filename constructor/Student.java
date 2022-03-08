class Student{
	String name;
	double t;
	double i;
	double d;
	//10%
	public Student(String name,double t){
		this.name=name;
		this.t=t;
	}
	public Student(String name, double t,double i){
		this.name=name;
		this.t=t;
		this.i=i;
	}
	public Student(String name, double t, double i,double d){
		this.name=name;
		this.t=t;
		this.i=i;
		this.d=d;
	}
	public void display(){
		System.out.println(this.name);
		System.out.println(this.t);
		if(this.i!=0.0){
		System.out.println(this.i);
		}
		if(this.d!=0.0){ 
		System.out.println(this.d);
		}
		}
	
}



		