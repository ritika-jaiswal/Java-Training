package org.example.javaclassesandobjectprog;

class Check {
    private void display() {
        System.out.println("Private modifier");
    }

}

class PrivateModifierEx {
    public static void main(String[] args) {
        Check check = new Check();
        // check.display();
    }
}
