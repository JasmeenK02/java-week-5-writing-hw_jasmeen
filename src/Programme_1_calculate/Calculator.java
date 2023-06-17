package Programme_1_calculate;

/**
 * Write a java program using the following descriptions
 * 1.Create one package with the name calculate
 * 2.Create two class with name "Calculator" and "Main"
 * 3.Create four methods with names "addition","subtraction","division", and "multiplication".
 * All methods are instance methods and, it doesn't return anything. But it has two parameters with name "int a"
 * and "int b". Also, each method have System.out.println(). This prints the result.
 * Also create all one more method with name "calculateResult" with three parameters with name int a, int b, and
 * char symbol. Write the logic in calculateResult method that when user enter first number and second number and
 * symbol based on symbol it does calculate.
 * 4.Write a "main" method into main class. It has scanner that takes user input. Also write the logic that it
 * ask user to "Enter first Number:","Enter second Number:" "Please enter one of symbol +,-,*,/:" if user enter
 * + symbol result like "Additionof 5 and 10 is :15" and respective for other symbol.
 *
 */

public class Calculator {
    //method to calculate addition
    public void addition (int a, int b){
        System.out.print("Addition of " + a + " and " + b + " is : " + (a+b));
    }
    //method to calculate subtraction
    public void subtraction (int a, int b){
        System.out.println("Subtraction of" + a + " and " + b + " is :" + (a-b));
    }
    //method to calculate multiplication
    public void multiplication(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is :" + (a*b));
    }
    //method to calculate division
    public void division(int a,int b){
        System.out.println("Division of " + a + " and " + b + " is : " + (a/b));
    }

    //method to calculate a result
    public void calculateResult(int a, int b, char symbol){
        if(symbol == '+'){
            addition(a,b);
        } else if(symbol == '-'){
            subtraction(a,b);
        } else if (symbol == '*'){
            multiplication(a,b);
        } else if (symbol == '/'){
            division(a,b);
        } else {
            System.out.println("Invalid Input !!!");//warning msg for an invalid entry
        }

    }
}
