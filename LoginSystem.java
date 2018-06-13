package sutda;
import java.util.*;
import java.io.*;

public class LoginSystem {
	Reader isr;   				//Reader
    BufferedReader br = null;
    InputStream fis;
    
    Writer osw;					//Writer
	BufferedWriter bw = null;
    OutputStream fos;
    PrintWriter pw = null;
   
    	
    public Player NewID(String Sname, String Spassword) {
    	Player newID = new Player();
    	newID.name = Sname;
    	newID.password = Spassword;
    	
    	return newID;
    }
	
	public Player ReadID(String filename,String Sname, String Spassword) throws IOException{
		
		Player ReadP = new Player();
		try {
	    	
	        fis = new FileInputStream (filename);
	        isr = new InputStreamReader (fis);
	        br  = new BufferedReader (isr);
		
	        
	        String data;
	        while((data = br.readLine()) != null) {
	        	
	    
		       String[] a = data.split(",");
		       		    	  
		       if(a[0]== Sname && a[1]== Spassword) {
		    		   ReadP.name = Sname;
		    		   ReadP.password = Spassword;
		    		   int k = Integer.parseInt(a[2]);
				       ReadP.money = k;
				       break;
		       }		    	     
	        }	        
	      } catch (IOException e) {
	         e.printStackTrace ();
	      } finally {
	         br.close ();
	      }
		
		return ReadP;
	}
	
	public void SaveID(Player P){
		
		BufferedWriter bw = null;
	    PrintWriter pw = null;
	    

	    try {

	       
	       bw  = new BufferedWriter (new FileWriter("IDList.csv",true));
	       pw = new PrintWriter(bw,true) ;

	       
	       pw.write(P.name);
	       pw.write(",");
	       pw.write(P.password);
	       pw.write(",");
	       String a = Integer.toString(P.money);
	       pw.write(a);
	       bw.newLine();
	       pw.flush();
	       	       	       	      	       	       
	    } catch (IOException e) {

	       e.printStackTrace ();

	    } finally {

	       pw.close ();

	    }

		
	}
}
