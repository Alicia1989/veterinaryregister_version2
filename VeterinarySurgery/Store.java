//when we using FileWriter, BufferedWriter and PrintWritern we need to include import java.io*.
import java.io.*;

public class Store {
    //FileWriter open the file where it is located, conect the java program to a file
    FileWriter fw = null;
    //BufferWriter opens the file and creates an input and output  to store all the date.
    BufferedWriter bw = null;
    //PrintWriter thakes the date from the buffer and store it on the data file.
    PrintWriter pw = null;
    
    // It takes to objects, Person  and Pet.
    public void saveData(Person personObject, Pet petObject) throws IOException {
        //Automaticaly create a file and establish a connection between java and the file.
        fw = new FileWriter("data.txt", true);
        //Saves data into buffer.
        bw = new BufferedWriter(fw);
        // Everithing is writed in the file.
        pw = new PrintWriter(bw);
        pw.append("\n");
        //Gets data from Pet
        pw.println(personObject.getData() + "\n" + petObject.getData());
        pw.println("------------------------------------------------");
        pw.flush();

    }

    public String getData() {
         String data="";
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            try {
                
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
               
                while (line != null) {
                   
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                data = sb.toString();
            } finally {
                br.close();
            }
        } catch (Exception e) {
        }
        
        return data;
    }
}
