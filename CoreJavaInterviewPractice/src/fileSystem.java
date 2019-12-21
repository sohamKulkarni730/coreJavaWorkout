import java.io.File;
import java.util.List;

public class fileSystem {

    public static void main(String[] args) {
	File f = new File("C:\\Users\\AMOD\\AppData\\Roaming\\IDM\\DwnlData\\AMOD\\");
	File[] l = f.listFiles();
	int x=0,y = 0;
	for (File file : l) {
	    
	    if(file.isDirectory())
		if(file.length()==0)
		    file.delete();
		
	        
		    
	  
	}
	//System.out.println(x +" "+ y);
    }

}
