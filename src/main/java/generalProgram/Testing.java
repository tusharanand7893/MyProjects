package generalProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Testing {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://jsonmock.hackerrank.com/api/moviesdata/search/?Title=maze");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.connect();
        System.out.println(con.getInputStream());


      /*  BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String sr=br.readLine();
        System.out.println(sr);
        String s=sr.substring(sr.indexOf("\"total\":"), +sr.indexOf(",\"total_pages\""));
     //  String s=op.substring(sr.indexOf("total:"),sr.indexOf(",total_pages"));
        int i= Integer.parseInt(s.split(":")[1]);
        System.out.println(i);*/

    }



}
