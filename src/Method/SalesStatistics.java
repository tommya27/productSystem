package Method;

import Pojo.Products;
import Pojo.SalesData;

import java.util.ArrayList;
import java.util.List;

// 定义一个类，用于计算销量统计
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


    // 静态方法，用于计算销量数据的统计信息
    public  void calculateStats() {
        // 初始化最高销量为负无穷大
        double maxSales = Double.NEGATIVE_INFINITY;
        // 初始化最低销量为正无穷大
        double minSales = Double.POSITIVE_INFINITY;
        // 初始化总销量为0
        double totalSales = 0;

        // 遍历所有商品的销量数据
        for (SalesData salesData : salesDatas) {
            // 获取当前商品的各季度销量，并存储到数组中
            int[] quarters = {salesData.getFirstQuarter(), salesData.getSecondQuarter(), salesData.getThirdQuarter()};
            // 遍历当前商品的各季度销量
            for (double sales : quarters) {
                // 更新最高销量
                maxSales = Math.max(maxSales, sales);
                // 更新最低销量
                minSales = Math.min(minSales, sales);
                // 累加总销量
                totalSales += sales;
            }
        }

        // 计算平均销量（假设每个商品都有三个季度的销量数据）
        double averageSales = totalSales / (salesDatas.size() * 3);

        // 打印最高销量、最低销量和平均销量
        System.out.println("最高销量: " + maxSales);
        System.out.println("最低销量: " + minSales);
        System.out.println("平均销量: " + averageSales);
    }
}
