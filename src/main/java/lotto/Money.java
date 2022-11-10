package lotto;

import java.lang.IllegalArgumentException;

public class Money {

    private final Integer money;

    public Money(String money) {
        validate(money);
        this.money = Integer.parseInt(money);
    }

    public void validate(String money) {
        if (!validateIsDigit(money))
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
    }

    public boolean validateIsDigit(String money) {
        for (char c : money.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}