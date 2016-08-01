import java.util.Scanner;

public class AddNum implements Calculator {
  Scanner addNum = new Scanner(System.in);
  float firstNum, secondNum, answer;

  System.out.println("Please enter first operand: ");
  firstNum = addNum.nextFloat();

  System.out.println("Please enter second operand: ");
  secondNum = addNum.nextFloat();

  answer = firstNum + secondNum;
  System.out.println(answer);
}
