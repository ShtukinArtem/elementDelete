import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var elementDelete = 5;
        int[] baseArray = {1, 2, 3, 4, 5};
        var deleteCounter = 0;
        for (var index = 0; index < baseArray.length; index++) {
            if (baseArray[index] == elementDelete) {
                deleteCounter++;
            } else {
                baseArray[index - deleteCounter] = baseArray[index];
            }
        }
        int[] newArray = Arrays.copyOf(baseArray, baseArray.length - deleteCounter);
    }
}