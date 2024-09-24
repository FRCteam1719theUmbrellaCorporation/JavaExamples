public class _3Loops {
    int myNum = 5;               // Integer (whole number)
    double myFloatNum = 5.99;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String
    static int[] Array1 = {1,2,3,4,5};

    public static void main() {
        //System.out.println(GreaterThanTen(4, 8)); //Returns true if sum of numbers given is greater than 10
        //System.out.println(SumOfArray(Array1)); // Returns the sum of all the numbers within the array
        UntilGreaterThanTen(2, 3); //If the sum of numbers don't add to 10, repeat adding one and printing new sum 
    }

    public static boolean GreaterThanTen(int num1, int num2) {
        if (num1+num2 > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static int SumOfArray(int[] list) {
        int sum = 0;
        for (int i= 0; i<list.length; i++) {
            sum = sum + list[i];
            //sum+=list[i] Does the same thing
        }
        return sum;
    }

    public static int UntilGreaterThanTen(int num1, int num2) {
        int x = num1;
        while (GreaterThanTen(x, num2) == false) { //==false is not nessecary
            x=x+1; //x+=1 or x++ also work
            System.out.println(x+num2);
        } 
        return x;
    }



    


}
