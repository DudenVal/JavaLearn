package seminar1.tasks;

public class Task2 {
    // 1 1 0 1 1 1
    public static int array(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int item : array) {

            if (item == 1) {
                count++;

            } else {

                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
