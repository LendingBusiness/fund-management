package org.kd.fund;

import org.kd.model.LendingRestApp;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundManagement extends LendingRestApp {

    public static void main(String[] args) {
        start(FundManagement.class, AppName.FUND_MANAGEMENT, args);
    }

}
