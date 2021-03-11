package HW;

//1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
// Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
// Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
// Написать набор тестов для этого метода (по 3-4 варианта входных данных).
// Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].


import java.util.ArrayList;
import java.util.List;

public class ArrayAfterFour {

    public static Integer[] arrayAfterFour(Integer[] integers){
        List<Integer> afterFour = new ArrayList<>();
        for (int i = integers.length-1; i >= 0; i--) {
            if (integers[i] == 4){
                break;
            }
            afterFour.add(0, integers[i]);
        }
        Integer[] newArray = afterFour.toArray(new Integer[afterFour.size()]);
        if (integers.length == newArray.length){
            throw new RuntimeException("Данный ммассив не содержит цифры 4");
        }
        return newArray;
    }
}
