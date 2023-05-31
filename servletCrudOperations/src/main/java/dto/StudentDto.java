package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDto {
	@Id
private int Sid;
private String Sname;
private long Phno;
private String Gender;
public int getSid() {
	return Sid;
}
public void setSid(int sid) {
	Sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public long getPhno() {
	return Phno;
}
public void setPhno(long phno) {
	Phno = phno;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
@Override
public String toString() {
	return "StudentDto [Sid=" + Sid + ", Sname=" + Sname + ", Phno=" + Phno + ", Gender=" + Gender + "]";
}


//overrding toString() method....


}
