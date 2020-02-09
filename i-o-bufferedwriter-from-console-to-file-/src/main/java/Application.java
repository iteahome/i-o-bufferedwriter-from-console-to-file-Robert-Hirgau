import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner scannerKeyboard = null;
        Writer outputStream = null;
        try {
            scannerKeyboard = new Scanner(System.in);
            outputStream = new BufferedWriter(new FileWriter("console2file.txt"));
            System.out.println("Write text and finish with 'exit':");
            String line = scannerKeyboard.nextLine();
            while (!line.equals("exit")) {
                outputStream.write(line+" ");
                line = scannerKeyboard.nextLine();
            }
        } finally {

        outputStream.close();
        }
    }
}

/*Read strings from console. Write those strings in a file. Stop when input string is 'exit';

Input (example)

> I love

> ITeahome

> courses.

> exit

Output -> console2file.txt

I love ITeahome courses.

 */