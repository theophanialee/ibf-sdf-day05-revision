package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MailerDB {

    public static void main (String[] agrs) {
        System.out.println("Start reading CSVdata...");

        String csvFilePath = "/Users/qtp/Desktop/TFIP/SDF/workshops/DAY05-REVISION/task01/CSVdata.csv";

        // for data manipulation
        // List<Map<String, String>> csvDataList = new ArrayList<>(); 
        
      
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
        String [] headers = br.readLine().split(",");

        String line;

    //   System.out.println("headers: " + Arrays.toString(headers));

      // not null meaning not index 0, reads from index 1 => data row
        while ((line = br.readLine()) != null) {
       
         String [] values = line.split(",");
         Map<String, String> rowMap = new HashMap<>();

         for (int i=0; i<headers.length; i++) {
            String header = headers[i].trim();
            String value = values[i].trim();

            rowMap.put(header, value);
         }

         
         for (Map.Entry<String, String> entry : rowMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(); // Print a blank line between rows

        //add the map into the list to manipulate the data eg filtering, sorting, calculations, works like a csv
        //  csvDataList.add(rowMap);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // for (Map<String, String> rowData: csvDataList) {
        //     for (Map.Entry<String, String> entry: rowData.entrySet()) {
        //         System.out.println(entry.getKey() + ": " + entry.getValue()); 
        //     }
        
        // }
    }




}
