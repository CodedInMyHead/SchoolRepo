package dritter_block;

class ArrayReverse {
    public static void main(String[] args) {

        final int[] array = {11, 12, 5, 7, 4, 1, -3, 8, -2};
        final int LEN = array.length;
        if(LEN < 2) return;

        int biggest = array[0] >= array[1] ? array[0] : array[1];
        int secondBiggest = array[0] >= array[1] ? array[1] : array[0];

        if(LEN != 2) {
            for(int i = 2; i < LEN; i++) {
                if(array[i] > secondBiggest) {
                    if(array[i] > biggest) {
                        biggest = array[i];
                    } else {
                        secondBiggest = array[i];
                    }
                }
            }
        }

        System.out.println(biggest);
        System.out.println(secondBiggest);
    }
}