package koans.english;

public class AboutLoops {
    /**
     * # First loop
     * 
     * Write a method named 'helloNTimes' which has an integer parameter 'times' and displays 'Hello' in the console 'times' times.
     * 
     * ---------   TIPS   --------------
     * 
     * To do things multiple times in Java, you can use the 'while' loop.
     * A while loop looks a lot like an if condition, except it will execute its block of code again and again while the condition stays true. Ex:
     * 
     *     int times = 3;
     *     while (times > 0) {
     *         // It will take 3 executions of this block of code before the condition becomes false.
     *         // So Java will execute it 3 times, and then move on to the rest of the code.
     *         System.out.println("Still executing");
     *         // We can modify the value of an existing variable. We take advantage of this capability here.
     *         times = times -1;
     *     }
     * 
     * Note 3: like of the 'if', within the curly brackets of a 'while', you can write any code, including other 'while' and 'if' !.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * helloNTimes(2) should display:
     * 
     * Hello
     * Hello
     * 
     */
    public static void helloNTimes(int times){
        while (times>0) {
        System.out.println("Hello");
        times=times-1;
        }
    }

     /**
     * # Printing where we are in a loop
     * 
     * Write a method named 'displayNumbers' with an integer parameter 'n', which displays numbers between 1 and n.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * displayNumbers(3) should display:
     * 
     * 1
     * 2
     * 3
     * 
     */
    public static void displayNumbers(int n){
        int num1=1;
        while(num1<=n){
            System.out.println(num1);
            num1=num1+1;
        }
    }

     /**
     * # Counting in reverse
     * 
     * Write a method named 'displayReverseNumbers' with an integer parameter 'n', which displays numbers between 1 and n in reverse order.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * displayReverseNumbers(3) should display:
     * 
     * 3
     * 2
     * 1
     * 
     */
    public static void displayReverseNumbers(int n){
        while (n>0){
            System.out.println(n);
            n=n-1;
        }
    }

     /**
     * # Multiples of 7
     * 
     * Write a method named 'sevens' with 1 integer parameter 'n', which displays all multiples of 7 between 1 and n.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * sevens(30) should display:
     * 
     * 7
     * 14
     * 21
     * 28
     * 
     */
    public static void sevens(int n){
        int num1=7;
        while(num1<=n){
            System.out.println(num1);
            num1=num1+7;
        }
    }

     /**
     * # Multiples of 7 or 8
     * 
     * Write a method named 'sevensOrEights' with 1 integer parameter 'n', which displays all multiples of 7 or 8 between 1 and n.
     * 
     * ---------   TIPS   --------------
     * 
     * Reuse the 'isMultiple' method in the AboutMoreMethods class. To reuse a method in an other class, write the class name, then a '.', before calling the method. Ex:
     * 
     *     AboutConsoleAndVariables.sayHelloInConsole();  // Will display 'Hello!' in the console
     *                  ^          ^          ^
     *             class name     dot     method call
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * sevensOrEights(20) should display:
     * 
     * 7
     * 8
     * 14
     * 16
     * 
     */ public static void sevensOrEights(int n){
        int num1=1;
        while(num1<=n){
            if(num1%7==0){
            System.out.println(num1);
            }
            else if(num1%8==0){
                System.out.println(num1);
                }
            else{
            }
            num1=num1+1;
        }
    }

     /**
     * # Exponents
     * 
     * Write a method 'exponent' which computes the exponent of an integer by an other.
     * 
     * ---------   TIPS   --------------
     * 
     * Exponent will be noted '^' in comments. Example: 10^3.
     * x^n is x multiplied by itself n times. Ex:
     * 
     * 2^4 = 2 * 2 * 2 * 2 = 16
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * exponent(5, 3) should return 125
     */
    public static int exponent (int x, int n){
        int num1=1;
        int num2=1;
        while(num1<=n){
            num2=num2*x;
            num1=num1+1;
        }
        return num2;
    }

     /**
     * # Exponents, including 0
     * 
     * Write a method 'exponent2' which does the same as the previous one, except it also handles the case where n is 0.
     * 
     * ---------   TIPS   --------------
     * 
     * x^0 is always 1. Ex:
     * 
     * 34^0 = 1
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * exponent2(5, 3) should return 125
     * 
     */
    public static int exponent2 (int x, int n){
        int num1=1;
        int num2=1;
        while(num1==0){
            return 1;
        }
        while(num1<=n){
            num2=num2*x;
            num1=num1+1;
        }
        return num2;
    }

     /**
     * # Factorial
     * 
     * Write a method 'factorial' which computes the factorial of an integer.
     * 
     * ---------   TIPS   --------------
     * 
     * Factorial is noted '!'. Example: 3!.
     * The factorial of a number n is the product of all numbers between 1 and n. Ex:
     * 
     * 4! = 1 * 2 * 3 * 4 = 24
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * factorial(5) should return 120
     * 
     */
    public static int factorial(int n){
        int x=1;
        int num=1;
        while(x<=n){
            num=num*x;
            x++;
        }
        return num;
    }

}