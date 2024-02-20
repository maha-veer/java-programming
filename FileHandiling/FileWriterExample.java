import java.io.FileWriter;

class FileWriterExample{

    public static void main(String s[]){
        
        try{
            FileWriter filewriter = new FileWriter("Test.txt");
            filewriter.write("Hi I am Mahaveer");
            filewriter.close();
        }catch(Exception e){
            System.out.print(e);
        }
    }

}