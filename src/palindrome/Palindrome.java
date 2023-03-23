package palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> listQueue = new LinkedList<>();
        Stack<String> listStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra");
        String listString = scanner.nextLine();
        String[] list = listString.split("");
        for (int i = 0; i < list.length; i++) {
            listStack.push(list[i]);
            listQueue.add(list[i]);
        }
            System.out.println(listStack.pop());
            System.out.println(listQueue.poll());
        boolean check = true;
        for (int i = 0; i < list.length; i++) {
            if (!listStack.isEmpty()){
                if(!listStack.pop().equals(listQueue.poll())){
                    check = false;
                    break;
                }
            }
        }
        if (check){
            System.out.println("la chuoi palindrome");
        } else {
            System.out.println("khong phai la chuoi palindrome");
        }
    }
}
