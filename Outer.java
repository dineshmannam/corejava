package com.dineshmannam;

/*
Inner class
    method inner class
    static method inner class
    anonymous class
*/



class Outer {
    int a;
    public void main(){

    }

    class Inner {
        public void display(){
            System.out.println("This is inner class");
        }
    }
}

class Innerdemo {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.main();

        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
