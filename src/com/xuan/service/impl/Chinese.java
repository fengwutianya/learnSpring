package com.xuan.service.impl;

import com.xuan.service.Axe;
import com.xuan.service.Person;

/**
 * Created by xuan on 2017/3/1 0001.
 */
public class Chinese implements Person {
    public Axe getAxe() {
        return axe;
    }

    public Chinese(Axe axe) {
        this.axe = axe;
    }

    private Axe axe;

    public void userAxe() {
        System.out.println(axe.chop());
    }
}
