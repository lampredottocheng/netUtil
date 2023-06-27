package controller;

import common.MsgBean;
import model.SampleModel;
import service.SampleService;

public class SampleController {
	
	SampleService sampleService = new SampleService();
	
	public String index(SampleModel sampleModel){
		//サービスを呼び出し、画面初期化設定
		sampleService.init(sampleModel);
		//log記録
		System.out.println(MsgBean.sampleMsg);
		//画面遷移
		return "sample.html";
	}
	

}
