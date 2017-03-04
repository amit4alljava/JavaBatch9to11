import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadManager {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int EOF  = -1;
		
		String urlAddress = "http://3.bp.blogspot.com/-Cq29XEXLbuM/UNfubYyxnzI/AAAAAAAAAX8/faSgIbDAZkU/s1600/sachin-tendulkars.jpg";
		URL url = new URL(urlAddress);
		String basepath = "/Users/amit/Documents/TestFileHandlingFeb/";
		int index = urlAddress.lastIndexOf("/");
		String path = basepath + urlAddress.substring(index+1);
		FileOutputStream fo = new FileOutputStream(path);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		BufferedInputStream bi = new BufferedInputStream(is);
		int singleByte = bi.read();
		while(singleByte !=EOF){
			//System.out.print((char)singleByte);
			bo.write(singleByte);
			singleByte = bi.read();
		}
		bo.close();
		bi.close();
		fo.close();
		is.close();
		System.out.println("File Store...");
		
	}

}





