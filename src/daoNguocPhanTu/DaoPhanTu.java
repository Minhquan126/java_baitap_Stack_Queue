package daoNguocPhanTu;

import java.util.Stack;

public class DaoPhanTu {
    public static void main(String[] args) {
        int[] listNumber = {1,2,3,4,5};
        int[] tempList = new int[5];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < listNumber.length; i++) {
            stack.push(listNumber[i]);
        }
        for (int i = 0; i < listNumber.length; i++) {
            tempList[i] = stack.pop();
        }
        for (int i = 0; i < listNumber.length; i++) {
            stack.push(tempList[i]);
        }
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
