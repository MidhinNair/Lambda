public class Test {
    public static void main(String[] args) {

        MyInter myInter = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("helloo anonymous  class");
            }

            @Override
            public void sayHi() {
                System.out.println("this interface have 2 method. Lambda can use while only one method.");
            }
        };
        myInter.sayHello();
        myInter.sayHi();

        //--------------------------------
        //lambda
        MyInterforLambda sayhello =()->{
            System.out.println("hello this interface have only one methode in the interface so we are using lambda here!........... ");
        };
        sayhello.sayHello();
        MyInterforLambda sayhi =()-> System.out.println("again using lambda here ");
        sayhi.sayHello();

        SumNumbers sum = (a,b)->a+b;
        System.out.println(sum.sum(3,5));


    }
}
