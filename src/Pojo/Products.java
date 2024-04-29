package Pojo;

public class Products {
    private String id;
    private String name;
    private double price;

    private int sales1;
    private int sales2;
    private int sales3;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSales1() {
        return sales1;
    }

    public void setSales1(int sales1) {
        this.sales1 = sales1;
    }

    public int getSales2() {
        return sales2;
    }

    public void setSales2(int sales2) {
        this.sales2 = sales2;
    }

    public int getSales3() {
        return sales3;
    }

    public void setSales3(int sales3) {
        this.sales3 = sales3;
    }

    public Products() {
    }

    public Products(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Products(int sales1, int sales2, int sales3) {
        this.sales1 = sales1;
        this.sales2 = sales2;
        this.sales3 = sales3;
    }

    public Products(String id, String name, double price, int sales1, int sales2, int sales3) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sales1 = sales1;
        this.sales2 = sales2;
        this.sales3 = sales3;
    }

    @Override
    public String toString() {
        return    id + "\t\t" +
                 name + "\t\t" +
                 price + '\t' +
                 sales1 + "\t\t\t\t"  +
                 sales2 + "\t\t\t\t\t"  +
                 sales3 + "\t\t\t\t\t"  ;
    }
}