import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.datarangers.sdk.DSL;
import com.datarangers.sdk.RangersClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestClient {
    private String ak = "****";
    private String sk = "****";
    private RangersClient rangersClient = null;

    public void analysisRequest(DSL dsl) throws Exception {
        // 开放api统一使用 /openapi 前缀，headers、params 默认传null，若传空Map则code会返回 1403 错误
        System.out.println(JSON.toJSONString(dsl));
        String result = rangersClient.dataFinder("/openapi/v1/analysis", "post", null, null, JSON.toJSONString(dsl));
        System.out.println(result);
        JSONObject resultObject = JSON.parseObject(result);
        Assert.assertEquals("result not ok", (int) resultObject.getInteger("code"), 200);
        Assert.assertEquals("message not SUCCESS", resultObject.getString("message"), "success");
//        for (Object obj : resultObject.getJSONArray("data")) {
//            JSONObject obj_ = (JSONObject) obj;
//            Assert.assertEquals("message error", "SUCCESS", obj_.getString("result_status"));
//        }
        for (Object data : resultObject.getJSONArray("data")) {
            JSONObject dataJson = (JSONObject) data;
            dataJson.getJSONArray("data_item_list").forEach(dataItem -> {
                JSONObject dataItemJson = (JSONObject) dataItem;
                JSONObject eventParams = dataItemJson.getJSONObject("event_params");
                JSONArray count = dataItemJson.getJSONArray("data");
                System.out.println("keywordId:" + eventParams.getString("keywordId")
                        + ", campaignId:" + eventParams.getString("campaignId")
                        + ", loginScene:" + eventParams.getString("loginScene")
                        + ", adGroupId:" + eventParams.getString("adGroupId")
                        + ", count:" + count.getInteger(0));
            });

        }
    }

    public void dataRracerRequest(DSL dsl) throws Exception {
        String result = rangersClient.dataTracer("/openapi/v1/161842/query/table", "post", null, null, JSON.toJSONString(dsl));
        System.out.println(result);
    }

    @Before
    public void init() {
        if (rangersClient == null) {
            rangersClient = new RangersClient(ak, sk);
            // 若私有化部署，则需要传产品私有化访问域名url
//            rangersClient = new RangersClient(ak, sk,"产品私有化访问域名");
        }
    }

    @Test
    public void testAsaEvent() throws Exception {
        analysisRequest(TestCommon.getAsaEventDSL());
    }

    @Test
    public void testBindEvent() throws Exception {
        analysisRequest(TestCommon.getBindCardEventDSL());
    }

    @Test
    public void testScreenEvent() throws Exception {
        analysisRequest(TestCommon.getScreenEventDSL());
    }

    @Test
    public void testAccessEvent() throws Exception {
        analysisRequest(TestCommon.getAccessEventDSL());
    }

    @Test
    public void testApplyEvent() throws Exception {
        analysisRequest(TestCommon.getApplyEventDSL());
    }

    @Test
    public void testOauthCallbackAmountEvent() throws Exception {
        analysisRequest(TestCommon.getOauthCallbackAmountEventDSL());
    }

    @Test
    public void testLoanEvent() throws Exception {
        analysisRequest(TestCommon.getLoanEventDSL());
    }

    @Test
    public void testFunnel() throws Exception {
        analysisRequest(TestCommon.getFunnelDSL());
    }

    @Test
    public void testLifeCycle() throws Exception {
        analysisRequest(TestCommon.getLifeCycleDSL());
    }

    @Test
    public void testPathFinder() throws Exception {
        analysisRequest(TestCommon.getPathFinderDSL());
    }

    @Test
    public void testRetention() throws Exception {
        analysisRequest(TestCommon.getRetentionDSL());
    }

    @Test
    public void testWeb() throws Exception {
        analysisRequest(TestCommon.getWebDSL());
    }

    @Test
    public void testTopK() throws Exception {
        analysisRequest(TestCommon.getTopKDSL());
    }

    @Test
    public void testTracerTable() throws Exception {
        dataRracerRequest(TestCommon.getTracerTableDSL());
    }

    @Test
    public void testRangersOpenAPI() throws Exception {
        String result = rangersClient.dataRangers("/openapi/v1/xxx/date/2020-02-20/2020-02-23/downloads", "get");
        System.out.println(result);
    }
}
