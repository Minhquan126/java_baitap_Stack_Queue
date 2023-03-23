package symStack;

import java.util.Scanner;
import java.util.Stack;

public class SymStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bieu thuc : ");
        String expression = scanner.nextLine();
        System.out.println(check(expression));
    }
    public static boolean check(String list){
        Stack<Character> stack = new Stack<>();
        boolean check = false;
        for (int i = 0; i < list.length(); i++) {
            if (list.charAt(i) == '('){
                stack.push('(');
            }
            if (list.charAt(i) == ')'){
                if (stack.isEmpty()){
                    check =  false ;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            check = true;
        } else {
            check = false;
        }
        return check;
    }
    public static boolean isMatcher (char c){
        if (c == ')'){
            return true;
        }
        else {
            return false;
        }
    }
}
