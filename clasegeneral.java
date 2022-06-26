package subprogramas;
import java.util.Scanner;
public class clasegeneral {
    static Scanner leer=new Scanner(System.in);
    static aritmetica obj=new aritmetica();
static persona objp=new persona();


    public static void main(String[] args) {
    /*System.out.println("ingrese el primer valor");
    int ax=leer.nextInt();
    System.out.println("ingrese el segundo valor");
    int bx=leer.nextInt();
    int result=obj.sumar(ax,bx);
    System.out.println("la suma es:"+result);*/


System.out.println("ingrese la comida");
objp.comer(leer.next());}


}
