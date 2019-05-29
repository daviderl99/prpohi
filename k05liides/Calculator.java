import java.util.*;

public class Calculator implements Operations {
  public double Add(double num1, double num2){
    double answer = num1 + num2;
    return answer;
  }
  public double Subtract(double num1, double num2){
	double answer = num1 - num2;
	return answer;
  }
  public double Multiply(double num1, double num2){
	double answer = num1 * num2;
	return answer;
  }
  public double Divide(double num1, double num2){
	double answer = num1 / num2;
	return answer;
  }
}
