package org.test;

public class Hello6 {
	
		  public static void main(String[] args) {
	//		          1       2    7
		    for (int i= 1; i<= 3; i++) {
	//	    	       3       4     6
		      for (int j= 1; j<= i; j++) {
	//	    	                  5
		        System.out.println(j);
		      }
		      }
		      }
              }


/*1       2        3       4      5(Print j)   6(Inc j)   7(Inc i)
 i=1     1<=3     j=1     1<=1       1            2           
                  j=2     2<=1     Fail   -------------->    i=2;
                  
 i=2     2<=3     j=1     1<=2       1            2       
                  j=2     2<=2       2            3   
                  j=3     3<=2     Fail  ------------>       i=3;
                  
 i=3     3<=3     j=1     1<=3       1            2  
                  j=2     2<=3       2            3
                  j=3     3<=3       3            4
                  j=4     4<=3     Fail          
                  
 */
