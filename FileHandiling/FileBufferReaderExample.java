import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileBufferReaderExample{
    public static void main(String s[]){
        String filepath = new String("Test.txt");

        try{

            FileReader filereader = new FileReader(filepath);
            BufferedReader bf = new BufferedReader(filereader);
 
            String line;

            while((line = bf.readLine())!=null) {
                System.out.print(line);
            }
             
            bf.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}