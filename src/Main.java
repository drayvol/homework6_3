public class Main {
    public static void main(String[] args) {
    //Задача 1
        int yearToday = 2022 ;
        int period = 79;
        int timeFirst = 200;
        int timeTwo = 100;
        int numberOfYears = (int)Math.ceil((yearToday - timeFirst)*1.0/period);
        for(;numberOfYears<=(yearToday+timeTwo)/period;numberOfYears++){
          System.out.println(numberOfYears*period);
        }

     //Задача 2
        int number = 2;
        for(int i = 1; i<=10; i++){
            System.out.println(number +"*"+i+"="+number*i);
        }

    }
}