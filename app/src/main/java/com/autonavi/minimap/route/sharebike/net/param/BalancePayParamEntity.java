package com.autonavi.minimap.route.sharebike.net.param;

import com.amap.bundle.network.request.param.builder.AosURLBuilder;
import com.amap.bundle.network.request.param.builder.ParamEntity;
import com.amap.bundle.network.request.param.builder.URLBuilder.Path;

@Path(builder = AosURLBuilder.class, host = "aos_sns_url", sign = {"cpSource", "orderId"}, url = "ws/boss/order/bike/balance_pay/?")
public class BalancePayParamEntity implements ParamEntity {
    public String cpSource;
    public String orderId;

    public BalancePayParamEntity(String str, String str2) {
        this.cpSource = str;
        this.orderId = str2;
    }
}
