package dto;

public class AccommodationDto {
	protected int Accommodation_id;
	protected String user_id;
	protected String Accommodation_name;
	protected String location;
	protected String location_detail;
	protected int cleaning_star;
	protected int location_star;
	protected int satisfied_star;
	protected String a_image_path;
	protected String a_option;
		
	public int getAccommodation_id() {
		return Accommodation_id;
	}
	public void setAccommodation_id(int accommodation_id) {
		Accommodation_id = accommodation_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getAccommodation_name() {
		return Accommodation_name;
	}
	public void setAccommodation_name(String accommodation_name) {
		Accommodation_name = accommodation_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation_detail() {
		return location_detail;
	}
	public void setLocation_detail(String location_detail) {
		this.location_detail = location_detail;
	}
	public int getCleaning_star() {
		return cleaning_star;
	}
	public void setCleaning_star(int cleaning_star) {
		this.cleaning_star = cleaning_star;
	}
	public int getLocation_star() {
		return location_star;
	}
	public void setLocation_star(int location_star) {
		this.location_star = location_star;
	}
	public int getSatisfied_star() {
		return satisfied_star;
	}
	public void setSatisfied_star(int satisfied_star) {
		this.satisfied_star = satisfied_star;
	}
	public String getA_image_path() {
		return a_image_path;
	}
	public void setA_image_path(String a_image_path) {
		this.a_image_path = a_image_path;
	}
	public String getA_option() {
		return a_option;
	}
	public void setA_option(String a_option) {
		this.a_option = a_option;
	}
	
	
}
