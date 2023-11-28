import com.datarangers.sdk.DSL;
import com.datarangers.sdk.dslcontent.Expr;

import java.util.Arrays;
import java.util.HashMap;

public class TestCommon {
    public static DSL getAsaEventDSL() {
        return DSL.eventBuilder()
                .appIds(20001630).rangePeriod("day", 1700496000, 1700582399, false)
                .page(1000,0).skipCache(false)
                //.rangePeriod("hour", 1700496000, 1700582400, false)
                //.group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId")).skipCache(false)
//                .tags(new HashMap<String, Object>() {{
//                    put("contains_today", 0);
//                    put("show_yesterday", 0);
//                    put("series_type", "line");
//                    put("show_map", new HashMap<String, String>());
//                }})
//                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0)).show("老用户", "1"))
//                .andProfileFilter(Expr.stringExpr("language", "=", Arrays.asList("zj_CN", "zh_cn"))
//                        .stringExpr("age", "!=", Arrays.asList("20"))
//                        .show("zh_CN, zh_cn; not(20)", "2"))
                .query(Expr.show("A", "A")
                        .group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId"))
                        .event("origin", "ios_login_scene_HYJQ", "event_users")
                        //.measureInfo("pct", "event_index", 100)
//                        .andFilter(Expr.stringExpr("os_name", "=", Arrays.asList("windows"))
//                                .stringExpr("network_type", "!=", Arrays.asList("wifi"))
//                                .show("referer", "referrer_label"))
                )
//                .query(Expr.show("B", "B")
//                        .group("app_name")
//                        .event("origin", "page_open", "pv")
//                        .andFilter(Expr.emptyExpr().show("app_id", "app_id_label")))
                .builder();
    }

    public static DSL getBindCardEventDSL() {
        return DSL.eventBuilder()
                .appIds(20001630).rangePeriod("day", 1700496000, 1700582399, false)
                .page(1000,0).skipCache(false)
                //.rangePeriod("hour", 1700496000, 1700582400, false)
                //.group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId")).skipCache(false)
//                .tags(new HashMap<String, Object>() {{
//                    put("contains_today", 0);
//                    put("show_yesterday", 0);
//                    put("series_type", "line");
//                    put("show_map", new HashMap<String, String>());
//                }})
//                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0)).show("老用户", "1"))
//                .andProfileFilter(Expr.stringExpr("language", "=", Arrays.asList("zj_CN", "zh_cn"))
//                        .stringExpr("age", "!=", Arrays.asList("20"))
//                        .show("zh_CN, zh_cn; not(20)", "2"))
                .query(Expr.show("A", "A")
//                                .group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId"))
                                .event("origin", "Bindcard_resp_zxd_server", "event_users")
                                .andFilter(Expr.stringExpr("result_v33_zxd", "=", Arrays.asList("成功"), "event_param")
//                                        .show("referer", "referer_label")
                                        )
                        //.measureInfo("pct", "event_index", 100)
//                        .andFilter(Expr.stringExpr("result_v33_zxd", "=", Arrays.asList("成功"))
//                                .stringExpr("network_type", "!=", Arrays.asList("wifi"))
//                                .show("referer", "referrer_label"))
                )
//                .query(Expr.show("B", "B")
//                        .group("app_name")
//                        .event("origin", "page_open", "pv")
//                        .andFilter(Expr.emptyExpr().show("app_id", "app_id_label")))
                .builder();
    }


    public static DSL getScreenEventDSL() {
        return DSL.eventBuilder()
                .appIds(20001630).rangePeriod("day", 1700496000, 1700582399, false)
                .page(1000,0).skipCache(false)
                //.rangePeriod("hour", 1700496000, 1700582400, false)
                //.group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId")).skipCache(false)
//                .tags(new HashMap<String, Object>() {{
//                    put("contains_today", 0);
//                    put("show_yesterday", 0);
//                    put("series_type", "line");
//                    put("show_map", new HashMap<String, String>());
//                }})
//                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0)).show("老用户", "1"))
//                .andProfileFilter(Expr.stringExpr("language", "=", Arrays.asList("zj_CN", "zh_cn"))
//                        .stringExpr("age", "!=", Arrays.asList("20"))
//                        .show("zh_CN, zh_cn; not(20)", "2"))
                .query(Expr.show("A", "A")
//                                .group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId"))
                                .event("origin", "API_screen_result", "event_users")
                                .andFilter(Expr.stringExpr("partner", "=", Arrays.asList("易借"), "event_param")
//                                        .show("referer", "referer_label")
                                )
                                .andFilter(Expr.stringExpr("result", "=", Arrays.asList("1"), "event_param"))
                        //.measureInfo("pct", "event_index", 100)
//                        .andFilter(Expr.stringExpr("result_v33_zxd", "=", Arrays.asList("成功"))
//                                .stringExpr("network_type", "!=", Arrays.asList("wifi"))
//                                .show("referer", "referrer_label"))
                )
//                .query(Expr.show("B", "B")
//                        .group("app_name")
//                        .event("origin", "page_open", "pv")
//                        .andFilter(Expr.emptyExpr().show("app_id", "app_id_label")))
                .builder();
    }

    public static DSL getAccessEventDSL() {
        return DSL.eventBuilder()
                .appIds(20001630).rangePeriod("day", 1700496000, 1700582399, false)
                .page(1000,0).skipCache(false)
                //.rangePeriod("hour", 1700496000, 1700582400, false)
                //.group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId")).skipCache(false)
//                .tags(new HashMap<String, Object>() {{
//                    put("contains_today", 0);
//                    put("show_yesterday", 0);
//                    put("series_type", "line");
//                    put("show_map", new HashMap<String, String>());
//                }})
//                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0)).show("老用户", "1"))
//                .andProfileFilter(Expr.stringExpr("language", "=", Arrays.asList("zj_CN", "zh_cn"))
//                        .stringExpr("age", "!=", Arrays.asList("20"))
//                        .show("zh_CN, zh_cn; not(20)", "2"))
                .query(Expr.show("A", "A")
//                                .group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId"))
                                .event("origin", "API_library_result", "event_users")
                                .andFilter(Expr.stringExpr("partner", "=", Arrays.asList("易借"), "event_param")
//                                        .show("referer", "referer_label")
                                )
                                .andFilter(Expr.stringExpr("hitting_response", "=", Arrays.asList("1"), "event_param"))
                        //.measureInfo("pct", "event_index", 100)
//                        .andFilter(Expr.stringExpr("result_v33_zxd", "=", Arrays.asList("成功"))
//                                .stringExpr("network_type", "!=", Arrays.asList("wifi"))
//                                .show("referer", "referrer_label"))
                )
//                .query(Expr.show("B", "B")
//                        .group("app_name")
//                        .event("origin", "page_open", "pv")
//                        .andFilter(Expr.emptyExpr().show("app_id", "app_id_label")))
                .builder();
    }

    public static DSL getApplyEventDSL() {
        return DSL.eventBuilder()
                .appIds(20001630).rangePeriod("day", 1700496000, 1700582399, false)
                .page(1000,0).skipCache(false)
                //.rangePeriod("hour", 1700496000, 1700582400, false)
                //.group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId")).skipCache(false)
//                .tags(new HashMap<String, Object>() {{
//                    put("contains_today", 0);
//                    put("show_yesterday", 0);
//                    put("series_type", "line");
//                    put("show_map", new HashMap<String, String>());
//                }})
//                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0)).show("老用户", "1"))
//                .andProfileFilter(Expr.stringExpr("language", "=", Arrays.asList("zj_CN", "zh_cn"))
//                        .stringExpr("age", "!=", Arrays.asList("20"))
//                        .show("zh_CN, zh_cn; not(20)", "2"))
                .query(Expr.show("A", "A")
//                                .group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId"))
                                .event("origin", "API_oauth_required_harbor", "event_users")
                                .andFilter(Expr.stringExpr("partner", "=", Arrays.asList("易借"), "event_param")
//                                        .show("referer", "referer_label")
                                )
                                .andFilter(Expr.stringExpr("message", "=", Arrays.asList("{\"result\":1,\"retCode\":\"200\"}"), "event_param"))
                        //.measureInfo("pct", "event_index", 100)
//                        .andFilter(Expr.stringExpr("result_v33_zxd", "=", Arrays.asList("成功"))
//                                .stringExpr("network_type", "!=", Arrays.asList("wifi"))
//                                .show("referer", "referrer_label"))
                )
//                .query(Expr.show("B", "B")
//                        .group("app_name")
//                        .event("origin", "page_open", "pv")
//                        .andFilter(Expr.emptyExpr().show("app_id", "app_id_label")))
                .builder();
    }

    public static DSL getOauthCallbackAmountEventDSL() {
        return DSL.eventBuilder()
                .appIds(20001630).rangePeriod("day", 1700496000, 1700582399, false)
                .page(1000,0).skipCache(false)
                //.rangePeriod("hour", 1700496000, 1700582400, false)
                //.group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId")).skipCache(false)
//                .tags(new HashMap<String, Object>() {{
//                    put("contains_today", 0);
//                    put("show_yesterday", 0);
//                    put("series_type", "line");
//                    put("show_map", new HashMap<String, String>());
//                }})
//                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0)).show("老用户", "1"))
//                .andProfileFilter(Expr.stringExpr("language", "=", Arrays.asList("zj_CN", "zh_cn"))
//                        .stringExpr("age", "!=", Arrays.asList("20"))
//                        .show("zh_CN, zh_cn; not(20)", "2"))
                .query(Expr.show("A", "A")
                                .event("origin", "API_oauth_callback", "measure")
                        .measureInfo("sum", "amount", 0)
                                .andFilter(Expr.stringExpr("partner", "=", Arrays.asList("易借"), "event_param")
//                                        .show("referer", "referer_label")
                                )
                                .andFilter(Expr.stringExpr("result", "=", Arrays.asList("审核通过"), "event_param"))
                        //.measureInfo("pct", "event_index", 100)
//                        .andFilter(Expr.stringExpr("result_v33_zxd", "=", Arrays.asList("成功"))
//                                .stringExpr("network_type", "!=", Arrays.asList("wifi"))
//                                .show("referer", "referrer_label"))
                )
//                .query(Expr.show("B", "B")
//                        .group("app_name")
//                        .event("origin", "page_open", "pv")
//                        .andFilter(Expr.emptyExpr().show("app_id", "app_id_label")))
                .builder();
    }

    public static DSL getLoanEventDSL() {
        return DSL.eventBuilder()
                .appIds(20001630).rangePeriod("day", 1700496000, 1700582399, false)
                .page(1000,0).skipCache(false)
                //.rangePeriod("hour", 1700496000, 1700582400, false)
                //.group(Arrays.asList("loginScene","adGroupId","campaignId","keywordId")).skipCache(false)
//                .tags(new HashMap<String, Object>() {{
//                    put("contains_today", 0);
//                    put("show_yesterday", 0);
//                    put("series_type", "line");
//                    put("show_map", new HashMap<String, String>());
//                }})
//                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0)).show("老用户", "1"))
//                .andProfileFilter(Expr.stringExpr("language", "=", Arrays.asList("zj_CN", "zh_cn"))
//                        .stringExpr("age", "!=", Arrays.asList("20"))
//                        .show("zh_CN, zh_cn; not(20)", "2"))
                .query(Expr.show("A", "A")
                                .event("origin", "API_loan_request", "event_users")
                                .andFilter(Expr.stringExpr("partner", "=", Arrays.asList("通通分期3"), "event_param")
//                                        .show("referer", "referer_label")
                                )
                                .andFilter(Expr.stringExpr("loan_result", "=", Arrays.asList("成功"), "event_param"))
                        //.measureInfo("pct", "event_index", 100)
//                        .andFilter(Expr.stringExpr("result_v33_zxd", "=", Arrays.asList("成功"))
//                                .stringExpr("network_type", "!=", Arrays.asList("wifi"))
//                                .show("referer", "referrer_label"))
                )
//                .query(Expr.show("B", "B")
//                        .group("app_name")
//                        .event("origin", "page_open", "pv")
//                        .andFilter(Expr.emptyExpr().show("app_id", "app_id_label")))
                .builder();
    }

    public static DSL getFunnelDSL() {
        return DSL.funnelBuilder()
                .appIds(0)
                .rangePeriod("day", 1560268800, 1562774400)
                .group("os_name")
                .page(10, 2)
                .window("day", 10)
                .skipCache(false)
                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0))
                        .stringExpr("network_type", "!=", Arrays.asList("4g,3g"))
                        .show("1", "老用户; not(4g, 3g)"))
                .query(Arrays.asList(Expr.show("1", "查询1")
                                .sample(100)
                                .event("origin", "play_time", "pv")
                                .andFilter(Expr.stringExpr("os_name", "=", Arrays.asList("windows"))
                                        .show("referer_label", "referrer")),
                        Expr.show("2", "查询2").sample(100).event("origin", "app_launch", "pv")))
                .builder();
    }

    public static DSL getLifeCycleDSL() {
        return DSL.lifeCycleBuilder()
                .appIds(0)
                .rangePeriod("day", 1561910400, 1562428800)
                .page(10, 2)
                .window("day", 1)
                .skipCache(false)
                .tags(new HashMap<String, Object>() {{
                    put("series_type", "line");
                    put("contains_today", 0);
                    put("metrics_type", "number");
                    put("disabled_in_dashboard", true);
                }})
                .andProfileFilter(Expr.stringExpr("custom_mp_platform", "=", Arrays.asList("2"))
                        .stringExpr("app_channel", "in", Arrays.asList("alibaba", "baidu"))
                        .show("1", "全体用户")
                )
                .query(Expr.show("active_user", "active_user")
                        .sample(100).event("origin", "app_launch", "pv"))
                .builder();
    }

    public static DSL getPathFinderDSL() {
        return DSL.pathFindBuilder()
                .appIds(0)
                .rangePeriod("day", 1563120000, 1563638400)
                .page(10, 2)
                .window("minute", 10)
                .skipCache(false)
                .isStack(false)
                .andProfileFilter(Expr.stringExpr("os_name", "in", Arrays.asList("android", "ios"))
                        .stringExpr("network_type", "in", Arrays.asList("wifi", "4g"))
                        .show("1", "android, ios; wifi, 4g"))
                .query(Arrays.asList(Expr.show("1", "查询1")
                                .sample(100).event("origin", "app_launch")
                                .andFilter(Expr.emptyExpr().show("1", "全体用户")),
                        Expr.show("2", "查询2").sample(100)
                                .event("origin", "register")
                                .andFilter(Expr.emptyExpr().show("1", "全体用户")),
                        Expr.show("3", "查询3").sample(100)
                                .event("origin", "register")
                                .andFilter(Expr.emptyExpr().show("1", "全体用户")))
                )
                .builder();
    }

    public static DSL getRetentionDSL() {
        return DSL.retentionBuilder()
                .appIds(0)
                .rangePeriod("day", 1561910400, 1563033600)
                .page(10, 2)
                .group("network_type")
                .window("day", 30)
                .skipCache(false)
                .isStack(false)
                .tags(new HashMap<String, Object>() {{
                    put("retention_from", "custom");
                    put("series_type", "table");
                }})
                .andProfileFilter(Expr.intExpr("user_is_new", "=", Arrays.asList(0))
                        .show("1", "老用户"))
                .query(Arrays.asList(Expr.show("first", "起始事件")
                        .event("origin", "page_open", "pv")
                        .andFilter(
                                Expr.stringExpr("os_name", "=", Arrays.asList("windows", "mac", "ios"))
                                        .stringExpr("network_type", "!=", Arrays.asList("4g")).show("os_name_label", "os_name,network_type")
                        ), Expr.show("return", "回访事件")
                        .event("origin", "any_event")
                        .andFilter(Expr.stringExpr("os_name", "=", Arrays.asList("windows", "mac"))
                                .stringExpr("os_name", "=", Arrays.asList("Chrome", "Internet Explore"))
                                .show("1", "全体用户")
                        )
                ))
                .builder();
    }

    public static DSL getWebDSL() {
        return DSL.webBuilder()
                .appIds(0)
                .rangePeriod("day", 1562774400, 1563292800)
                .page(10, 2)
                .group("browser")
                .web("first", 1200)
                .skipCache(false)
                .isStack(false)
                .tags(new HashMap<String, Object>() {{
                    put("contains_today", 0);
                    put("series_type", "line");
                }})
                .andProfileFilter(Expr.stringExpr("os_name", "=", Arrays.asList("windows", "android"))
                        .show("1", "操作系统"))
                .query(Arrays.asList(
                        Expr.show("session_count", "会话数")
                                .sample(100)
                                .event("origin", "predefine_pageview", "session_count")
                                .andFilter(Expr.emptyExpr().show("1", "source")),
                        Expr.show("average_session_duration", "平均会话时长")
                                .event("origin", "predefine_pageview", "average_session_duration")
                                .andFilter(Expr.emptyExpr().show("1", "source")),
                        Expr.show("bounce_rate", "跳出率")
                                .event("origin", "predefine_pageview", "bounce_rate")
                                .andFilter(Expr.emptyExpr().show("1", "source")),
                        Expr.show("average_session_depth", "平均会话深度")
                                .event("origin", "predefine_pageview", "average_session_depth")
                                .andFilter(Expr.emptyExpr().show("1", "source"))
                ))
                .builder();
    }

    public static DSL getTopKDSL() {
        return DSL.topKBuilder()
                .appIds(0)
                .rangePeriod("day", 1563379200, 1563897600)
                .order("app_version")
                .page(10, 2)
                .skipCache(true)
                .tags(new HashMap<String, Object>() {{
                    put("contains_today", 0);
                    put("show_yesterday", 0);
                    put("series_type", "line");
                    put("show_map", new HashMap<String, String>());
                }})
                .andProfileFilter(Expr.intExpr("ab_version", "=", Arrays.asList(1))
                        .intExpr("user_is_new", "=", Arrays.asList(0))
                        .show("B", "新用户"))
                .query(Expr.show("A", "查询A").sample(100)
                        .event("origin", "predefine_pageview", "pv")
                        .measureInfo("pct", "event_index", 100)
                        .andFilter(Expr.stringExpr("referrer", "=", Arrays.asList("http://www.baidu.com"), "event_param")
                                .show("referer_label", "referer")
                        ))
                .builder();
    }

    public static DSL getTracerTableDSL() {
        DSL dsl_adv = DSL.advertiseBuilder()
                .advertise(new HashMap<String, Object>() {{
                    put("timeout", 1000);
                    put("alias_convert", false);
                    put("blend_params", new HashMap<String, String>() {{
                        put("group_by", "date");
                    }});
                }})
                .product("bytetracer")
                .appIds(0)
                .lastPeriod("day", 7, "day")
                .todayPeriod("day", true)
                .limit(1000).offset(0)
                .andProfileFilter(
                        Expr.emptyExpr().show("1", "channel_1, traceing_1, group_id_1")
                ).query(
                        Expr.show("impression_count", "impression_count")
                                .event("customed", "impression", "impression_count")
                ).query(
                        Expr.show("click_count", "click_count")
                                .event("customed", "click", "click_count")
                ).query(
                        Expr.show("promotion_activation_count", "promotion_activation_count")
                                .event("customed", "activation", "promotion_activation_count")
                )
                .builder();
        DSL dsl_rete = DSL.retentionBuilder()
                .product("bytefinder")
                .appIds(0)
                .lastPeriod("day", 7, "day")
                .todayPeriod("day", true)
                .page(1000, 0)
                .andProfileFilter(
                        Expr.emptyExpr().show("1", "channel_1, traceing_1, group_id_1")
                ).query(Arrays.asList(
                        Expr.show("1", "查询1")
                                .sample(100)
                                .event("origin", "app_launch")
                                .andFilter(
                                        Expr.intExpr("user_is_new", "=", Arrays.asList(1), "profile")
                                                .show("new_user", "new_user")
                                ),
                        Expr.show("2", "查询2").sample(100).event("origin", "app_launch")
                        )
                )
                .builder();


        return DSL.blendDSLs(0, Arrays.asList(dsl_adv, dsl_rete));
    }
}
