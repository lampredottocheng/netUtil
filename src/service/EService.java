package service;

import model.EModel;


public class EService {
	
	public int init(EModel eModel){
		eModel.setName("zhangsan");
		eModel.setSex("man");
		
		return 1;
	}
}