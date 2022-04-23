package HomeWorkFor1104.Task4;

/*
В файле balance.dt хранятся данные о балансе счетов людей. Имена не повторяются.
В файле transactions.dt хранятся данные о транзакциях - кто и кому пытался передать деньги.
Обратите внимание, транзакция может быть невалидной, если невозможно определить отправителя или получателя средств,
а также если на счету отправителя не хватает средств для перевода. В таком случае транзакция отклоняется (не выполняется).
Записать в выходной файл количество средств на счетах людей после выполнения валидных транзакций, отсортированные по именам (по алфавиту).
Файлы с входными данными в архиве в аттаче.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
//        File file1 = new File("resources", "balance.dt");
//        File file2 = new File("resources", "transactions.dt");
//        HashMap balanceMap = new HashMap<>();
//        HashMap transactionsMap = new HashMap<>();
//        List<String> listTransactions = new ArrayList<>();
//
//        try (BufferedReader balance = new BufferedReader(new FileReader(file1))) {
//            String number = balance.readLine();
//            String[] balanceArray = number.split(" ");
//
//            for (int i = 0; i < balanceArray.length; i++) {
//                balanceMap.put(balanceArray[0], Integer.parseInt(balanceArray[1]));
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader transactions = new BufferedReader(new FileReader(file2))) {
//
//            String transactionsNumber = transactions.readLine();
//            String[] transactionsArray = transactionsNumber.split(" ");
//
//            for (int i = 0; i < transactionsArray.length; i++) {
//                listTransactions.add(transactionsArray[1]);
//                transactionsMap.put(transactionsArray[0], Integer.parseInt(transactionsArray[2]));
//
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
