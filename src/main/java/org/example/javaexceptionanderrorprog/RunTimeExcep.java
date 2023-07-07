package org.example.javaexceptionanderrorprog;


//program to print the exception information using printStackTrace() method
// public class RunTimeExcep {
//     public static void main(String[] args) {
//         int i = 5;
//         int j = 0;
//         try {
//             System.out.println(i / j);
//         } catch (Exception e) {
//             // TODO: handle exception
//             e.printStackTrace();
//         }
//     }

// }

//program to print the exception information using toString() method
// public class RunTimeExcep {
//     public static void main(String[] args) {
//         int i = 5;
//         int j = 0;
//         try {
//             System.out.println(i / j);
//         } catch (Exception e) {
//             // TODO: handle exception
//             e.toString();
//         }
//     }

// }

// Program to print the exception infpremation usng getMessage() method
public class RunTimeExcep {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        try {
            System.out.println(i / j);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}

