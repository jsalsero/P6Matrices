public class Matriz {

    private double[][] numeros;

    public Matriz(){}

    public Matriz(double[][] numeros){
        this.numeros = numeros;
    }

    public double[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(double[][] numeros) {
        this.numeros = numeros;
    }
    
    @Override
    public String toString(){
        String resultado = "";
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j<numeros[0].length; j++)
                resultado += numeros[i][j] + " ";
            resultado += "\n";
        }
        return resultado;
    }
    
    public Matriz suma(Matriz matrizB){
        double[][] A = this.getNumeros();
        double[][] B = matrizB.getNumeros();
        double[][] C = new double[0][0];
        if(A.length == B.length && A.length > 0)
            if(A[0].length == B[0].length){
                C = new double[A.length][A[0].length];
                for(int i = 0; i <A.length; i++)
                    for(int j = 0; j<A[0].length; j++)
                        C[i][j] = A[i][j]+B[i][j];
            }
        Matriz matrizC = new Matriz(C);
        return matrizC;
    }
}
