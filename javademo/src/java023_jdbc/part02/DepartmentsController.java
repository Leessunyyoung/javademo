package java023_jdbc.part02;

import java.util.List;

public class DepartmentsController {
	public DepartmentsController() {
		// TODO Auto-generated constructor stub
	}
//	public void departmentsAllProcess() {
//		DepartmentsDAO dao = DepartmentsDAO.getInstance();
//		List<DepartmentsDTO> aList = dao.listDepartments();//aList는 (다오)return aList에서 받아온거다
//		for (DepartmentsDTO dto : aList) {
//			System.out.printf("%d %s %d %d\n",
//					dto.getDepartment_id(),
//					dto.getDepartment_name(),
//					dto.getManager_id(),
//					dto.getLocation_id());
//		}
		public List<DepartmentsDTO> departmentsAllProcess() {
			DepartmentsDAO dao = DepartmentsDAO.getInstance();//DAO에서 getInstance()를 받아온다
			return dao.listDepartments();
			
					
			
		}//departmentsAllProcess()
		public List<DepartmentsDTO> departmentsSearchProcess(String data){
			DepartmentsDAO dao = DepartmentsDAO.getInstance();
			return dao.searchDepartments(data);
			
		}
	}
	

