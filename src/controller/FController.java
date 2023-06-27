package controller;

import common.FMsgBean;
import model.FModel;
import service.FService;

public class FController {
	
	FService fService = new FService();
	
	public String index(FModel fModel){
		//���`�ӥ�����ӳ�����������ڻ��O��
		fService.init(fModel);
		//logӛ�h
		System.out.println(FMsgBean.fMsg);
		//�����w��
		return "a.html";
	}
	

}
