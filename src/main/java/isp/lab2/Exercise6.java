package isp.lab2;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] vectorNerecursiv = new int[n];
        vectorNerecursiv[0] = 1;
        vectorNerecursiv[1] = 2;
        for (int i = 2; i < n; i++)
            vectorNerecursiv[i] = vectorNerecursiv[i - 1] * vectorNerecursiv[i - 2];
        return vectorNerecursiv;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    static int v =0, k = 0;
    static int[] vectorRecursiv;
    public static int[] generateRandomVectorRecursively(int n) {
        if (v == 0){
            vectorRecursiv = new int[n];
            vectorRecursiv[0] = 1;
            vectorRecursiv[1] = 2;
            v ++;
            k = 2;
        }
        if (k == n) return
                vectorRecursiv;
        else {
            vectorRecursiv[k] = vectorRecursiv[k - 2] * vectorRecursiv[k - 1];
            k++;
            return generateRandomVectorRecursively(n);
        }
    }


    public static void main(String[] args) {
        // TODO: print the vectors
        int[] vector = generateRandomVectorRecursively(7);
        for ( int i =0; i<7; i++)
            System.out.println(vector[i]);
    }
}
