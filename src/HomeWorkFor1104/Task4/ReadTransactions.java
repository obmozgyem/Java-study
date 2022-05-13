package HomeWorkFor1104.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReadTransactions {


    public static List<List> readTransaction() {
        List<List> readTransaction = new ArrayList<>();
        // долго не мог решить ошибку в итоге убрал скобки все заработала, но в readbalanse все также, но
        //BufferedReader не в скобках
        try {
            BufferedReader transactionsReader = new BufferedReader(new FileReader(new File("resources", "transactions.dt")));
            {
                String transactionsLine = transactionsReader.readLine();
                List<String> personWhoGetMoney = new ArrayList<>();
                List<String> keyMap = new ArrayList<>();
                List<String> valueMap = new ArrayList<>();

                Map<String, Integer> transactionsMap = new HashMap<>();
                while (transactionsLine != null && transactionsReader.ready()) {
                    String[] transactionsArray = transactionsLine.split(" ");


                        personWhoGetMoney.add(transactionsArray[0]);
                        keyMap.add(transactionsArray[1]);
                        valueMap.add(transactionsArray[2]);

                    transactionsLine = transactionsReader.readLine();
                }
                readTransaction.add( personWhoGetMoney);
                readTransaction.add(keyMap);
                readTransaction.add(valueMap);
            }

        } catch (FileNotFoundException x) {
            x.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readTransaction;


    }


}

