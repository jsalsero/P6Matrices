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
        
    public Matriz multiplicacion(double A){
        double[][] B = this.getNumeros();
        for(int i = 0; i < B.length; i++)
            for(int j = 0; j < B[i].length; j++)
                B[i][j] = B[i][j]*A;
        this.setNumeros(B);
        return this;
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
    
    public Matriz resta(Matriz matrizB){
        double[][] A = this.getNumeros();
        double[][] B = matrizB.getNumeros();
        double [][] C = new double[0][0];
        if(A.length == B.length && A.length > 0)
            if(A[0].length == B[0].length){
                C = new double[A.length][A[0].length];
                for(int i = 0; i <A.length; i++)
                    for(int j = 0; j<A[0].length; j++)
                        C[i][j] = A[i][j]-B[i][j];
            }
        Matriz matrizC = new Matriz(C);
        return matrizC;
    }
    
    public Matriz invierte(){
        double[][] original = this.getNumeros();
        double[][] nuevo = new double[original.length][];
        for(int i = 0; i < original.length; i++){
            nuevo[i] = new double[original[i].length];
            for(int j = 0; j < original[i].length; j++)
                nuevo[i][j] = original[i][j];
        }
        nuevo = invert(nuevo);
        return new Matriz(nuevo);
    }

    public double[][] invert(double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i) 
            b[i][i] = 1;
 
        // Transform the matrix into an upper triangle
        gaussian(a, index);
 
        // Update the matrix b[i][j] with the ratios stored
        for (int i=0; i<n-1; ++i)
            for (int j=i+1; j<n; ++j)
                for (int k=0; k<n; ++k)
                    b[index[j]][k]
                            -= a[index[j]][i]*b[index[i]][k];
 
 // Perform backward substitutions
        for (int i=0; i<n; ++i) 
        {
            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j) 
            {
                x[j][i] = b[index[j]][i];
                for (int k=j+1; k<n; ++k) 
                {
                    x[j][i] -= a[index[j]][k]*x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }
 
// Method to carry out the partial-pivoting Gaussian
// elimination.  Here index[] stores pivoting order.
 
    public void gaussian(double a[][], int index[]) 
    {
        int n = index.length;
        double c[] = new double[n];
 
 // Initialize the index
        for (int i=0; i<n; ++i) 
            index[i] = i;
 
 // Find the rescaling factors, one from each row
        for (int i=0; i<n; ++i) 
        {
            double c1 = 0;
            for (int j=0; j<n; ++j) 
            {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }
 
 // Search the pivoting element from each column
        int k = 0;
        for (int j=0; j<n-1; ++j) 
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i) 
            {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) 
                {
                    pi1 = pi0;
                    k = i;
                }
            }
 
   // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i)   
            {
                double pj = a[index[i]][j]/a[index[j]][j];
 
 // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;
 
 // Modify other elements accordingly
                for (int l=j+1; l<n; ++l)
                    a[index[i]][l] -= pj*a[index[j]][l];
            }
        }
    }
    
    public boolean comparar(Matriz matrizB){
        double[][] A = this.getNumeros();
        double[][] B = matrizB.getNumeros();
        for(int i = 0; i < A.length; i++)
            for(int j = 0; j < A[i].length; j++){
                if(A[i][j] != B[i][j])
                    return false;
            }
        return true;
    }
    
    public void imprimir(){
        double[][] A = this.getNumeros();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j<A[0].length; j++)
                System.out.print(""+A[i][j]+" "); 
            System.out.println("");
        }
    }

    public double sumaDeComponentes(){
        double[][]A = this.getNumeros();
        double total = 0;
        for(int i = 0; i < A.length; i++)
            for(int j = 0; j < A[i].length; j++)
                total += A[i][j];
        return total;
    }
    

}
