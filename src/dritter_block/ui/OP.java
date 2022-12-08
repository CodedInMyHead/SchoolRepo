package dritter_block.ui;
import java.util.Arrays;

public class OP {

    public static void main(String[] args) {
         new MichaFrame();

         doStuff(new int[]{1,2,3,4,5}, 3);
    }

    private static int doStuff(int[] numbers, int target) {
        return Arrays.asList(numbers).indexOf(target);
    }
}
