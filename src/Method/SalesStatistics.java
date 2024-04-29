package Method;

import Pojo.Products;
import Pojo.SalesData;

import java.util.ArrayList;
import java.util.List;

// ����һ���࣬���ڼ�������ͳ��
public class SalesStatistics {

    private static ArrayList<SalesData> salesDatas;

    public SalesStatistics() {
        salesDatas = new ArrayList<>();
    }

    public void addSales(SalesData salesData) {
        salesDatas.add(salesData);

    }


    public void displaySales() {
        if (salesDatas.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (SalesData salesData : salesDatas) {
                System.out.println(salesData);
            }
        }
    }


    // ��̬���������ڼ����������ݵ�ͳ����Ϣ
    public  void calculateStats() {
        // ��ʼ���������Ϊ�������
        double maxSales = Double.NEGATIVE_INFINITY;
        // ��ʼ���������Ϊ�������
        double minSales = Double.POSITIVE_INFINITY;
        // ��ʼ��������Ϊ0
        double totalSales = 0;

        // ����������Ʒ����������
        for (SalesData salesData : salesDatas) {
            // ��ȡ��ǰ��Ʒ�ĸ��������������洢��������
            int[] quarters = {salesData.getFirstQuarter(), salesData.getSecondQuarter(), salesData.getThirdQuarter()};
            // ������ǰ��Ʒ�ĸ���������
            for (double sales : quarters) {
                // �����������
                maxSales = Math.max(maxSales, sales);
                // �����������
                minSales = Math.min(minSales, sales);
                // �ۼ�������
                totalSales += sales;
            }
        }

        // ����ƽ������������ÿ����Ʒ�����������ȵ��������ݣ�
        double averageSales = totalSales / (salesDatas.size() * 3);

        // ��ӡ������������������ƽ������
        System.out.println("�������: " + maxSales);
        System.out.println("�������: " + minSales);
        System.out.println("ƽ������: " + averageSales);
    }
}
