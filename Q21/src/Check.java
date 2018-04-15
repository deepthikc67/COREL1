import java.io.File;
import java.util.Scanner;


public class Check {
	
            private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
            public static void main(String[] args) {
   
            	
                File file = new File("/Users/pankaj/java.txt");        	
              
				System.out.println("File extension is: "+getFileExtension(file));
          
            }
}
