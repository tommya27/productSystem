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
        System.out.println("-------------��Ʒ��Ϣ����ϵͳ-------------");

        System.out.println("1. ��Ʒ������Ϣ����ģ��");
        System.out.println("2. ��Ʒ����ͳ��ģ��");
        System.out.println("3. �˳�");

        System.out.println("---------------------------------------");
        System.out.println("��ѡ��һ��ѡ�");
    }

    //MENU 1

    public void menu1() {
        System.out.println("-------------��Ʒ������Ϣ����˵�-------------");
        System.out.println("1. �����Ʒ��Ϣ");
        System.out.println("2. ɾ����Ʒ��Ϣ");
        System.out.println("3. �޸���Ʒ��Ϣ");
        System.out.println("4. ��ʾ������Ʒ��Ϣ");
        System.out.println("5. ������Ʒ��Ʒ");
        System.out.println("6. ����͵�������");
        System.out.println("7. �����ϼ��˵�");
        System.out.println("---------------------------------------");
        System.out.println("��ѡ��һ��ѡ�");
    }

    public void addAll() {
        System.out.println("��ѡ���������Ʒ��Ϣ��");
        // ��������������Ʒ��Ϣ���߼�
        System.out.print("��������ƷID: ");
        String id = scanner.nextLine();
//                    scanner.nextLine(); // ���ĵ������Ļ��з�
        System.out.print("��������Ʒ����: ");
        String name = scanner.nextLine();
//                    scanner.nextLine(); // ���ĵ������Ļ��з�
        System.out.print("��������Ʒ�۸�: ");
        double price = scanner.nextDouble();

        System.out.print("�������һ������Ʒ����: ");
        int sales1 = scanner.nextInt();
        System.out.print("������ڶ�������Ʒ����: ");
        int sales2 = scanner.nextInt();
        System.out.print("���������������Ʒ����: ");
        int sales3 = scanner.nextInt();

        scanner.nextLine(); // ���ĵ������Ļ��з�
        product1 = new Products(id, name, price, sales1, sales2, sales3);
        salesData = new SalesData(sales1, sales2, sales3);

        manager.addProduct(product1);
        salesAll.addSales(salesData);
    }

    public void deleteById() {

        System.out.println("��ѡ����ɾ����Ʒ��Ϣ��");
        // ���������ɾ����Ʒ��Ϣ���߼�
        System.out.print("������Ҫɾ������ƷID: ");
        String deleteId = scanner.nextLine();
        manager.deleteProduct(deleteId);
    }

    public void updataById() {
        System.out.print("��ѡ�����޸���Ʒ��Ϣ��");
        // ����������޸���Ʒ��Ϣ���߼�
        System.out.print("������Ҫ�޸ĵ���ƷID: ");
        String updateId = scanner.nextLine();
        System.out.print("�������µ���Ʒ���� (���ղ��޸�): ");
        String newName = scanner.nextLine();
        System.out.print("�������µ���Ʒ�۸� (���ղ��޸�): ");
        double newPrice = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
        scanner.nextLine(); // ���ĵ������Ļ��з������κ�ʣ�������
//                    System.out.print("��������Ʒ����: ");
//                    int newSales = scanner.nextInt();

        System.out.print("�������һ������Ʒ����: ");
        int newSales1 = scanner.nextInt();
        System.out.print("������ڶ�������Ʒ����: ");
        int newSales2 = scanner.nextInt();
        System.out.print("���������������Ʒ����: ");
        int newSales3 = scanner.nextInt();

        scanner.nextLine(); // ���ĵ������Ļ��з�
        manager.updateProduct(updateId, newName, newPrice, newSales1, newSales2, newSales3);
    }


    public void printAllData() {
        System.out.println("��ѡ������ʾ������Ʒ��Ϣ��");
        // �����������ʾ������Ʒ��Ϣ���߼�
        System.out.println(
                "��ƷID" + "\t" +
                        "��Ʒ����" + "\t\t" +
                        "��Ʒ�۸�" + "\t" +
                        "��һ������Ʒ����" + "\t" +
                        "�ڶ�������Ʒ����" + "\t" +
                        "����������Ʒ����" + "\t"
        );
        manager.displayProducts();
    }

    //MENU 2
    public void menu2() {
        System.out.println("-------------��Ʒ����ͳ�Ʋ˵�-------------");
        System.out.println("1. ������ͳ��");
        System.out.println("2. �����ϼ��˵�");
        System.out.println("---------------------------------------");
        System.out.println("��ѡ��һ��ѡ�");
    }

    public void statisticSales() {
        System.out.println("��ѡ���˰�����ͳ�ơ�");
        // ��������Ӱ�����ͳ�Ƶ��߼�
        System.out.println(
                "��һ������Ʒ����" + "\t" +
                        "�ڶ�������Ʒ����" + "\t" +
                        "����������Ʒ����" + "\t"
        );
        salesAll.displaySales();
        salesAll.calculateStats();
    }

    //MENU 3
    public void menu3() {
        System.out.println("-------------��Ʒ������Ϣ����˵�-------------");
        System.out.println("1. ���ҵ���Ʒ���ƹؼ���:");
        System.out.println("2. ���ҵ���Ʒid�ؼ���:");
        System.out.println("3. �����ϼ��˵�");
        System.out.println("---------------------------------------");
        System.out.println("��ѡ��һ��ѡ�");
    }

    public void selectByName() {
        System.out.print("������Ҫ���ҵ���Ʒ���ƹؼ���: ");
        String keyword1 = scanner.nextLine();

        scanner.nextLine(); // ���ĵ������Ļ��з�
        List<Products> foundProducts1 = manager.searchProductsByName(keyword1);
        if (foundProducts1.isEmpty()) {
            System.out.println("û���ҵ�ƥ�����Ʒ��");
        } else {
            System.out.println("�ҵ�����ƥ�����Ʒ��");
            for (Products product1 : foundProducts1) {
                System.out.println(
                        "��ƷID" + "\t" +
                                "��Ʒ����" + "\t\t" +
                                "��Ʒ�۸�" + "\t" +
                                "��һ������Ʒ����" + "\t" +
                                "�ڶ�������Ʒ����" + "\t" +
                                "����������Ʒ����" + "\t"
                );
                System.out.println(product1);
            }
        }
    }

    public void selectById() {
        System.out.print("������Ҫ���ҵ���Ʒid�ؼ���: ");
        String keyword2 = scanner.nextLine();

        scanner.nextLine(); // ���ĵ������Ļ��з�
        List<Products> foundProducts2 = manager.searchProductsById(keyword2);
        if (foundProducts2.isEmpty()) {
            System.out.println("û���ҵ�ƥ�����Ʒ��");
        } else {
            System.out.println("�ҵ�����ƥ�����Ʒ��");
            for (Products product : foundProducts2) {
                System.out.println(
                        "��ƷID" + "\t" +
                                "��Ʒ����" + "\t\t" +
                                "��Ʒ�۸�" + "\t" +
                                "��һ������Ʒ����" + "\t" +
                                "�ڶ�������Ʒ����" + "\t" +
                                "����������Ʒ����" + "\t"
                );
                System.out.println(product);
            }
        }
    }

}
