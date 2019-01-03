interface Inter{
void Fun(int x, int y);
void Fun(int x, int y, int c);
}

public class test{
public static void main (String args[]){
Inter inter=(int x, int y)->System.out.println(x+y);
inter.Fun(3,4);
Inter intera=(int x, int y, int c)->System.out.println(x+y-c);
intera.Fun(3,4,5);
}
}
