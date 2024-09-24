public class _4GroupCodeSolution {
    //Create a double array, and return the average of the list.
    static double [] scores = {100,95,44,67,88,89,88,76,93,91,77,81,80};
    public static void main() {
        System.out.println(average(scores));
    }

    public static double average(double[] list) {
        double average = 0.;
        for (int i = 0; i < list.length; i++) {
            average += list[i];
        }
        average/=list.length;
        return average;
    }
}
