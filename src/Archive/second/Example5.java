package Archive.second;
/*
        Банк предлагает вклад под процент. Дано: начальная сумма вклада startSum, процент годовых proc,
         количество лет years, на которые совершается вклад.
         Сумма индексируется каждый год (это значит, что после каждого года процент начисляется не на изначальную сумму,
         а на текущую). Вывести, сколько денег будет на счету после years лет.
        *доп. Каждый год банк вычитает из суммы вклада налог в размере 1% от изначального вклада.
         */

public class Example5 {
    public static void main(String[] args) {
        double starSum = 10000;
        double proc = 10;
        double years = 2;
        double allmoney = money(starSum, proc, years);
        System.out.println(allmoney);
    }

    public static double money(double starSum, double proc, double years) {
        double result = starSum;
        double proc2 = proc / 100;
        for (int i = 0; i < years; i++) {
            result += (result - (result / 100)) * proc2;
        }
        return (result - (result / 100));
    }

}

