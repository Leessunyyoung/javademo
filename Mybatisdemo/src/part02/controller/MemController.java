package part02.controller;

import java.util.HashMap;
import java.util.List;

import part02.dao.MemDAO;
import part02.dto.MemDTO;

public class MemController {
	private MemDAO dao;
	
	public MemController() {
		dao = new MemDAO();
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
