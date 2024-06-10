
public class InsurancePolicy {
	
	private String package_code;
	private String description;
	private String duration;
	
	
	public InsurancePolicy(String package_code, String description, String duration) {
		this.package_code = package_code;
		this.description = description;
		this.duration = duration;
	}


	public String getPackage_code() {
		return package_code;
	}


	public void setPackage_code(String package_code) {
		this.package_code = package_code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
}
