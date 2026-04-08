import java.util.*;

class OperandNotNumber extends Exception {
   public OperandNotNumber(String message) {
        super(message);
    }   
}

public class Example4
{
   public static double getResult(StringTokenizer tokenizer)throws OperandNotNumber {

      String leftString   = tokenizer.nextToken();
      String operator     = tokenizer.nextToken();
      String rightString  = tokenizer.nextToken();
      double leftOperand = 0, rightOperand = 0;

      try{
         leftOperand = Double.parseDouble(leftString);
      }
      catch (NumberFormatException nfe)
      {
          throw new OperandNotNumber("Left operand isn't a number");
      }
      try{
         rightOperand  = Double.parseDouble(rightString);
      }
      catch (NumberFormatException nfe)
      {
          throw new OperandNotNumber("Right operand isn't a number");
      }

      double result = 0;

      if (operator.equals("+"))
         result = leftOperand + rightOperand;
      else if (operator.equals("*"))
         result = leftOperand * rightOperand;
      else if (operator.equals("-"))
         result = leftOperand - rightOperand;
      else if (operator.equals("/"))
         result = leftOperand / rightOperand;
      else
         result = 0.0;

      return result;
   }

    public static void main(String[] args)
    {
      StringTokenizer        tokenizer, input;
       
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), " ", false);
      
       try
       {
         while(tokenizer.hasMoreTokens()){
            input =  new StringTokenizer(tokenizer.nextToken(), "+-*/", true);
            System.out.println("Result: " + getResult(input));
         }
       }
       catch (NoSuchElementException nsee)
       {
          System.out.println("Invalid syntax");
       }
       catch (NumberFormatException nfe)
       {
          System.out.println("One or more operands is not a number");
       }
       catch (OperandNotNumber onn)
       {
          System.out.println(onn.getMessage());
       }
       catch (ArithmeticException e){
		   System.out.println("Divide by 0");
	   }


    }
}
