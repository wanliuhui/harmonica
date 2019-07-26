package alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;

public class Payment {
	
	public static void main(String[] args) throws AlipayApiException {
		
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","app_id","your private_key","json","GBK","alipay_public_key","RSA2");
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		request.setBizContent("{" +
		"\"out_trade_no\":\"20150320010101001\"," +
		"\"trade_no\":\"2014112611001004680 073956707\"" +
		"  }");
		AlipayTradeQueryResponse response = alipayClient.execute(request);
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
		System.out.println("12346765432");

//		ads

//		dshakdhadadk
	}
	
}
