import java.io.FileReader;

class FileReaderExample{
    public static void main(String s[]){
        try{
            FileReader filereader = new FileReader("Test.txt");
            int charater;

            while((charater = filereader.read())!=-1){
                System.out.print((char)charater);
            }
            filereader.close()
        }catch(Exception e){
             System.out.print(e);
        }
    }
}