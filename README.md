# Double Transposition Cipher Tool 

A Java-based security tool that implements the **Double Transposition Cipher** algorithm. This project demonstrates how data can be secured by rearranging its structure through multiple rounds of row and column permutations.

##  Overview
The Double Transposition Cipher is a classical encryption technique that provides a higher level of security than a single transposition. It works by placing the plaintext into a grid of a specific size (Rows x Columns) and then reordering the rows and columns based on a secret key.

##  How it Works
1. **Grid Mapping:** The input message is mapped into a 2D matrix.
2. **Row Permutation:** Rows are rearranged according to a user-defined sequence.
3. **Column Permutation:** Columns are then rearranged to further scramble the data.
4. **Final Result:** The resulting ciphertext is significantly more difficult to decrypt without the exact grid size and permutation keys.

##  Features
- **Flexible Grid Sizes:** Supports any number of rows and columns that fit the message length.
- **Custom Keys:** Users can provide their own secret permutations for both rows and columns.
- **Clean Java Implementation:** Uses modern Java practices (Streams & Arrays) for efficient data handling.

##  How to Use
1. Compile the script: `javac DoubleTranspositionCipher.java`
2. Run the tool: `java DoubleTranspositionCipher`
3. Enter your message, grid dimensions, and the secret permutation orders when prompted.

---
*This tool was developed to explore the logic of classical cryptography.*
