import java.util.*;

import javax.sound.midi.SysexMessage;

public class Main {
  public static void main(String[] args) {

    var names = new ArrayList<String>() {
      {
        add("Bob");
        add("Alice");
        add("John");
      }
    };
    names.add("jimbo");
    System.out.print(names);

  }
}