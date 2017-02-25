import java.util.ArrayList;
import java.util.List;

public class Main {

  public static ArrayList<Integer> findRange(final List<Integer> A, Integer B) {
    //System.out.print("Entering function");
    ArrayList<Integer> result = new ArrayList<Integer>();

    int start = 0;
    int end = A.size() - 1;
    int mid = 0;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (B > A.get(mid)) {
        start = mid + 1;
      } else
        end = mid;
    }

    int low;
    if (B != A.get(start)) {
      result.add(-1);
      result.add(-1);
      return result;
    } else
      low = start;

    start = 0;
    end = A.size() - 1;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (A.get(mid) < B + 1)
        start = mid + 1;
      else
        end = mid;
    }

    int high = 0;
    if (A.get(start) == B)
      high = start;
    else
      high = start - 1;
    System.out.print(low + " " + high);
    result.add(low);
    result.add(high);
    return result;
  }

  public static void main(String[] args) {

    int B = 8;
    List<Integer> A = new ArrayList<Integer>();
    A.add(5);
    A.add(7);
    A.add(7);
    A.add(8);
    A.add(8);
    A.add(8);
    A.add(8);
    A.add(9);
    A.add(9);
    A.add(10);
    ArrayList<Integer> result = findRange(A, B);
    for (int i = 0; i < result.size(); i++)
      System.out.print(result.get(i) + " ");
  }

}

