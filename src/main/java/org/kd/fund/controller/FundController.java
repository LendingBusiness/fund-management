package org.kd.fund.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/fund-management")
public class FundController {

    private static final Logger logger = LoggerFactory.getLogger(FundController.class);

}
