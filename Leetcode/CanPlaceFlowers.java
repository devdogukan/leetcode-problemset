public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {0, 1, 0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // [1, 0, 0, 0, 1], 1 => [1, 0, 1, 0, 1] => return true;
        // [1, 0, 0, 0, 1], 2 => [1, 0, 1, 0, 1], 1 => return false;

        /*
         * flowerbed[2]
         * if flowerbed[i-1] == 0 && flowerbed[i+1] == 0 
         */

        if (n == 0) return true;
        if (n > flowerbed.length) return false;

        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                return true;
            } 

            return false;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) continue;

            if (i == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            } else if (i == flowerbed.length - 1 && flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                n--;
            } else if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        if (n == 0) return true;

        return false;
    }
}
