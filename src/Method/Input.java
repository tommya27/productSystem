package Method;

import Pojo.Products;
import Pojo.SalesData;

import java.util.List;
import java.util.Scanner;

public class Input {

    static ProductManager manager = new ProductManager();

    static SalesStatistics salesAll = new SalesStatistics();

    static Products product1 = null;

    static SalesData salesData = null;

    Scanner scanner = new Scanner(System.in);

    //menuStart

    public void menuStart() {
        System.out.println("-------------商品信息管理系统-------------");

        System.out.println("1. 商品基本信息管理模块");
        System.out.println("2. 商品销量统计模块");
        System.out.println("3. 退出");

        System.out.println("---------------------------------------");
        System.out.println("请选择一个选项：");
    }

    //MENU 1

    public void menu1() {
        System.out.println("-------------商品基本信息管理菜单-------------");
        System.out.println("1. 添加商品信息");
        System.out.println("2. 删除商品信息");
        System.out.println("3. 修改商品信息");
        System.out.println("4. 显示所有商品信息");
        System.out.println("5. 查找商品商品");
        System.out.println("6. 导入和导出数据");
        System.out.println("7. 返回上级菜单");
        System.out.println("---------------------------------------");
        System.out.println("请选择一个选项：");
    }

    public void addAll() {
        System.out.println("您选择了添加商品信息。");
        // 在这里添加添加商品信息的逻辑
        System.out.print("请输入商品ID: ");
        String id = scanner.nextLine();
//                    scanner.nextLine(); // 消耗掉输入后的换行符
        System.out.print("请输入商品名称: ");
        String name = scanner.nextLine();
//                    scanner.nextLine(); // 消耗掉输入后的换行符
        System.out.print("请输入商品价格: ");
        double price = scanner.nextDouble();

        System.out.print("请输入第一季度商品销量: ");
        int sales1 = scanner.nextInt();
        System.out.print("请输入第二季度商品销量: ");
        int sales2 = scanner.nextInt();
        System.out.print("请输入第三季度商品销量: ");
        int sales3 = scanner.nextInt();

        scanner.nextLine(); // 消耗掉输入后的换行符
        product1 = new Products(id, name, price, sales1, sales2, sales3);
        salesData = new SalesData(sales1, sales2, sales3);

        manager.addProduct(product1);
        salesAll.addSales(salesData);
    }

    public void deleteById() {

        System.out.println("您选择了删除商品信息。");
        // 在这里添加删除商品信息的逻辑
        System.out.print("请输入要删除的商品ID: ");
        String deleteId = scanner.nextLine();
        manager.deleteProduct(deleteId);
    }

    public void updataById() {
        System.out.print("您选择了修改商品信息。");
        // 在这里添加修改商品信息的逻辑
        System.out.print("请输入要修改的商品ID: ");
        String updateId = scanner.nextLine();
        System.out.print("请输入新的商品名称 (留空不修改): ");
        String newName = scanner.nextLine();
        System.out.print("请输入新的商品价格 (留空不修改): ");
        double newPrice = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
        scanner.nextLine(); // 消耗掉输入后的换行符或者任何剩余的输入
//                    System.out.print("请输入商品销量: ");
//                    int newSales = scanner.nextInt();

        System.out.print("请输入第一季度商品销量: ");
        int newSales1 = scanner.nextInt();
        System.out.print("请输入第二季度商品销量: ");
        int newSales2 = scanner.nextInt();
        System.out.print("请输入第三季度商品销量: ");
        int newSales3 = scanner.nextInt();

        scanner.nextLine(); // 消耗掉输入后的换行符
        manager.updateProduct(updateId, newName, newPrice, newSales1, newSales2, newSales3);
    }


    public void printAllData() {
        System.out.println("您选择了显示所有商品信息。");
        // 在这里添加显示所有商品信息的逻辑
        System.out.println(
                "商品ID" + "\t" +
                        "商品名称" + "\t\t" +
                        "商品价格" + "\t" +
                        "第一季度商品销量" + "\t" +
                        "第二季度商品销量" + "\t" +
                        "第三季度商品销量" + "\t"
        );
        manager.displayProducts();
    }

    //MENU 2
    public void menu2() {
        System.out.println("-------------商品销量统计菜单-------------");
        System.out.println("1. 按季度统计");
        System.out.println("2. 返回上级菜单");
        System.out.println("---------------------------------------");
        System.out.println("请选择一个选项：");
    }

    public void statisticSales() {
        System.out.println("您选择了按季度统计。");
        // 在这里添加按季度统计的逻辑
        System.out.println(
                "第一季度商品销量" + "\t" +
                        "第二季度商品销量" + "\t" +
                        "第三季度商品销量" + "\t"
        );
        salesAll.displaySales();
        salesAll.calculateStats();
    }

    //MENU 3
    public void menu3() {
        System.out.println("-------------商品基本信息管理菜单-------------");
        System.out.println("1. 查找的商品名称关键词:");
        System.out.println("2. 查找的商品id关键词:");
        System.out.println("3. 返回上级菜单");
        System.out.println("---------------------------------------");
        System.out.println("请选择一个选项：");
    }

    public void selectByName() {
        System.out.print("请输入要查找的商品名称关键词: ");
        String keyword1 = scanner.nextLine();

        scanner.nextLine(); // 消耗掉输入后的换行符
        List<Products> foundProducts1 = manager.searchProductsByName(keyword1);
        if (foundProducts1.isEmpty()) {
            System.out.println("没有找到匹配的商品。");
        } else {
            System.out.println("找到以下匹配的商品：");
            for (Products product1 : foundProducts1) {
                System.out.println(
                        "商品ID" + "\t" +
                                "商品名称" + "\t\t" +
                                "商品价格" + "\t" +
                                "第一季度商品销量" + "\t" +
                                "第二季度商品销量" + "\t" +
                                "第三季度商品销量" + "\t"
                );
                System.out.println(product1);
            }
        }
    }

    public void selectById() {
        System.out.print("请输入要查找的商品id关键词: ");
        String keyword2 = scanner.nextLine();

        scanner.nextLine(); // 消耗掉输入后的换行符
        List<Products> foundProducts2 = manager.searchProductsById(keyword2);
        if (foundProducts2.isEmpty()) {
            System.out.println("没有找到匹配的商品。");
        } else {
            System.out.println("找到以下匹配的商品：");
            for (Products product : foundProducts2) {
                System.out.println(
                        "商品ID" + "\t" +
                                "商品名称" + "\t\t" +
                                "商品价格" + "\t" +
                                "第一季度商品销量" + "\t" +
                                "第二季度商品销量" + "\t" +
                                "第三季度商品销量" + "\t"
                );
                System.out.println(product);
            }
        }
    }

}
