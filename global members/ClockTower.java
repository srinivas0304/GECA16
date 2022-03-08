class ClockTower{
public static void main(String [] args){
	Clock c1=new Clock();
	c1.hour=9;
	c1.min=15;
	c1.sec=30;
	c1.displayTime();
	
	Clock c2=new Clock();
	c2.hour=10;
	c2.min=25;
	c2.sec=45;
	c2.displayTime();
}
}