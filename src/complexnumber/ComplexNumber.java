package complexnumber;

public class ComplexNumber {
    private double re;
    private double im;
    
    public String formatComplexNumber() {
        String r = this.getRe() + "+(" + this.getIm() + ")i";
        return r;
    }
    
    public ComplexNumber(){
        this.re = 0;
        this.im = 0;
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
    
}

    public void setModulus(){
        
}

    public void setArgument(){
    
}
    
}