package stackToBinary;

import java.util.Scanner;
import java.util.Stack;

public class ToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so muon chuyen sang he nhi phan");
        int number = scanner.nextInt();
        while (number > 0){
            stack.push(number % 2);
            number = number/2;
        }
        StringBuilder result = new StringBuilder("Ket qua nhi phan la : ");
      while (!stack.isEmpty()){
          result.append(stack.pop());
      }
        System.out.println(result);
    }
}
