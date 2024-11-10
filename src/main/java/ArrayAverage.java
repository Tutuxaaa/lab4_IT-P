public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4};
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                sum += (int) arr[i];
            }
            double average =  (double) sum / arr.length;
            System.out.printf("Среднее арифметическое: %f ", average);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Ошибка: нулевой указатель на массив.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
