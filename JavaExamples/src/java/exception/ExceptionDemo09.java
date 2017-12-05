package java.exception;

/**
 * 自定义异常
 * Created by luosv on 2016/10/24 0024.
 */
class WrongInputException extends Exception {

    WrongInputException(String s) {

        super(s);

    }

}

class Input {

    void method() throws WrongInputException {

        throw new WrongInputException("Wrong input");

    }

}

public class ExceptionDemo09 {

    public static void main(String[] args) {

        try {

            new Input().method();

        } catch (WrongInputException wie) {

            System.out.println(wie.getMessage());

        }

    }

}
