package Method;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ProductInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("请输入商品销量 (0~1000): ");
            try {
                int sales = scanner.nextInt();
                checkSales(sales);
                // 假设处理销量数据...  
                System.out.println("销量数据已处理。");
            } catch (NumberFormatException e) {
                System.out.println("错误：销量输入不是有效的整数，请重新输入。");
                scanner.nextLine(); // 消耗掉错误输入后的换行符  
            } catch (IllegalArgumentException e) {
                System.out.println("错误：" + e.getMessage());
            } catch (Exception e) {
                System.out.println("发生未知错误: " + e.getMessage());
            }
        }
    }

    public static void checkSales(int sales) throws IllegalArgumentException {
        if (sales < 0 || sales > 1000) {
            throw new IllegalArgumentException("销量必须在0到1000之间。");
        }
    }
}