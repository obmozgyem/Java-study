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
import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) throws IOException {

        //ReadTransactions
        Map<String, Integer> balanceMap = ReadBalance.readBalance(); // получил значение c которым можно работать

        Map<String, Integer> resultBalanceMap = balanceMap;



        List<List> readTransaction = ReadTransactions.readTransaction();  //keyMap(0)   //valueMoney(2)  //personWhoGetMoney(1)
        List<String> personWhoGetMoney = readTransaction.get(1);


        List<String> personWhoTakeHisMoney = readTransaction.get(0);

        List<String> valueMoney = readTransaction.get(2);
        List<Integer> valueMapInteger = new ArrayList<>();
        for (String myInt : valueMoney) {
            valueMapInteger.add(Integer.valueOf(myInt));
        }


        for (int i = 0; i < personWhoGetMoney.size(); i++) {
            if (resultBalanceMap.containsKey(personWhoTakeHisMoney.get(i)) && resultBalanceMap.containsKey(personWhoGetMoney.get(i))) {
                Integer balance = resultBalanceMap.get(personWhoTakeHisMoney.get(i));
                Integer transaction = valueMapInteger.get(i);
                if (balance > transaction) {
                    resultBalanceMap.put(personWhoTakeHisMoney.get(i), resultBalanceMap.get(personWhoTakeHisMoney.get(i)) - valueMapInteger.get(i));
                }
                resultBalanceMap.put(personWhoGetMoney.get(i), resultBalanceMap.get(personWhoGetMoney.get(i)) + valueMapInteger.get(i));
            }
        }

        System.out.println(resultBalanceMap.toString());
        Map<String, Integer> sortedMap = resultBalanceMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        System.out.println(sortedMap.toString());



        File file = new File("resources", "balanceResult.dt");
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(file));
            FileWriter nFile = new FileWriter(file);

            for (Map.Entry<String, Integer> entry :
                    sortedMap.entrySet()) {

                bf.write(entry.getKey() + " "
                        + entry.getValue());

                     bf.newLine();
            }

            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




        //записьь в одну строчку
//        try {
//            File file = new File("resources", "balanceResult.dt");
//            FileWriter nFile = new FileWriter(file);
//
//            nFile.write(sortedMap.toString() + '\n');
//
//            nFile.close();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }

    }
}







