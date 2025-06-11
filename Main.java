class Test{
    void show(){
        System.out.println("No Parameter");
    }
    void show(int a){
        System.out.println("Integer :"+a);
    }
    void show(String s){
        System.out.println("String :"+s);
    }
}
public class Main{
    public static void main(String args[]){
     Test t1 = new Test();
     t1.show();
     t1.show(10);
     t1.show("Piyush");
    }
}


