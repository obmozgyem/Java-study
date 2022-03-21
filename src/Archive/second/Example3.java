package Archive.second;
public class Example3 {
    public static void main(String[] args) {
    /*
    Даны зарплаты трех людей salary1, salary2 и salary3. Найти разницу между максимальной и минимальной зарплатой.
     */
//        int maxValue;
//        int minValue;
    int salary1 = 100;
    int salary2 = 1500;
    int salary3 = 3000;
//        int min = Math.min(salary1, salary2);
        int min1 = Math.min(salary2, salary3); // так быстрее код
        int resultmin= Math.min(salary1, min1);

        int max = Math.max(salary1, salary2);
        int max1 = Math.max(salary2, salary3);
        int resultmax= Math.max(max, max1);

        System.out.println(resultmax-resultmin);



//        System.out.println((maxValue - minValue);
//
//            if (salary1 < salary2 && salary1 < salary3) {
//       int minValue = salary1;
//                }
//    else if (salary1 > salary2 && salary1 > salary3) {
//               int maxValue = salary1;
//               }
//    else if (salary2 < salary1 && salary2 < salary3) {
//       int minValue = salary2;                    }
//    else if  (salary2 > salary1 && salary2 > salary3) {
//       int maxValue = salary2;
//    }
//    else if (salary3 < salary1 && salary3 < salary2) {
//        int minValue = salary3;
//    }
//    else if (salary3 > salary1 && salary3 > salary2) {
//       int maxValue = salary3;
//    }


        }

}




