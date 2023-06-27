package service;

import model.SampleModel;

public class SampleService {
	//画面初期化処理
	public int init(SampleModel sampleModel){
		sampleModel.setName("zhangsan");
		return 1;
	}
}
