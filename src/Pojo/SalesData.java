package Pojo;

// 定义一个类，用于存储商品的销量数据
public class SalesData {
    // 第一季度销量
    private int firstQuarter;
    // 第二季度销量
    private int secondQuarter;
    // 第三季度销量
    private int thirdQuarter;

    // 构造方法，用于创建SalesData对象时初始化销量数据


    public SalesData() {
    }

    public SalesData(int firstQuarter, int secondQuarter, int thirdQuarter) {
        this.firstQuarter = firstQuarter;
        this.secondQuarter = secondQuarter;
        this.thirdQuarter = thirdQuarter;
    }


    public void setFirstQuarter(int firstQuarter) {
        this.firstQuarter = firstQuarter;
    }

    public void setSecondQuarter(int secondQuarter) {
        this.secondQuarter = secondQuarter;
    }

    public void setThirdQuarter(int thirdQuarter) {
        this.thirdQuarter = thirdQuarter;
    }

    // 获取第一季度销量的getter方法
    public int getFirstQuarter() {
        return firstQuarter;
    }

    // 获取第二季度销量的getter方法
    public int getSecondQuarter() {
        return secondQuarter;
    }

    // 获取第三季度销量的getter方法
    public int getThirdQuarter() {
        return thirdQuarter;
    }

    @Override
    public String toString() {
        return  firstQuarter + "\t\t\t\t" +
                secondQuarter + "\t\t\t\t" +
                thirdQuarter ;

    }
}
