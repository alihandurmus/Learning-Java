import java.util.Locale;//1453ISTANBUL2021 key
import java.util.Scanner;
public class Cipher {
    String key="";
    final String PlaintextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    String CiphertextAlphabet;

    public Cipher() {
        this.key = key;
        CiphertextAlphabet = initCiphertextAlphabet();
    }

    String initCiphertextAlphabet(){

        key = key.toUpperCase(Locale.ROOT);

        key = key.concat(PlaintextAlphabet);

        key = removeDups(key);

       return key;
    }
    static String removeDups(String s){
        StringBuilder result= new StringBuilder();

        for(int i = 0;i<s.length();i++)
        {
            if(!result.toString().contains(String.valueOf(s.charAt(i)))){
                result.append(String.valueOf(s.charAt(i)));
            }




        }

        return result.toString();
    }
    public String encrypt(String message){
        message = message.toUpperCase(Locale.ROOT);

        StringBuilder result = new StringBuilder();

        for(int i = 0;i<message.length();i++) {
            if(CiphertextAlphabet.contains(String.valueOf(message.charAt(i))))
            {
            int x = PlaintextAlphabet.indexOf(message.charAt(i));
            result.append(String.valueOf(CiphertextAlphabet.charAt(x)));
            }
            else
                result.append(String.valueOf(message.charAt(i)));

        }

     return result.toString();
    }
   String decrypt(String ciphertext){
        ciphertext = ciphertext.toUpperCase(Locale.ROOT);
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<ciphertext.length();i++)
        {
            if(CiphertextAlphabet.contains(String.valueOf(ciphertext.charAt(i)))) {
                int x = CiphertextAlphabet.indexOf(ciphertext.charAt(i));
                result.append(String.valueOf(PlaintextAlphabet.charAt(x)));
            }
            else
                result.append(String.valueOf(ciphertext.charAt(i)));

        }
        return result.toString();
    }
    public static void main(String[] args) {
        String message,ciphermessage;
        Cipher cipher = new Cipher();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the key:");
        cipher.key = scan.nextLine();
        cipher.CiphertextAlphabet = cipher.initCiphertextAlphabet();
        System.out.println(cipher.PlaintextAlphabet);
        System.out.println(cipher.CiphertextAlphabet);
        System.out.println("Enter the message:");
        message = scan.nextLine();
        System.out.println("Encrypted message:"+cipher.encrypt(message));
        System.out.println("Enter the encrypted message:");
        ciphermessage = scan.nextLine();
        System.out.println("Normal message:"+cipher.decrypt(ciphermessage));






    }
}
/**
 * Project 2 -- Cipher
 *
 * This is an implementation of encryption and decryption algorithms of a
 * substitution cipher
 *
 * @author your name
 *
 * @class BIL 122
 *
 * @date date of completion
 *
 */

/*public class Cipher {

    final String plaintextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Plaintext
    // Alphabet
    private String keyword; // The Secret Keyword
    private String ciphertextAlphabet; // Ciphertext Alphabet*/

/**
 * Class constructor initializes the keyword and creates the Ciphertext Alphabet
 *
 * @param key the secret keyword used to create the ciphertext alphabet
 */
   /* public Cipher(String key) {

    }*/

/**
 * removes all duplicate occurrences of characters from a String
 *
 * @param s String with duplicate occurrences of characters
 * @return String with no duplicate characters in it
 */
//  public static String removeDups(String s) {

// }

/**
 * generates the ciphertext alphabet from the keyword
 *
 * @return String of ciphertext alphabet generated from the keyword
 */
// public String initCiphertextAlphabet() {

// }

/**
 * Encrypts a message in plaintext
 *
 * @param message the message to be encrypted in ciphertext alphabet
 * @return the encrypted message in ciphertext alphabet
 */
// public String encrypt(String message) {

// }

/**
 * Encrypts a message in plaintext
 *
 * @param ciphertext ciphertext in ciphertext alphabet
 * @return the decrypted message in plaintext alphabet
 */
// public String decrypt(String ciphertext) {

// }

//}
