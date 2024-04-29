package Method;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ProductInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("��������Ʒ���� (0~1000): ");
            try {
                int sales = scanner.nextInt();
                checkSales(sales);
                // ���账����������...  
                System.out.println("���������Ѵ���");
            } catch (NumberFormatException e) {
                System.out.println("�����������벻����Ч�����������������롣");
                scanner.nextLine(); // ���ĵ����������Ļ��з�  
            } catch (IllegalArgumentException e) {
                System.out.println("����" + e.getMessage());
            } catch (Exception e) {
                System.out.println("����δ֪����: " + e.getMessage());
            }
        }
    }

    public static void checkSales(int sales) throws IllegalArgumentException {
        if (sales < 0 || sales > 1000) {
            throw new IllegalArgumentException("����������0��1000֮�䡣");
        }
    }
}