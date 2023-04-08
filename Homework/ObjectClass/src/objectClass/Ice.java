package objectClass;

import java.util.Scanner;

class Ice {
	
	private	String icecreamtype;
	private	String icecreamcompany;
	private double icecreamprice;
	Ice(){
			icecreamprice = 0;	
		}
		//this is for public access modifier ...
		Ice(String icecreamtype, String icecreamcompany, double icecreamprice){
			this.icecreamtype= icecreamtype;
			this.icecreamcompany = icecreamcompany;
			this.icecreamprice = icecreamprice;	
		}
		
		//anything using this. is the private attribute 
		    public void setType(String icecreamType)
		    {
		      this.icecreamtype = icecreamType;  //icecreamtype = private attribute, icecreamType = setType variable 
		    }
		  
		    public String getType()
		    {
		      return icecreamtype ;  
		    }
		    
		    public void setCompany(String icecreamCompany)
		    {
		      this.icecreamcompany =icecreamCompany;  
		    }
		    
		    public String getCompany()
		    {
		      return icecreamcompany ;  
		    }
		    
		    public void setPrice(double icecreamPrice)
		    {
		      this.icecreamprice = icecreamPrice;  
		    }
		    public double getPrice()
		    {
		      return icecreamprice ;  
		    }
		    
		
	public String display(){
			
			return "IcecreamType: "+icecreamtype+" IcecreamCompany: "+icecreamcompany+" IcecreamPrice:"+icecreamprice;
		}
	
	public boolean equals(Ice i) {
			if(icecreamprice == i.getPrice())  
		          return true; 
		      else
		          return false;
		}
	
	public int compareTo(Ice i) {
			if (icecreamprice>i.getPrice()) {
				return 1;  //if i1 is greater than i2 then return 1 
			}
			else if (icecreamprice == i.getPrice()) {
				return 0;
			}
			else {
				return -1;
				}
	}
		
		
}
