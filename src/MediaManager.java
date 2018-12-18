import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class MediaManager {
    public ArrayList<File>readFolder(String folderName){
        File mediaFolder=new File(folderName);
        File[]listOfFiles=mediaFolder.listFiles();
        ArrayList<File>fileArr=new ArrayList<File>(Arrays.asList(listOfFiles));
        return fileArr;
    }
}
