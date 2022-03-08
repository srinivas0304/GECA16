class P3{
	   int i=10;
	   static int j=20;
	    P3 obj=new P3();
	   public void start(){
		   System.out.println(obj.j);
	   }
	public static void main(String [] args){
		//System.out.println(P3.obj.j);
		P3 obj=new P3();
		System.out.println(j);
	}
	
}
		