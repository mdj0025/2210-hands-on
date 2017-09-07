<!---
	@author   Dean Hendrix (dh@auburn.edu)
	@version  2017-09-07
-->

# Hands-On: Total Orders

This activity is designed to put into practice the concepts presented in the related course note set (*Generality*) and chapter 8, Chapter 6 section 6.8, and Chapter 11 section 11.1 of [the Bailey text](http://dept.cs.williams.edu/~bailey/JavaStructures/Welcome.html). If you haven't read *at least* the note set, you should do so before attempting this lab.


## Set-up

1. Open the `COMP2210/hands-on` directory that you created in an earlier lab.

1. Create the `total-order` directory.

1. Download the following files and save them in the `COMP2210/hands-on/total-order` directory.
   - [Student.java](src/Student.java)
   - [ClassRoll.java](src/ClassRoll.java)
   - [ClassRoll.jgrasp_canvas.xml](src/ClassRoll.jgrasp_canvas.xml)

1. Open jGRASP to the `COMP2210/hands-on/total-order` directory.


## Total Order

If a *total order* exists on a collection of values, it means that these values can be arranged in ascending (or descending) order. That is, any value in the collection can be compared to any other value in the collection on the basis of "less than or equal to". Here are two links that provide more formal definitions of a total order

- [`http://en.wikipedia.org/wiki/Total_order`](http://en.wikipedia.org/wiki/Total_order)
- [`http://mathworld.wolfram.com/TotallyOrderedSet.html`](http://mathworld.wolfram.com/TotallyOrderedSet.html)

If we want to perform operations such as sorting, finding the minimum or maximum, etc. on a collection of values, the values in that collection must have a total order defined on them or otherwise these operations don't even make sense. Java provides two standard ways of defining a total order on a data class: the `Comparable` interface or the `Comparator` interface.

While `Comparable` and `Comparator` serve the same purpose (defining a total order on a data class), the context of their use is very different. The `Comparable` interface is implemented by a data class, and thus is used in the context of one instance of that data class comparing *itself* to another instance of that data class. For example, in the *Generality* note set, class `Book` implemented the `Comparable` interface. So, if `b1` and `b2` are instances of `Book`, then we could ask `b1` to compare itself to `b2` based on the natural order of `Book` like so: `b1.compareTo(b2)`.

In contrast, the `Comparator` interface is **not** implemented by the data class. Instead, a "third party" class is used to implement `Comparator` for a given data class. Again referring to the *Generality* note set, we had a class defined like so: `public class CompareBooksByTitle implements Comparator<Book>`. An instance of this class, say `bcomp`, can compare two `Book` objects on the basis of the particular total order defined by this class like so: `bcomp.compare(b1, b1)`. Note that the data class (`Book`) is completely "unaware" of this other total order that `CompareBooksByTitle` defines. Also note that it is the ability to define multiple "third party" total orders that allowed us to write a single search method that can compare items according to totally different criteria from one call to the next.

The following sections will give you practice in implementing and using both the `Comparable` and `Comparator` interfaces.


### Comparable

The standard way to require that objects of a given class can be ordered is to have that class implement the `Comparable` interface. The implementation of `Comparable` defines the **natural ordering** of a class, since it is the class itself that decides what the order is. Read about the `Comparable` interface here:

- [`http://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html`](http://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)


1. Open `Student.java` in jGRASP and compile it.

1. Implement the `compareTo` method according to the commented description in the source code. The current (stub) version of `compareTo` is shown below.

   ```java
      @Override
      public int compareTo(Student s) {
         return -99;
      }
   ```

1. Submit `Student.java` to Hands-On: Total Orders (Comparable) in Vocareum to document your progress.

1. Open `ClassRoll.java` in jGRASP and compile it.

1. Use `ClassRoll.java` to informally test your implementation of the natural order of Students. Note that you do not have to address the shuffling or `Comparator` aspect of the `ClassRoll` class yet. Just run the file as-is.

1. Use the provided jGRASP Canvas file (`ClassRoll.jgrasp_canvas.xml`) to watch the sort by natural order happen as you single-step in debug mode.


### Comparator

Java provides the `Comparator` interface as the standard way of defining a total order on a class that is different from its natural order. Read about the `Comparator` interface here:

- [`http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)


1. Open `ClassRoll.java` in jGRASP and compile it.

1. Implement the `CompareStudentsBySection` comparator according to the commented description in the source code. The current (stub) version is shown below.

   ```java
      private static class CompareStudentsBySection implements Comparator<Student> {
         /** Compares s1 to s2 in with respect to the defined total order. */
         public int compare(Student s1, Student s2) {
            return -99;
         }
      }
   ```

1. Compile and run `ClassRoll.java` to informally test your solution.

1. Submit both `Student.java` and `ClassRoll.java` to Hands-On: Total Orders (Comparator) in Vocareum to document your progress.

1. Use the provided jGRASP Canvas file (`ClassRoll.jgrasp_canvas.xml`) to watch the sort by comparator happen as you single-step in debug mode.

1. Respond to the prompts at the points specified in the source code comments to shuffle the roll and sort it in descending order of section. Try out your solutions by running the `ClassRoll` program. You may want to read the API for `Collections`:

	- [`http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html`](http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html)

1. Use the provided jGRASP Canvas file (`ClassRoll.jgrasp_canvas.xml`) to watch the shuffling and reverse order sort happen as you single-step in debug mode.
