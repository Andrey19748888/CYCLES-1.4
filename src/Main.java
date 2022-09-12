public class Main {
    public static void main(String[] args) {


        int salery = 29000;
        int total = 0;
        for (int i = 0; i < 12; i ++) {
            total = total + salery;
            System.out.println(" месяц " + i +  " сумма накоплений равна " + total + " рублей ");
        }
    }
}