package javaMethods;

/**
 * Enum（枚举）构造函数及方法的使用
 * Created by luosv on 2016/10/18 0018.
 */
enum Cars {

    lamborghini(900), tata(2), audi(50), fiat(15), honda(12);
    private int price;

    Cars(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

}

public class Enum {

    public static void main(String[] args) {

        System.out.println("所有汽车的价格： ");
        for (Cars c : Cars.values()) {
            System.out.println(c + " 需要 " + c.getPrice() + " 千美元");
        }

    }

}
