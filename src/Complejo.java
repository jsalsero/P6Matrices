public class Complejo {
    private double real;
    private double im;
    
    public Complejo() {
        im = 0.0;
        real = 0.0;
    }
    
    public Complejo(double a, double b) {
        real = a;
        im = b;
    }
    
    public double getR() {
        return real;
    }
    
    public double getI() {
        return im;
    }
    
    Complejo suma(Complejo z) {
        return new Complejo(real + z.getR(), im + z.getI());
    }
    
    Complejo resta(Complejo z) {
        return new Complejo(real - z.getR(), im - z.getI());
    }
    
    Complejo multiplicacion(Complejo z) {
        return new Complejo(real * z.getR() - im * z.getI(), real * z.getI() + im * z.getR());
    }
    
    Complejo divicion(Complejo z) {
        if (z.real == 0 && z.im == 0) {
            System.out.println("ERROR: DIVISION ENTRE CERO\n");
            return z;
	}
	double r1 = Math.sqrt(real * real + im * im);
	double r2 = Math.sqrt(z.getR() * z.getR() + z.getI() * z.getI());
	double O1 = Math.atan(im / real);
	double O2 = Math.atan(z.getI() / z.getR());
	double R = r1 / r2;
	double O = O1 - O2;
	return new Complejo(R * Math.cos(O), R * Math.sin(O));
    }
    
    public double magnitud() {
        return Math.sqrt(real * real + im * im);
    }
}
