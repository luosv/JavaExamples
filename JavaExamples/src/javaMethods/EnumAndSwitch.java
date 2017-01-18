package javaMethods;

/**
 * enum和switch语句使用
 * Created by luosv on 2016/10/18 0018.
 */
enum Car {
    lamborghini, tata, audi, fiat, honda
}

public class EnumAndSwitch {

    public static void main(String[] args) {

        Car c;
        c = Car.tata;

        switch (c) {
            case lamborghini:
                System.out.println("你选择了 lamborghini!");
                break;
            case tata:
                System.out.println("你选择了 tata!");
                break;
            case audi:
                System.out.println("你选择了 tata!");
                break;
            case fiat:
                System.out.println("你选择了 fiat!");
                break;
            case honda:
                System.out.println("你选择了 honda!");
                break;
            default:
                System.out.println("渱不知道你的车型!");
                break;
        }

    }

}
