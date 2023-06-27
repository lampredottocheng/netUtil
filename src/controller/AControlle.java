
import common.MsgBean;
import model.AModel;
import service.AService;

public class AControlle {
	
	AService aService = new AService();
	
	public String index(AModel aModel){
		//���`�ӥ�����ӳ�����������ڻ��O��
		aService.init(aModel);
		//logӛ�h
		System.out.println(MsgBean.aMsg);
		//�����w��
		return "a.html";
	}
	

}
