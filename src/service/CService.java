package service;

import model.AModel;
import model.CModel;

public class CService {
	//������ڻ��I��
	public int init(CModel cModel){
		cModel.setName("lisi");
		cModel.setSex("man");
		cModel.setMajor("math");
		return 1;
	}
}
