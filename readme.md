# Java Quickref

## Comments

```java
// Single line comment
/* Multi
line
comment */
```

## Primitives

| Data Type | Default Value | Size (in bytes) 1 byte = 8 bits |
| --------- | ------------- | ------------------------------- |
| boolean   | FALSE         | 1 bit                           |
| char      | “ “ (space)   | 2 byte                          |
| byte      | 0             | 1 byte                          |
| short     | 0             | 2 byte                          |
| int       | 0             | 4 byte                          |
| long      | 0             | 8 byte                          |
| float     | 0.0f          | 4 byte                          |
| double    | 0.0d          | 8 byte                          |

## Operators

| Category                | Operators                                          |
| ----------------------- | -------------------------------------------------- |
| Arithmetic              | +, -, /, \*, %                                     |
| Relational              | <, >, <=, >=,==, !=                                |
| Logical                 | && , \|\|                                          |
| Assignment              | =, +=, −=, ×=, ÷=, %=, &=, ^=, \|=, <<=, >>=, >>>= |
| Increment and Decrement | ++, --                                             |
| Conditional             | ?, :                                               |
| Bitwise                 | ^, &, \|                                           |

## Methods

```java
returnType methodName(parameter list){
  //do stuff
  return value;
}

public static void main(String[] args){ }
```

## Conditionals

```java
if (x > 10){
 foo();
} else if (x > 5){
  bar();
} else {
  fooBar();
}

y = x > 10 ? itWasTrue() : itWasFalse();

int day = getDayOfTheWeek();
String result;
switch(day){
  case 0:
    result = "Sunday";
    break;
  case 1:
    result = "Monday"
    break;
  default:
    result = "unknown";
    break;
}
```

## Loops

```java
String s = "hello";
for (int i = 0; i < s.length(); i++){
  System.out.println(s.charAt(i));
}

for (char c : s.toCharArray()){
      System.out.println(c);
    }

int j = 0;
while (j < s.length()){
  System.out.println(s.charAt(j));
  j++;
}

int k = 0;
do {
  System.out.println(s.charAt(k));
  k++;
} while (k < s.length());

break;    // break out of loop entirely
continue; // break out of this iteration
```

## Exceptions

```java
try {
  int x = 42 / 0;
} catch (ArithmeticException e) {
  System.out.println("Division by zero");
} catch (Exception e) {
  System.out.println("Not run because upper exception is caught");
} finally {
  System.out.println("Always executed last");
}

if (blah){
  throw new IllegalArgumentException("Bad param");
}
```

## Enum

```java
enum Level {
  LOW,
  MED,
  HIGH
}
```

## Strings

- Escape sequences
  - `\n` newline
  - `\t` tab

```java
String s = new String(myCharArray);
String s = "hello";
s += " " + "there"; //concats

String.format("%s is %d years old.", "Bob", 30); // Interpolation

s.length()
s.toLowerCase(), s.toUpperCase()
s.trim()

s.contains(s2)
s.startsWith(s2), s.endsWith(s2)
s.charAt(index)
s.indexOf(s2), s.indexOf(s2, fromIndex)
s.lastIndexOf(s2), s.lastIndexOf(s2, fromIndex)
s.substring(beginIndex)
s.substring(beginIndex, endIndexExclusive)

s.replace("he", "HE")   //replaces all instaces of `he`
s.replaceAll("\\s", "") //same as replace but takes a regex

s.equals(s1),s.equalsIgnoreCase(s1)
left.compareTo(right)

s.toCharArray()
s.split(regex) //returns String[], just contains s if no regex hits

// See StringBuffer for multithreading situations
// StringBuilder has equivalent methods for:
//    length, substring, indexOf, lastIndexOf, replace
StringBuilder sb = new StringBuilder(initialCapacity);
sb.append("append me")
sb.delete(beginIndex, endIndexExclusive) //rm a substring
sb.deleteCharAt(index)
sb.setCharAt(index)
sb.insert(index, "my string")
sb.reverse()
return sb.toString();
```

## Regexes

| Metachars | Info                             |
| --------- | -------------------------------- |
| \|        | Pattern separator, eg bob\|alice |
| .         | Any single char                  |
| ^         | First char                       |
| $         | Last char                        |
| \d        | Digit                            |
| \s        | Whitespace char (includes tabs)  |

| Range  | Info                         |
| ------ | ---------------------------- |
| [abc]  | Any char in the brackets     |
| [^abc] | Any char NOT in the brackets |
| [0-9]  | Any char in range 0-9        |

| Quantifier | Info                                       |
| ---------- | ------------------------------------------ |
| n+         | At least one of n                          |
| n\*        | At least zero of n                         |
| n?         | Zero or one n                              |
| n{x}       | Sequence of n that occurs x times          |
| n{x,y}     | Sequence of n that occurs x-y times        |
| n{x,}      | Sequence of n that occurs at least x times |

| Example | Info                         |
| ------- | ---------------------------- |
| \\s+    | One or more whitespace chars |

## Math

```java
//No need to import anything to call Math.blah()
import static java.lang.Math.*; //static import

abs(int a)
addExact(int x, int y)
ceil(double a), floor(double a)
max(int a, int b), min(int a, int b)
pow(double a, double b) // power, exponent
round(double a) //returns closest long
round(float a) //return closest int
//Methods of the form opExact() throw an exception if the result overflows
```

## Random nums

```java
import java.util.Random;
Random rand = new Random();
rand.nextInt(upperBound) //    0 <= output < upperBound
rand.nextFloat()         // 0.0f <= output < 1.0f
rand.nextDouble()        // 0.0d <= output < 1.0d

Math.random()            // 0.0d <= output < 1.0d
(int)(Math.random()*100) // 0 <= output < 100
```

## Arrays

- Will not auto-resize

```java
int[][] intMatrix = new int[10][10];
String[] names = {"Bob", "Alice", "John"};
String first = names[0];
names[0] = "Robert";
int len = names.length;
String[] namesCopy = names.clone(); //copies contents
//See Arrays.equals(arr0,arr1) below for comparing arrays
```

## java.util.Arrays

```java
import java.util.Arrays;
object[] arr
Arrays.toString(arr) //useful for pretty printing
Arrays.binarySearch(arr, key) //returns index, arr must be sorted
Arrays.equals(arr0, arr1) // checks length and arr0[i].equals(arr1[i]) for all i
Arrays.fill(arr, value) //assings value to each element in arr
Arrays.mismatch(arr0, arr1) //index of first mismatch (includes DNEs) or -1 if none found
Arrays.sort(arr) // merge sort, must implement equals() method for custom objects
```

## ArrayLists
- Implements List interface
- Can't use primitives (ex: int has to be Integer)
- Auto-resize

```java
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

ArrayList<String> names = new ArrayList<String>();
names.add("Bob"); names.add("Alice"); names.add("John");

//Single line init:
List<String> names = Arrays.asList("Bob", "Alice", "John");

String first = names.get(0);
names.set(0, "Robert")
names.remove(0)
names.contains("Jim")
names.clear() //removes all elements
names.size() //length
names.addAll(names2) //combine 2 lists
names.indexOf(Object o), lastIndexOf(Object o) //int index or -1 for DNE
names.isEmpty()
names.sort(Comparator<? super E> c) //pass in lambda
names.toArray()
names.removeIf(Predicate<? super E> filter) //TODO
```

## java.util.Collections

```java
import java.util.Collections;
List<String> list = Arrays.asList("Bob", "Alice", "John");

Collections.fill(coll, T obj) //assings value to each element
Collections.frequency(coll, Object o)
Collections.indexOfSubList(list, Arrays.asList("Alice", "John"))
Collections.max(coll), min(coll)
Collections.replaceAll(list, T oldVal, T newVal)
Collections.reverse(list)
Collections.shuffle(list)
Collections.sort(list) //optionally pass in a custom lambda
Collections.swap(list, int i, int j)
```

## Lambdas
```java
var list = Arrays.asList("Bob", "Alice", "John");
list.sort((s0, s1) -> s0.length() - s1.length());
list.sort((s0, s1) -> {
  //multiline
  return s0.length() - s1.length();
});
```

## Comparators
```java
left.compareTo(right)
// -1 if left < right
//  1 if right > left
//  0 if equal
"alice".compareTo("bob") // -1
```

When sorting:
* -1 means `left` should come before `right`
* 1 means `right` should come before `left`

## todo

- hashsets and hashmaps and linkedlists
- Queue and stack
- casting
  - string to int and such
- get max int in list (map?)
- sum all ints in list
- filter list