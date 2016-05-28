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
    
    public Matriz multiplicacion(Matriz matrizB){
        double[][] A = this.getNumeros();
        double[][] B = matrizB.getNumeros();
        double[][] C = new double[0][0];
        if(A[0].length == B.length){
            C = new double[A.length][B[0].length];
            for(int i = 0; i<C.length; i++)
                for(int j = 0; j<C[0].length; j++){
                    C[i][j]=0;
                    for(int k = 0; k < A[0].length; k++){
                        C[i][j] += A[i][k]*B[k][j];
                    }
                }             
        }
        Matriz matrizC = new Matriz();
        matrizC.setNumeros(C);
        return matrizC;
    }
}
