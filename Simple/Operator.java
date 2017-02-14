//A SAMPLE PROGRAM SHOWING HOW DIFFERENT OPERATORS OPERATES
//CREATE TWO DOUBLE VARIABLES WITH VALUES 20 AND 80.
//ADD BOTH THE NUMBERS UP AND MULTIPLY BY 25.
//USING THE MODULUS OPERATOR, FIND THE REMINDER BETWEEN THE SUM OF THE TWO DOUBLE VALUES DIVIDED BY 40
//WRITE AN IF STATEMENT THAT DISPLAYS A MESSAGE "TOTAL WAS OVER LIMIT" IF THE REMAINDER IS LESS THAN OR EQUAL TO 20.

class Operator
{
public static void main(String[] args)
{
double a=20.0, b=80.0;
double product = (a+b)*25.0; //A+B IS PUT IN BRACKETS TO FOLLOW THE PRECEDENCE OF OPERATORS
double remainder= (a+b)%40; //A+B IS PUT IN BRACKETS TO FOLLOW THE PRECEDENCE OF OPERATORS
System.out.println("The sum is: "+(a+b));
System.out.println("The product is: "+product);
System.out.println("The remainder is: "+remainder);
if(remainder<=20)
{
System.out.println("Total was over the limit.");
}
}
}
