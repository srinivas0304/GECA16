class B extends A{
	public B(){
		super();
	}
		public static void main(String [] args){
			B obj1=new B();
			A obj2=new A();
			B obj3=new B();
			A obj4=new B();
			System.out.println(B.count);
		}
	
}