public class _2Types {
  
    public static void main() {

      //System.out.println(integeraddition(4, 3)); //integer addition
      //System.out.println(doubleaddition(1.,1.)); //double addition

      //System.out.println(integeraddition2(2.0,3.0)) //Question for others

      //System.out.println(checkingaddition(5,6,10)); //Boolean question - does x plus y equal z?
      //System.out.println(mynameis("Neel")); //Returns my name is (name)
      //System.out.println(characterplace("Neel",2)); //Returns the nth char of the given string

      //int[] array= {4,3,2,1}; //Number array
      //System.out.println(Arraytestscores(array, 3)); returns nth index of array

      //System.out.println(Arraytestscores(4, 3)); question for others
    }

    public static int integeraddition(int x, int y) {
      return x+y;
    }

    public static double doubleaddition(double x, double y) {
      return x+y;
    }
    
    /*public static int doubleaddition2(double x, double y): {
      return x+y
    }
    */ 

    public static boolean checkingaddition(double x, double y, double z) {
      return x+y==z;
    }

    public static String mynameis(String name) {
      return ("My name is "+ name);
    }

    public static char characterplace(String word, int pos) {
      return word.charAt(pos);
    }

    public static int Arraytestscores(int[] list, int pos) {
      return list[pos];
    } 




  }