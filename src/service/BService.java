package service;

import model.AModel;

public class BService {
	//������ڻ��I��
	public int init(BModel bModel){
		bModel.setName("zhangsan");
		bModel.setSex("man");
		bModel.setMajor("english");
		return 1;
	}
}
