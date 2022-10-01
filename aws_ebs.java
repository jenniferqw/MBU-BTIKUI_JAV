public class AutomorphicNumberExample1  
{   
//user-defined static method that checks whether the number is automorphic or not   
static boolean isAutomorphic(int num)   
{   


//determines the square of the specified number  
int square = num * num;   
//comparing the digits until the number becomes 0  4
ahsd

while (num > 0)   
{   
//find the remainder (last digit) of the variable num and square and comparing them  
if (num % 10 != square % 10)   
//returns false if digits are not equal  
return false;   
//reduce num and square by dividing them by 10  
num = num/10;   
square = square/10;   
}   <<<<<<< patch-6
System.out.println(isrints the result accordingly  
=======

System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");   
}   
}  


//Driver code  
public static void main(String args[])   
{   System.out.println(is
//calling t
//Driver code  
public static void main(String args[])   
{   
//number to be check      
//calling the method and p
//Driver code  
public static void main(String args[])   
{   
//number to be check      
//calling the method and prints the result accordingly  
he method and prints the result accordingly  
>>>>>>> main
//number to be check      
//calling the method and 
return true;   
}   
//Driver code  
public static void main(String args[])   
{   
//number to be check    
  System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
prints the result accordingly  
System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
System.out.println(is
Output 1:
