import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {

    String[] names = {"Bob", "Alice", "John"};
    for (var s : names){
      s.toUpperCase();
    }
    System.out.println(Arrays.toString(names));
  }
}