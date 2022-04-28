package HomeWorkFor1104.Task4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadBalance {


    public static Map<String,Integer> readBalance()  {
        Map<String, Integer> balanceMap = new HashMap<>();


        try (BufferedReader balance = new BufferedReader(new FileReader(new File("resources","balance.dt")))) {
            String number = balance.readLine();
            while ( balance != null &&  balance.ready()) {
           number = balance.readLine();
            String[] balanceArray = number.split(" ");

                balanceMap.put(balanceArray[0], Integer.parseInt(balanceArray[1]));

            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return balanceMap;
    }
}
