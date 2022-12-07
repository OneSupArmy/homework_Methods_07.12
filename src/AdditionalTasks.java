public class AdditionalTasks {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Средняя сумма трат за месяц составила " + averageCost(randomArray()) + " рублей");
    }
    public static int[] randomArray() {
        int[] randomArray = new int[30];
        for (int i = 0; i < randomArray.length; i++)
            randomArray[i] = (int) (Math.random() * 100_000 + 100_000);
        return randomArray;
    }
    public static double averageCost (int[] array){
        return summaryMonthCost(array)/array.length;
    }
    public static double summaryMonthCost(int[] array){
        double sum = 0;
        for (int i : array)
            sum += i;
        return sum;
    }
}
