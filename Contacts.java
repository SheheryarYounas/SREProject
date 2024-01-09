
public class Contacts  {

		private String fName;
		private String lName;
		private String phoneNumber;
		private String city;
		private String country;
		private String address;
		private String website;
		private String mobile;
		private String company;
		private String uniqueID;
		private String group;
		private String birthday;
		
		public Contacts(String fName, String lName, String phoneNumber, String city, String country, String address,
				String website, String mobile, String company, String group, long ID, String birthday) 
		{
			this.uniqueID = String.valueOf(ID);
			this.fName = fName;
			this.lName = lName;
			this.phoneNumber = phoneNumber;
			this.city = city;
			this.country = country;
			this.address = address;
			this.website = website;
			this.mobile = mobile;
			this.company = company;
			this.group = group;
			this.birthday = birthday;
		}

		public String getBirthday() {
			return birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getUniqueID() {
			return uniqueID;
		}

		public void setUniqueID(String uniqueID) {
			this.uniqueID = uniqueID;
		}
		
		
		
		
		
		
}
