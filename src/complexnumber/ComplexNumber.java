package complexnumber;

public class ComplexNumber {
    
    static private double initRe;
    static private double initIm;
    
    private double re;
    private double im;
    
    static public void setInitRectangular(double re, double im){
        
        initRe = re;
        initIm = im;
        
    }
    
    static public void setInitPolar(double modulus, double argument){
        
        if(modulus < 0){
            throw new IllegalArgumentException("Modulus must be greater or equal to 0");
        }
        initRe = modulus * Math.cos(argument);
        initIm = modulus * Math.sin(argument);
    }
    
    public String formatComplexNumberCartesian() {
        String r = this.getRe() + "+(" + this.getIm() + ")i";
        return r;
    }
    
    public String formatComplexNumberPolar() {
		String r = "Modulo:" + this.getModulus() + "  Argomento:" + this.getArgument();
		return r;
	}
    
    public ComplexNumber(){
        this.re = initRe;
        this.im = initIm;
    }

    /**
     * @return the re
     */
    public double getRe() {
        return re;
    }

    /**
     * @param re the re to set
     */
    public void setRe(double value) {
        this.re = value;
    }

    /**
     * @return the im
     */
    public double getIm() {
        return im;
    }

    /**
     * @param im the im to set
     */
    public void setIm(double value) {
        this.im = value;
    }
    
    public double getModulus(){
        double modulo = (float)Math.sqrt( ((float)Math.pow(this.im, 2)) + ((float)Math.pow(this.re, 2)) );
        return modulo;
    }

    public double getArgument(){
        double argomento = 0;		
	
		if(re==0 && im==0) argomento=0;
		
		else if ((re < 0 && im > 0) || (re < 0 && im <= 0))
			argomento = Math.toDegrees((Math.atan(im / re))) + 180; 
																 
																 
																  
		else if (re >= 0 && im < 0)
			argomento = Math.toDegrees((Math.atan(im / re))) + 360;
																  
																  
																  
		else if (re >= 0 && im >= 0)
			argomento = Math.toDegrees((Math.atan(im / re))); 
															       
        return argomento;
    }

    public void setRectangular(double re, double im){
        
        this.re = re;
	this.im = im;
        
    }

    public void setPolar(double Modulus, double Argument){
        
        if (Argument == 90 || Argument == 270)
		this.re = 0;
	else
		this.re = Modulus * (Math.cos((Argument) * Math.PI / 180));
	if (Argument == 180 || Argument == 360)
		this.im = 0;
	else
		this.im = Modulus * (Math.sin((Argument) * Math.PI / 180));
        
    }
    
}