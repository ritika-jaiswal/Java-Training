package org.example.practice.program;

// public class ThreadPractice {
//     private int count = 1;

//     public synchronized void doSomething() {
//         for (int i = 0; i < 10; i++)
//             System.out.println(count++);
//     }

//     public static void main(String[] args) {
//         ThreadPractice demo = new ThreadPractice();
//         Thread a1 = new A(demo);
//         Thread a2 = new A(demo);
//         a1.start();
//         a2.start();
//     }
// }

// class A extends Thread {
//     ThreadPractice demo;

//     public A(ThreadPractice td) {
//         demo = td;
//     }

//     public void run() {
//         demo.doSomething();
//     }
// }
// --------------------------------------------------------------------------------------------------
// public class ThreadPractice implements Runnable {
// private int x;
// private int y;

// public static void main(String args[]) {
// ThreadPractice that = new ThreadPractice();
// (new Thread(that)).start();
// (new Thread(that)).start();
// }

// public synchronized void run() {
// for (int i = 0; i < 10; i++) {
// x++;
// y++;
// System.out.println("x = " + x + ", y = " + y); /* Line 17 */
// }
// }
// }

// public class ThreadPractice {
// public static void main(String[] args) {
// String s1 = "abc";
// String s2 = "def";
// String s3 = s2; /* Line 7 */
// s2 = "ghi";
// System.out.println(s1 + s2 + s3);
// }
// }

class ThreadPractice {
    public void run() {
        System.out.println("Vehicle is running");
    };
}

class Bike extends ThreadPractice {
    public void run() {
        System.out.println("Bike is running");
    };

    public static void main(String[] args) {
        ThreadPractice bike = new Bike();
        // ThreadPractice threadPractice = new ThreadPractice();
        bike.run();
        // threadPractice.run();
    }
}
