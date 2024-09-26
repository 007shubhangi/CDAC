
class A extends Exception{}
class B extends Exception{}
class C extends Exception{}
class D extends Exception{}
class MultiException{

public static void show(int num)throws  A,B,C{
if(num==0){
    throw new A();
}
if (num==1){
    throw new B();
}
if (num==2){
    throw new C();
}
else {
    System.out.println(num);
}

}
public static void display(int num)throws  Exception{
    if(num==0){
        throw new A();
    }
    if (num==1){
        throw new B();
    }
    if (num==2){
        throw new C();
    }
    else {
        System.out.println(num);
    }
    
    }
public static void main(String[] args) {
    try {
        int num=10;
    MultiException.display(num);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}