<!---
	@author   Dean Hendrix (dh@auburn.edu)
	@version  2016-08-24
-->

# Hands-On: Iterators

This activity is designed to put into practice the concepts presented in the related course note set (*Generality*) and chapter 8, Chapter 6 section 6.8, and Chapter 11 section 11.1 of [the Bailey text](http://dept.cs.williams.edu/~bailey/JavaStructures/Welcome.html). If you haven't read *at least* the note set, you should do so before attempting this lab.


## Set-up

1. Open the `COMP2210/hands-on` directory that you created in an earlier lab.

1. Create the `iterators` directory.

1. Download the following files and save them in the `COMP2210/hands-on/iterators` directory.
   - [IteratorExample.java](src/IteratorExample.java)
   - [IteratorExample.jgrasp_canvas.xml](src/IteratorExample.jgrasp_canvas.xml)
   - [IteratorError.java](src/IteratorError.java)
   - [IteratorError.jgrasp_canvas.xml](src/IteratorError.jgrasp_canvas.xml)

1. Open jGRASP to the `COMP2210/hands-on/iterators` directory.


## Iterators - purpose and overview

The *iterator pattern* is one of the most common programming patterns that we use. It describes the standard solution to the common problem of accessing every element of a collection in turn. We can think of the iterator pattern as *linear scan* over a collection. Java provides the `Iterator` interface as the standard means of expressing iteration. There are actually two interfaces relevant to iteration: `Iterator` and `Iterable`. You can read more about each at the following links.

- [`http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html`](http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)
- [`http://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html`](http://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)

The real power of an iterator is this: Through the `Iterator` interface, we can traverse a collection of elements **without knowing exactly what the collection is or how it is structured.** Now we can perform a linear scan on ... *anything*.

For us to iterate over something, that something will have to provide us with an `Iterator` object over its elements. The standard (idiomatic) way of doing that in Java is for the "something" to implement the `Iterable` interface, thereby obliging it to provide a method named `iterator` that returns an `Iterator` object over its elements. Let's say that this "something" is a class named `AnIterableCollection`. Then the shell of the class must look something like this:

```java
public class AnIterableCollection<T> implements Iterable<T> {
   // fields, methods, etc.
   public Iterator<T> iterator() {
      // create an Iterator object over the elements in this collection.
   }
}
```

Many of the collection classes in the [Java Collections Framework (JCF)](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/) are *iterable* so we can use `ArrayList` for an example. Suppose we have a class named `Song` that models music that we listen to, and suppose we use an `ArrayList` to create a playlist of songs for game day.

```java
ArrayList<Song> playlist = new ArrayList<>();
playlist.add(new Song("War Eagle"));
playlist.add(new Song("Welcome to the Jungle"));
playlist.add(new Song("All I Do Is Win"));
playlist.add(new Song("Sweet Caroline"));
```

Since the `ArrayList` class implements the `Iterable` interface, we can use standard iteration patterns to play each song in our playlist. The `for-each` loop is the standard idiom in Java for iterating over `Iterable` objects.

```java
for (Song song : playlist) {
   song.play();
}
```

The `for-each` loop is just a more compact form of the following more general pattern:

```java
Iterator<Song> itr = playlist.iterator();
while (itr.hasNext()) {
   itr.next().play();
}
```

For now we will mostly use one of these two patterns, but it's worth pointing out that Java 8 introduced new features that provide us with a very compact iteration idiom.

```java
playlist.forEach(song -> song.play());
```

We will stick to the traditional patterns for now, but we will revisit these new features later on.



## Iterators - an example

1. Open `IteratorExample.java` in jGRASP and study the source code.
   - Notice the use of the iterator pattern in the `toString` method.
   - Notice that the parameter to `toString` is `Iterable`. This allows an instance of any class that implements the `Iterable` interface to be passed in.
   - Notice how the `main` method passes in four very different collections, but the iterator pattern abstracts away the differences. The `toString` method doesn't care what the specific collection actually is; it only cares that whatever collection is passed in is guaranteed to be `Iterable`.

1. Run `IteratorExample.java` and observe its output.

1. Use the provided jGRASP Canvas file (`IteratorExample.jgrasp_canvas.xml`) to watch the execution of this code.
   - Click on the Canvas file in the jGRASP Browse tab or click on the *Run in Canvas* button ![](images/run_canvas.png) in the jGRASP tool bar.
   - Once the Canvas window opens, resize it so that it best fits your display.
   - You can use any of the following controls to watch the program execute.
      - *Play* ![](images/play.png) - Starts the program running in auto-step mode.
      - *Step Over* ![](images/step_over.png) - Manually steps over each statement.
      - *Step In* ![](images/step_in.png) - Manually steps into each statement (method call).

1. Study the source code again and make sure you understand how the `Iterator` interface allows a single method to traverse four distinct collection types.

1. Modify the body of the `toString` method so that it uses the `for-each` iterator idiom instead.


## Iterators - a common error

A common error in using iterators arises from a misunderstanding of what the `next()` method actually does. You can identify and learn to correct this common error through the steps below.

1. Open `IteratorError.java` in jGRASP and compile it.

1. Run `IteratorError.java` and observe its output.

1. Identify and correct the erroneous use of the iterator.

1. It might help you identify the error if you use the provided jGRASP Canvas file (`IteratorError.jgrasp_canvas.xml`) in conjunction with the jGRASP debugger.
