package ThisAndStaticKeywords;

public class ThisKeyword {
	
	int x,y; //Class variable/instance variable
	
	/*ThisKeyword(int x,int y) //Create constructor
	{
		this.x=x;      //This keyword represeted by class variable
		this.y=y;
	}
    */
    
    void setData(int x,int y) //another method use by this keyword
    {
    	this.x=x;
    	this.y=y;
    	
    }
    
    
    
	void display() //mathod
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		//ThisKeyword th=new ThisKeyword(100,200);
		
		ThisKeyword th=new ThisKeyword();
		th.setData(100,300);
	    
		th.display();
	}
}
