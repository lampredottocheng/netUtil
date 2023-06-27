package controller;

import common.MsgBean;
import model.AModel;
import service.AService;

public class AController {
	
	AService aService = new AService();
	
	public String index(AModel aModel){
		//サービスを呼び出し、画面初期化設定
		aService.init(aModel);
		//log記録
		System.out.println(MsgBean.AMsg);
		//画面遷移
		return "a.html";
	}
	

}
