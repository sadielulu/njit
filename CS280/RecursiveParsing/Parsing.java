
/*
final
recursive descent parser for following language:
A -> I = E | E 
E -> P O P | P 
O -> + | - | * | / | ** 
P -> I | L | UI | UL | (E) 
U -> + | - | ! 
I -> C | CI 
C -> a | b | ... | y | z 
L -> D | DL 
D -> 0 | 1 | ... | 8 | 9 
*/

import java.util.Scanner;
import java.io.*;

public class Parsing{

	private static String s;
	private static int i;
	
    public static void main(String[] args) throws IOException {


      // read from input file
       if(args[0].equals("input.txt"))
       {
       
      String filename = "input.txt";
       
       // opens file
      Scanner sc = new Scanner(new File(filename));
       
       while(sc.hasNextLine())
      {
       	s = sc.nextLine().trim(); //just incase
      	System.out.println("String read from file: " + s);
      	i = 0;
       	if (A() && i == s.length()) {
           System.out.println("The string \"" + s + "\" is in the language.\n");
        }
        else {
           System.out.println("The string \"" + s + "\" is not in the language.\n");
        }
       	
       }
      }
       
       //get string from command line
       else
       {
       
        s = args.length == 1 ? args[0] : "";
        System.out.println("String read from command line: " + s);
        i=0;
        if (A() && i == s.length()) {
            System.out.println("The string \"" + s + "\" is in the language.");
        }
        else {
            System.out.println("The string \"" + s + "\" is not in the language.");
        }
       }
    }

// A -> I = E | E 
    public static boolean A() {
	
	if (I()) {
            if (i < s.length() && s.charAt(i) == '=') {
                ++i;
                if (E()) {					
                    return true;
                }
            }
        }
	i=0;
	 if (E() ){
		return true;
	}	
        return false;
    }

// E -> P O P | P 
    public static boolean E() {

        if (P()) {
                while (O()) {
                	if (P()){
						
                	
                	}
                	else return false;
                }
			 
      		  	  return true;
            	 
		}
        return false;
    }

   // O -> + | - | * | / | **  
    public static boolean O() {
		
    	  if (i < s.length() && s.charAt(i) == '+') {
              ++i;
              return true;
    }
    	  else if (i < s.length() && s.charAt(i) == '-') {
              ++i;
              return true;
    }
    	  else if (i < s.length() && s.charAt(i) == '*') {
              ++i;
              return true;
    }	
    	  else if (i < s.length() && s.charAt(i) == '/') {
    		  ++i;
    		  return true;  
    }     
    	  else if (i < s.length() && s.charAt(i) == '*') {
    		  ++i;
    		  if (i < s.length() && s.charAt(i) == '*') {
        		  ++i;
        		  return true;
    		  }
    	  }
		return false;
    }
    
// P -> I | L | UI | UL | (E)     
    public static boolean P() {
    	
    	if (I()){
    		return true;
    	}
    	else if (L()){
    		return true;
    	}
    	else if (U()){
    		if(I()){
    			return true;
    		}
       		else if(L()){
    			return true;
    		}
    	}
    	else if (i < s.length() && s.charAt(i) == '(') {
            ++i;
            if (E()) {
                if (i < s.length() && s.charAt(i) == ')') {
                    ++i;
                    return true;
                }
            }
    	}
		return false;
    	
    }
    
// U -> + | - | ! 
    public static boolean U() {
    	  if (i < s.length() && s.charAt(i) == '+') {
              ++i;
              return true;
    }
    	  else if (i < s.length() && s.charAt(i) == '-') {
              ++i;
              return true;
    }
    	  else if (i < s.length() && s.charAt(i) == '!') {
              ++i;
              return true;
    	
    }
		return false;
    	 }
// I -> C | CI        
    public static boolean I() {
		
    	if (C()){
     		if(I()){
     			return true;
     		}
			else{
				return true;
			}
     	}   
		return false; 
	}
   
// C -> a | b | ... | y | z     
    public static boolean C() {
		
    	if(i < s.length() && 'a' <= s.charAt(i) && s.charAt(i) <= 'z'){
            ++i;
		//	System.out.println(i);

    		return true;
    	}
		return false;
    }

 // L -> D | DL    	
    public static boolean L() {
    	if (D()){
     		if(L()){
     			return true;
     		}
			else{
				return true;
			}
     	}   
		return false; 
	}

// D -> 0 | 1 | ... | 8 | 9 
    public static boolean D() {
    	if(i < s.length() && s.charAt(i) == '0'){
            ++i;
    		return true;
    	}
    	else if (i < s.length() && '1' <= s.charAt(i) && s.charAt(i) <= '8') {
            ++i;
            return true;
        }
    	else if(i < s.length() && s.charAt(i) == '9'){
            ++i;
        	return true;
        }
		return false;
    }


}
