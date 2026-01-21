import java.util.Arrays;
import java.util.Scanner;

public class DoubleTranspositionCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the plaintext (including spaces):");
        String plaintext = scanner.nextLine();

        
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        //  (secret password)
        System.out.println("Enter the row permutation (space-separated):");
        int[] rowOrder = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Enter the column permutation (space-separated):");
        int[] colOrder = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        
        String encryptedText = encrypt(plaintext, rows, cols, rowOrder, colOrder);
        System.out.println("Encrypted text: " + encryptedText);
    }

    
    public static String encrypt(String plaintext, int rows, int cols, int[] rowOrder, int[] colOrder) {
        // Fill the matrix with plaintext (with spaces )
        char[][] matrix = new char[rows][cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (index < plaintext.length()) {
                    matrix[i][j] = plaintext.charAt(index++);
                } else {
                    matrix[i][j] = ' '; 
                }
            }
        }

       
        char[][] rowTransposed = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            rowTransposed[i] = matrix[rowOrder[i]];
        }
        
        char[][] finalTransposed = new char[rows][cols];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                finalTransposed[j][i] = rowTransposed[j][colOrder[i]];
            }
        }
        
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                encryptedText.append(finalTransposed[i][j]);
            }
        }

        return encryptedText.toString();
    }
}
