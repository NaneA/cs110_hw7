import Animals.*;
import Utils.*;
public class Driver{
  public static void main(String[] args){
    Puppy Joey = new Puppy("Joey");
    Puppy Chandler = new Puppy("Chandler");
    Puppy Ross = new Puppy("Ross");
    Joey.getName();
    Chandler.getName();
    Ross.getName();
    int[] arr = {9, 20, 3, 44, 88, 300};

    System.out.println(ArrayUtils.stringifyArray(arr));

    System.out.println(math.factorial((int)15.4));
  }

}
