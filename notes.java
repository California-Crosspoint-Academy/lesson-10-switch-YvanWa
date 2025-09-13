public class notes{
    public static void main(String[]args){
//case 1:
//case 2:
//case 3:
//s = "low"; 
//break;

//char ch = 'h';
//char x = '6';
//char pp = '@';
System.out.println("A. Addition");
System.out.println("S. Subtraction");
System.out.println("M. Multiplication");
System.out.println("D. Division");

String choice = kbReader.nextLine();
char ch = choice.charAt(0); // take first character

switch (ch) {
    case 'A': case 'a':
        System.out.println(op1 + " + " + op2 + " = " + (op1 + op2));
        break;
    case 'S': case 's':
        System.out.println(op1 + " - " + op2 + " = " + (op1 - op2));
        break;
    case 'M': case 'm':
        System.out.println(op1 + " * " + op2 + " = " + (op1 * op2));
        break;
    case 'D': case 'd':
        System.out.println(op1 + " / " + op2 + " = " + (op1 / op2));
        break;
    default:
        System.out.println("Hey dummy, enter only A, S, M, or D!");
}
//Uses String choice.charAt(0) to extract the first character.
String s = "Hello";
switch(s) {
    case "Good Bye":
        System.out.println("You said Good Bye.");
        break;
    case "Hello":
        System.out.println("You said Hello.");
        break;
    case "Auf wiedersehen":
        System.out.println("You spoke German.");
        break;
    default:
        System.out.println("What did you say??");
}
//Cases must exactly match the String.
  
    }
}