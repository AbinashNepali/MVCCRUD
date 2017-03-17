package myapp.model;

public class Contact {
 String Employe_id, Employe_Name, Mobile_No, Office_No, Home_No, E_mail;
 
public Contact(){
	
}
public Contact(String employe_id, String employe_Name, String mobile_No, String office_No, String home_No,
		String e_mail) {
	super();
	Employe_id = employe_id;
	Employe_Name = employe_Name;
	Mobile_No = mobile_No;
	Office_No = office_No;
	Home_No = home_No;
	E_mail = e_mail;
}

public String getEmploye_id() {
	return Employe_id;
}

public void setEmploye_id(String employe_id) {
	Employe_id = employe_id;
}

public String getEmploye_Name() {
	return Employe_Name;
}

public void setEmploye_Name(String employe_Name) {
	Employe_Name = employe_Name;
}

public String getMobile_No() {
	return Mobile_No;
}

public void setMobile_No(String mobile_No) {
	Mobile_No = mobile_No;
}

public String getOffice_No() {
	return Office_No;
}

public void setOffice_No(String office_No) {
	Office_No = office_No;
}

public String getHome_No() {
	return Home_No;
}

public void setHome_No(String home_No) {
	Home_No = home_No;
}

public String getE_mail() {
	return E_mail;
}

public void setE_mail(String e_mail) {
	E_mail = e_mail;
}
 
}
