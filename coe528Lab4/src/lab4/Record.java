package lab4;
import java.io.*;
import java.util.*;
/**
 *
 * @author ivan wang 501086429
 */
public class Record {

    // Name of the associated file
    private String filename;
    // Sole instance of Record class
    private static Record instance = null;
    
    public Record(String n) {
        filename = n;
    }
    // Static method obtain the sole instance of Record class
    public static Record getInstance(String n)
    {
        if(instance == null)
        {
            instance = new Record(n);
        }
        return instance;
    }
    // Effects: Reads and prints the contents of the associated
    // file to the standard output.
    public void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename)))
        {
           //Written Code here
           String line;
           while((line = reader.readLine()) != null)
           {
               System.out.println(line);
           }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg) {
        try (FileWriter writer = new FileWriter(filename, true))
        {
            //Written Code here
            writer.write(msg);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Fill the blank below that obtains the sole instance
        // of the Record class.
        // (You should not invoke the Record constructor here.)
        Record r = Record.getInstance("record.txt");
        // Do not modify the code below
        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt "
                + "contains the following lines:");
        r.read();
    }
}
