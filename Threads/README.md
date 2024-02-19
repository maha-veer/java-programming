# Java Threads

Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.

Creating a Thread
-----------------
There are two ways to create a thread.

1 - By using Thread Class
-------------------------
It can be created by extending the Thread class and overriding its run() method:

    import java.io.*;
    import java.util.*;

    public class MyThread extends Thread {
        // initiated run method for Thread
        public void run()
        {
            System.out.println("Thread Started Running...");
        }
        public static void main(String[] args)
        {
            MyThread g1 = new MyThread();

            // Invoking Thread using start() method
            g1.start();
        }
    }


2 - By using ruunable interface
--------------------------------

Another way to create a thread is to implement the Runnable interface:

    import java.io.*;
    import java.util.*;
    
    public class MyThread implements Runnable {
        // method to start Thread
        public void run()
        {
            System.out.println(
                "Thread is Running Successfully");
        }
    
        public static void main(String[] args)
        {
            MyThread g1 = new MyThread();
            // initializing Thread Object
            Thread t1 = new Thread(g1);
            t1.start();
        }
    }