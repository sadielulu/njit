public class Complex{

	float a;
	float b;

    public Complex(float a, float b) {
		
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex o) {

        return new Complex(a + o.a , b + o.b);
    }
	
	public Complex add(float o){
		return new Complex(a+o,b);
	}

    public String div(Complex o) {
		//ab/oa+ob make it minus and mult top and bottom with it 
			float num =(a*o.a)+((-1)*(b*((-1)*(o.b))));
			float num1 =(a*((-1)*(o.b))+(b*o.a));
			
			float den =(o.a*o.a);
			float den1 =(o.b*((-1)*(o.b)))*(-1);
				
			den=den+den1;
				
        return new Complex(num,num1).toString() + "/" + den ;

}
	public String div(float o){
        return new Complex(a,b).toString() + "/" + o ;
	}

    public Complex mul(Complex o) {
		//foil
		// at the end multiply it by -1 bc i squared is -1
		// if b is less than 0 and the other b is more than 0 conjugates

        return new Complex((a*o.a)+((-1)*(b*o.b)),(a*o.b)+(b*o.a) );
    }
	
	public Complex mul(float o){
		return new Complex((a*o),(b*o)); 
	}

    public Complex sub(Complex o) {

        return new Complex(a - o.a , b - o.b);
    }
	
	public Complex sub(float o){
		return new Complex(a-o,b);
	}
    

    public String toString() {
	    if (this.b < 0) {
	          
			return a + "" + b + "i";
	     
		 } else { 
		    
			return a + "+" + b + "i";
		 }
	 }

}
