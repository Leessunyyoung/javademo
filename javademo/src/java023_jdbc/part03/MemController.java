package java023_jdbc.part03;

import java.util.HashMap;
import java.util.List;

public class MemController {
	private MemDAO dao;
	
	public MemController() {
		dao = MemDAO.getInstance();
	}
	public List<MemDTO> listPrecess(){
		return dao.listMethod();
	}//end listProcess()
	
	
	public int insertProcess(MemDTO dto) {
		return dao.insertMethod(dto);
	}
	
	public int updateProcess(HashMap<String,Object>hamp) {
		return dao.updateMethod(hamp);
	}
	
	public int deleteProcess(int age) {
		return dao.deleteMethod(age);
	}
}//end class
