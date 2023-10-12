//2252421017_A_Spondon
package practice.problem.pkg2;
interface primary {
    void display();
    void sum();
    void diff();
    void product();
    void div();
}
abstract class A implements primary{
int a,b;
public void display(){System.out.println("The digits are :" + a +" "+  b);}
public void sum(){ int s= a+b ;
System.out.println("The sum is :" + s);}
}
class B extends A{
B(int a, int b){
    this.a=a;
    this.b=b;
}
public void diff(){
    int d = a-b;
    System.out.println("The difference is :" + d);}
public void product(){System.out.println("The product is :" + a*b);}
public void div(){System.out.println("The division result is :" + a/b);}
}
public class PracticeProblem2 {
    public static void main(String[] args) {
    primary X = new B(10,2);
    X.display();
    X.sum();
    X.diff();
    X.product();
    X.div();    
    }
   
}
