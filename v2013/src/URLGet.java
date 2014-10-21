import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class URLGet {
	public static void main(String[] args) throws IOException{
		String urlString="http://www.nytimes.com/2012/12/01/business/online-retailers-rush-to-adjust-prices-in-real-time.html";
		URL u=new URL(urlString);
		URLConnection connection = u.openConnection();
		
		HttpURLConnection httpConnection= (HttpURLConnection) connection;
		if(httpConnection.getResponseCode()!=200)
			return;
		else{
			InputStream instream = connection.getInputStream();
			Scanner in = new Scanner(instream);
			String outputFileName="/Users/DanZhu/Downloads/output.txt";		
			PrintWriter out=new PrintWriter(outputFileName);
			
			while (in.hasNextLine())
			{
				String input = in.nextLine();
				out.println(input);
			}
			return;
		}		
	}
}
