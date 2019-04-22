Multithreading
==============
Multithreading allows concurrent execution of two or more parts of a program for maximum utilization of CPU. 
Each part of such program is called a thread. So, threads are light-weight processes within a process.

Threads can be created by using two mechanisms :
1. Extending the Thread class
2. Implementing the Runnable Interface

Difference between these two is "RUNNABLE " interface have only one abstract method called as run() but THREAD class has many other methods. A thread class also implements Runnable interface. Threads always throw an exception so it compulsory to use Exception handling while using thread class or Runnable interface.

Difference between Multithreading and Synchronized Mulitthreading:
==================================================================
Multithreading : all the thread run in a random manner, this is the basic disadvantage while using the multi threading without synchronization. 

Synchronized Multithreading: With the help of this 'synchronized' key word now our thread runs in a smooth flow, i.e at first one thread starts and finished up. Then the next thread will start and finish up and at last the thread will start and finish up its works.

Priority:
--------
MIN_PRIORITY (a constant of 1)
MAX_PRIORITY (a constant of 10)
default: NORM_PRIORITY (a constant of 5)