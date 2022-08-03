public class Main {
    public static void main(String[] args) {
        System.out.println(" Привет, Java!");

        // Задание 1
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        for (int i = counter - 1; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 2
        int monthDays = 31;
        for (int i = 1; i < monthDays; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + " - е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        // Задание 3
        int currentYear = 2022;
        int elementaryYear = currentYear - 200;
        int futureYear = currentYear + 100;
        for(int i = 0; i < futureYear; i = i + 79) {
            if (i > elementaryYear){
                System.out.println(i);
            }
        }
    }
}