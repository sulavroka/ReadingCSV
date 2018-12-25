import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csvFile = "/Users/tekendraroka/Documents/workspace/ReadingCsvFile/src/addresses.csv";
		BufferedReader in; 
		String line = "";
        String cvsSplitBy = ",";
		
        try{
        	in = new BufferedReader(new FileReader(csvFile));
            while ((line = in.readLine()) != null) {

                // use comma as separator
                String[] ad = line.split(cvsSplitBy);

                System.out.println("ADD [Ad 2= " + ad[2] + " , ad 3=" + ad[3] + "]");
        	  	
        	
            }
        }
        catch (Exception e){
        	e.printStackTrace();
        }
        
        
	
}
	
}	
	
