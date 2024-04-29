package Menu;


import Method.Input;
import Method.ProductManager;
import Method.SalesStatistics;
import Pojo.Products;
import Pojo.SalesData;

import java.util.List;
import java.util.Scanner;



public class Menu {
//    static ProductManager manager = new ProductManager();
//
//    static SalesStatistics salesAll = new SalesStatistics();
//
//    static Products product1 = null;
//
//    static SalesData salesData = null;
    Input input = new Input();


    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.mainMenu();
    }


    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            input.menuStart();

            int mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    handleBasicInfoModule();
                    break;
                case 2:
                    handleSalesStatisticsModule();
                    break;
                case 3:
                    System.out.println("感谢使用，再见！");
                    System.exit(0);
                default:
                    System.out.println("无效的选项，请重新选择。");
            }
        }
    }


    public void handleBasicInfoModule() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            input.menu1();


            int subChoice = scanner.nextInt();
            scanner.nextLine();

            scanner = new Scanner(System.in);
            switch (subChoice) {

                case 1:
                    input.addAll();
                    break;
                case 2:
                    input.deleteById();
                    break;
                case 3:
                    input.updataById();
                    break;
                case 4:
                    input.printAllData();
                    break;
                case 5: // 查找商品
                    searchProductsByWhatModule();
//                    System.out.print("请输入要查找的商品名称关键词: ");
//                    String keyword = scanner.nextLine();
//                    List<Products> foundProducts = manager.searchProductsByName(keyword);
//                    if (foundProducts.isEmpty()) {
//                        System.out.println("没有找到匹配的商品。");
//                    } else {
//                        System.out.println("找到以下匹配的商品：");
//                        for (Products product : foundProducts) {
//                            System.out.println(product);
//                        }
//                    }
                    break;
                case 6:
                    System.out.println("您选择了导入和导出数据。");
                    // 在这里添加导入和导出数据的逻辑
                    break;
                case 7:
                    return; // 返回上级菜单
                default:
                    System.out.println("无效的选项，请重新选择。");
            }
        }
    }

    public void handleSalesStatisticsModule() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            input.menu2();

            int subChoice = scanner.nextInt();

            switch (subChoice) {
                case 1:
                    input.statisticSales();
                    break;
                case 2:
                    return; // 返回上级菜单
                default:
                    System.out.println("无效的选项，请重新选择。");
            }
        }


    }

    public void searchProductsByWhatModule() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            input.menu3();
            int subChoice = scanner.nextInt();
            scanner.nextLine();

            switch (subChoice) {
                case 1:
                    input.selectByName();
                    break;
                case 2:
                    input.selectById();
                    break;
                case 3:
                    return;
            }
        }
    }
}
