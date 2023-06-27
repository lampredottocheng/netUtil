package controller;

import common.MsgBean;
import model.AModel;
import model.CModel;
import service.AService;
import service.CService;

public class CController {
	
	CService cService = new CService();
	
	public String index(CModel cModel){
		//サービスを呼び出し、画面初期設定
		cService.init(cModel);
		//ログ表示
		System.out.println(MsgBean.cMsg);
		//画面遷移
		return "c.html";
	}
	

}
