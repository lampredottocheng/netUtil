package controller;

import model.EModel;
import service.EService;
import common.MsgBean;



public class EController {
	
	EService eService = new EService();
	
	public String index(EModel eModel){
		//サービスを呼び出し、画面初期化設定
		eService.init(eModel);
		//log記録
		System.out.println(MsgBean.eMsg);
		//画面遷移
		return "a.html";
	}
	

}
