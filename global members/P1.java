class P1{
	int i;
	static int j=30;
	public void run(){
		System.out.println(i);
		System.out.println(j);
		System.out.println(P1.j);
	}
	public static void main(String [] args){
		System.out.println(P1.j);
		P1 a=new P1();
	System.out.println(a.i);
	a.run();
	}
}
		