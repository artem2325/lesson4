import java.util.*;

class Helper {
    public Integer[] inputMethod() {
        Scanner numberOfCells = new Scanner(System.in);    // Назначение размера массива
        System.out.println("How many cells should be in array?");
        int inputCells = numberOfCells.nextInt();
        Integer[] newArray = new Integer[inputCells];
        for (int i = 0; i < newArray.length; i++) {
            Scanner numberOfDigits = new Scanner(System.in);    // Заполнение ячеек массива
            System.out.println("Introduce your numbers: ");
            int inputNumbers = numberOfDigits.nextInt();
            newArray[i] = inputNumbers;
        }
        return newArray;
    }

    public void outputArray(Integer[] newArray) {
        System.out.println("Your introduced array: " + Arrays.toString(newArray));     // Вывод получившегося массива
    }

    public void outputSortedArray(Integer[] newArray) { // Этот метод можно просто полностью перенести вверх, ничего не поменяется, подумал, так будет красивее :)
        Scanner sort = new Scanner(System.in);   // Сортировка на выбор
        System.out.println("Would you like to sort your array? Type 'increase', if you want to sort by increase, if you want to sort by decrease, type 'decrease' , if you dont want to make sort, type 'no'.");
        String sort1 = sort.nextLine();
        if (sort1.equals("increase") || sort1.equals("Increase")) {
            Arrays.sort(newArray);
            System.out.println("Your array sorted by increase: " + Arrays.toString(newArray));
        } else if (sort1.equals("decrease") || sort1.equals("Decrease")) {
            Arrays.sort(newArray, Collections.reverseOrder());
            System.out.println("Your array sorted by decrease: " + Arrays.toString(newArray));
        } else if (sort1.equals("no") || sort1.equals("No")) {
            System.out.println("Your array wasn't sorted. Introduced array: " + Arrays.toString(newArray));
        }
    }
}

public class Sorting {
    public static void main(String[] Args) {
        Helper newTask = new Helper();
        Integer[] arr = newTask.inputMethod();
        newTask.outputArray(arr);
        newTask.outputSortedArray(arr);
    }
}