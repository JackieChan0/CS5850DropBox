//Contains all the fucntions of what is to be included in the google drive
//detects: new files, deleted files, updated files



import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import com.google.api.client.http.FileContent;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;



public class GoogleDrive {
	
	//addition of new files into the folder
	public static void newFile(Drive action, File fileName) throws IOException{
		
		File newFileAdd = new File();
		newFileAdd.setName((fileName.toString));
		
		java.io.File fileName = new java.io.File("pathname" + fileName.toString());
		videoFile vidFile = action = new VideoFile();
		File file = action.files().create(vidFile);
		
	}
	
	//check deletion of files
	//fix
	public static boolean isFileDeleted(Drive action, File fileName) throws IOException{
		java.io.File files;
		
		//if no file exists to be deleted
		if(files.isEmpty()){
			return false;
		}
		
		java.io.File fileName = new java.io.File("pathname" + fileName.toString());
		if(fileName != ""){
			files.delete(fileName);
			return true;
		}
	}

	//check for modification of files
	public static boolean isFileModded(Drive action, File fileName ) throws IOException{
		java.io.File files;
			
		
	}
	//used to play the file?
	public static String fileSearch()throws IOException{
		
	}
}
