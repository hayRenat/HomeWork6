package HW;

//Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false;
// Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        [ 1 1 1 4 4 1 4 4 ] -> true
//        [ 1 1 1 1 1 1 ] -> false
//        [ 4 4 4 4 ] -> false
//        [ 1 4 4 1 1 4 3 ] -> false
public class OneOrFourInTheArray {

    public static boolean oneOrFourInTheArray(Integer[] integers){
        boolean isOne = false;
        boolean isFour = false;
        for (int i = 0; i <= integers.length-1; i++) {
            if (integers[i]==1){
                isOne = true;
            }else if (integers[i]==4){
                isFour = true;
            } else return false;
        }
        return isOne && isFour;
    }
}
