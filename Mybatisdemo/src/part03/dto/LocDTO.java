package part03.dto;

import java.util.List;

public class LocDTO {
	private int location_id;
	private String city;
	private List<DeptDTO> deotList;
	
	public LocDTO() {
		
	}
	public List<DeptDTO> getDeotList() {
		return deotList;
	}
	public void setDeotList(List<DeptDTO> deotList) {
		this.deotList = deotList;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
