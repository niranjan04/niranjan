public class Trynested{  
public static void main(String args[]){  
try{  
try{  
System.out.println("divide");
int b =50/0;  
}catch(ArithmeticException e){System.out.println(e);}  
try{  
int a[]=new int[5];  
a[5]=5;
}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
System.out.println("other statement");  
}catch(Exception e){System.out.println("handeled");}  
System.out.println("normal flow");  
}  
}  