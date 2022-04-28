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
    public static void main(String[] args) throws FileNotFoundException {
                 /*                    //ReadTransactions2
        Map<String, Integer> balanceMap = ReadBalance.readBalance(); // получил значение c которым можно работать
        Map<String, Integer> resultBalanceMap = balanceMap;
        System.out.println(balanceMap.toString());
        System.out.println(resultBalanceMap.toString());  */

        //ReadTransactions
        Map<String, Integer> balanceMap = ReadBalance.readBalance(); // получил значение c которым можно работать

        Map<String, Integer> resultBalanceMap = balanceMap;
        System.out.println(resultBalanceMap.toString());
        List<List> readTransaction = ReadTransactions.readTransaction();  //keyMap(0)   //valueMoney(2)  //personWhoGetMoney(1)
        List<String> personWhoGetMoney = readTransaction.get(1);
        System.out.println(personWhoGetMoney.toString());

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





        /*      Map<String, Integer> mapTransaction = new HashMap<>();   // если делать мапу транзакции, то перезаписываются она
                                                                          надо во время чтения сделать
        for (int i = 0; i < valueMapInteger.size(); i++) {
            mapTransaction.put(keyMap.get(i), valueMapInteger.get(i) );

        }
        System.out.println(mapTransaction.size());
     System.out.println(mapTransaction.toString()); */




//        try {
//                File file = new File("resources", "balanceResult.dt");
//                FileOutputStream f = new FileOutputStream(file);
//                ObjectOutputStream s = new ObjectOutputStream(f);
//                s.writeObject(resultBalanceMap);
//                s.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


//
//
//        File resultBalance = new File("resources", "balanceResult.dt");
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultBalance))) {
//
//            bufferedWriter.write(resultBalanceMap);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//



    }
}



