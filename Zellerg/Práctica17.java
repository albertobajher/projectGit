
package práctica17;

import java.util.Scanner;

public class Práctica17 {
    
  static Scanner keyboard = new Scanner(System.in);

public static void main(String[] args) 
    {
         int option=-1;      //porque no podemos inicializarlo en ningun otro numero, ya que del 0 a 9 son opciones del programa.
        
        while( option !=0)  //no saldrá hasta que la opción sea 0 (porque en este caso es la opcion de salir)
                {
                    userMenu();//el while llama primero al menu del usuario, para que luego este introduzca su opcion.
                    option=keyboard.nextInt();//para que el usuario pueda escribir su opcion.
                
        switch(option){
            case 1:P01();
                break;
            case 2:P02();
                 break;
            case 3:P03();
                 break;
            case 4:P04();
                 break;
            case 5:P05();
                 break;
            case 6:P06();
                 break;
            case 7:P07();
                 break;
            case 8:P08();
                 break;
            case 9:P09();
                 break;
            case 10:P10();
                 break;
            case 0:P0();
                 break;
            default:System.out.println("No valid option,take a correct option plis.");
          
        }
        }
    }

private static float P01()
{
    
    System.out.println("Put a quantity");
    int quantity= keyboard.nextInt();
    float converter = (float) quantity;
    System.out.println(quantity+"$="+converter+"x");
    return converter;
    
}
private static double P02()
{
    
    System.out.println("Put a quantity");
    int quantity= keyboard.nextInt();
    double converter = (double) quantity;
    System.out.println(quantity+"$="+converter+"x");
    return converter;
    
}
private static String P03()
{
    
    System.out.println("Put a quantity");
    int quantity= keyboard.nextInt();
    String converter = Integer.toString (quantity);
    System.out.println(quantity+"$="+converter+"x");
    return converter;
    
}
private static int P04()
{
    
    System.out.println("Put a quantity");
    String quantity= keyboard.next();
    int converter = Integer.parseInt (quantity);
    System.out.println(quantity+"$="+converter+"x");
    return converter;
    
}
private static int P05()
{
    
    System.out.println("Put a quantity");
    float quantity= keyboard.nextFloat();
    int converter = (int)(quantity);
    System.out.println(quantity+"$="+converter+"x");
    return converter;
    
}
private static String P06()
{
    
    System.out.println("Put a quantity");
    float quantity= keyboard.nextFloat();
    String converter = Float.toString (quantity);
    System.out.println(quantity+"$="+converter+"x");
    return converter;
    
}
private static void P07()
{
    
    System.out.println("Put a character");
    String character=keyboard.next();
    char charac=character.charAt(0);
    int cha= (int) charac;
    System.out.println("Equivalent to an integer="+cha);
    System.out.println("Equivalent to an binary="+Integer.toBinaryString(cha));
     
}

private static void P08()
{
    
    System.out.println("Put a name");
    String name=keyboard.next();
    char nam=name.charAt(0);
    System.out.println("Equivalent to an binary="+Integer.toBinaryString(nam));
    
    
}
private static char P09()
{
    System.out.println("Put a number between 0 and 255");
    int number=keyboard.nextInt();
    char converter = (char) number;
    
    if (number>=0 && number<=255)
    {
        System.out.println("Equivalent to an char="+converter);
    }
    else
    {
        System.out.println("The number has to be between 0 and 255");
    }
    
    return converter;
    
}
private static void P10()
{
    
    char letter=0;
    int i;
    for (i=0;i<=255;i++)
    {
        System.out.println("The code ASCII of the letter "+letter++ +" is "+i);
    }
    
}


 private static void P0()
    {
        System.out.println("Thank you for use the program, goodbye!!");
    }
       
    
    private static void userMenu()//solo llenarlo de sout, nada mas.
    {
 
        keyboard.useDelimiter("\n");
        System.out.println("");
        System.out.println("Option 1-Int-Float");
        System.out.println("Option 2-Int-Double ");
        System.out.println("Option 3-Int-String ");
        System.out.println("Option 4-String-Int ");
        System.out.println("Option 5-Float-Int ");
        System.out.println("Option 6-Float-String ");
        System.out.println("Option 7-Char ");
        System.out.println("Option 8-Char-Binary ");
        System.out.println("Option 9-Int-Char ");
        System.out.println("Option 10-ASCII");
        System.out.println("Option 0- (Exit)");
        System.out.print("\nOption ?: ");
    }
}

