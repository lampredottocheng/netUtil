package service;

import model.AModel;

public class AService {
	//画面初期化処理
	public int init(AModel aModel){
		aModel.setName("zhangsan");
		aModel.setSex("man");
		aModel.setMajor("english");
		return 1;
	}
}
