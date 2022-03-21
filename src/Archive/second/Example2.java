package Archive.second;

public class Example2 {
    public static void main(String[] args) {
        /*
        Дана температура в градусах. Вывести на экран , что лучше надеть: куртку, свитер, майку или ничего.
Например,при температуре менее 10 – куртку, от 10 до 15 – ветровку, от 16 до 20 свитер,от 21 до 30 майку, выше 30 – ничего.
         */
        int temperature = 11;
        String clothes;

        if (temperature <= 10) {
            clothes = "jacket";
        } else if (temperature < 15) {
            clothes = "windbreaker";
        } else if (temperature < 20) {
            clothes = "sweater";
        } else if (temperature < 30) {
            clothes = "shirt";
        } else {
            clothes = "Nothing";
        }
        System.out.println("Сегодня надеаем " + clothes);
    }
}

