package controller;

import common.MsgBean;
import model.AModel;
import service.AService;

public class AController {
	
	AService aService = new AService();
	
	public String index(AModel aModel){
		//サービスを呼び出し、画面初期設定
		aService.init(aModel);
		//ログ表示
		System.out.println(MsgBean.aMsg);
		//画面遷移
		return "a.html";
	}
	

}
