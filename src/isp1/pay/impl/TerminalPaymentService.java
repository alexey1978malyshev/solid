package isp1.pay.impl;

import isp1.pay.CreditCardPayable;
import isp1.pay.PhonePayable;
import isp1.pay.WebMoneyPayable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TerminalPaymentService implements WebMoneyPayable, CreditCardPayable {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }


}
