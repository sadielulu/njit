
public class Parsing {

	private static String s;
	private static int i;
	
    public static void main(String[] args) {

        s = args.length == 1 ? args[0] : "";
        if (A() && i == s.length()) {
            System.out.println("The string \"" + s + "\" is in the language.");
        }
        else {
            System.out.println("The string \"" + s + "\" is not in the language.");
        }
    }

    public static boolean A() {
	
		 if (I()) {
		 System.out.println(i);
            if (i < s.length() && s.charAt(i) == '=') {
                ++i;
                if (E()) {					
                    return true;
                }
            }
    		i=0;

        }
		 else if (E() ){
				return true;
			            }	
        return false;
    }

    public static boolean E() {

        if (P()) {
                if (O()) {
                	if (P()){
						
                		return true;
                	}
                }
				else{
      		  	  return true;
            	}
		}
        return false;
    }

    
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
    
    public static boolean C() {
		
    	if(i < s.length() && 'a' <= s.charAt(i) && s.charAt(i) <= 'z'){
            ++i;
			System.out.println(i);

    		return true;
    	}
		return false;
    }

    	
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

