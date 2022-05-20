package com.IfElseCode;

public class IfElseJava
{
	public void bloodDonationEligibility()  //IfifElse
	{
	 int age=17;    
	    int weight=55;      
	    {   
	    if(age>=18)
	    {      
	        if(weight>50)
	        {    
	            System.out.println("You are eligible to donate blood");    
	        } else
	        {  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    } else
	      {  
	      System.out.println("Age must be greater than 18");  
	    }  
	}  }  

	
	

     public void verifyLength() //if-elseif
     {
    	int num = 234;
    	if(num<100 && num>=1) {
    		System.out.println("It is a Two Digit Number");
    	}
    	else if(num<1000 && num>=100) {
    		System.out.println("It is a Three Digit Number");
    	}
    	else if(num<10000 && num>=1000) {
    		System.out.println("It is a Four Digit Number");
    	}
    	else {
    		System.out.println("Number is not between 1 & 999");
    	}
    	} 
     
     
     
     
        public void switchWeek()   //SwitchWithBreakStatement
        
        {
        	int day = 4;
        	String daystring;
        	switch(day) {
        	
        	//Case
        	case 1:
        		daystring = "Monday";
        		break;
        	
        		//Case
        	case 2:
        		daystring = "Tuesday";
        		break;
        		
        		//Case
        	case 3:
        		daystring = "Wednesday";
        		break;
        		
        		//Case
        	case 4:
        		daystring = "Thursday";
        		break;
        		
        		//Case
        	case 5:
        		daystring = "Friday";
        		break;
        		
        		//Case
        	case 6:
        		daystring = "Saturday";
        		break;
        		
        		//Case
        	case 7:
        		daystring = "Sunday";
        		break;
        		
        		//Default case
        	default:
        		daystring = "Invalid day";
        	}
        	System.out.println(daystring);

        }

        

        
      public void caseNum()     //SwitchwithoutBreakStatement
      {
    	  int number = 2;
    	  switch(number)
    	  {
    	  case 1:
    		  System.out.println("Case1");
    	  case 2:
    		  System.out.println("Case2");
    	  case 3:
    		  System.out.println("Case3");
    	  case 4:
    		  System.out.println("Case4");
    	  default:
    		  System.out.println("Default");
    	  }
      }
        
      }
       

       

