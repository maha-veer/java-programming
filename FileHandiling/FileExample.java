import java.io.File;
import java.io.FileWriter;

class FileExample{
    public static void main(String arg[]){
        File file = new File("Test.txt");
        if(file.exists()){
            System.out.println("already exists");
        }else{

            try{
                if(file.createNewFile()){
                    System.out.println("File creatd");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
           
        
        }
}









