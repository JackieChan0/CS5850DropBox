import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystem;
import java.nio.file.WatchService;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;


//main portion for dropbox

public class drop {
	
	public static void main(String[] args ) throws IOException {
		
		WatchService watcher = FileSystem.getDefault().newWatchService();
		watcher.watchService();
		
	}

}
