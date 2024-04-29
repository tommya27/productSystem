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
                    System.out.println("��лʹ�ã��ټ���");
                    System.exit(0);
                default:
                    System.out.println("��Ч��ѡ�������ѡ��");
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
                case 5: // ������Ʒ
                    searchProductsByWhatModule();
//                    System.out.print("������Ҫ���ҵ���Ʒ���ƹؼ���: ");
//                    String keyword = scanner.nextLine();
//                    List<Products> foundProducts = manager.searchProductsByName(keyword);
//                    if (foundProducts.isEmpty()) {
//                        System.out.println("û���ҵ�ƥ�����Ʒ��");
//                    } else {
//                        System.out.println("�ҵ�����ƥ�����Ʒ��");
//                        for (Products product : foundProducts) {
//                            System.out.println(product);
//                        }
//                    }
                    break;
                case 6:
                    System.out.println("��ѡ���˵���͵������ݡ�");
                    // ��������ӵ���͵������ݵ��߼�
                    break;
                case 7:
                    return; // �����ϼ��˵�
                default:
                    System.out.println("��Ч��ѡ�������ѡ��");
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
                    return; // �����ϼ��˵�
                default:
                    System.out.println("��Ч��ѡ�������ѡ��");
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
