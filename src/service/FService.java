package service;

import model.FModel;

public class FService {
	//������ڻ��I��
	public int init(FModel fModel){
		fModel.setName("zhangsan");
		fModel.setSex("man");
		fModel.setMajor("english");
		return 1;
	}
}
