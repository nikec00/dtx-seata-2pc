package cn.itcast.dtx.seatademo.bank1.controller;

import cn.itcast.dtx.seatademo.bank1.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
public class Bank1Controller {

    @Autowired
    AccountInfoService accountInfoService;

    //张三转账
    @GetMapping("/transfer")
    public String transfer(Double amount) {
        accountInfoService.updateAccountBalance("1", amount);
        return "bank1" + amount;
    }

    @GetMapping("/withHold")
    public String withHold(Double money) {
        accountInfoService.withHold("1", money);
        return "bank1" + money;
    }
}
