import java.sql.*;

public class Model {
	String url = "jdbc:mysql://localhost:3306/newdb";
	String user = "root";
	String password = "1am14cs204";
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	
	private String name;
	private String un;
	private String pw;
	private String usn;
	private String branch;
	private String sem;
	private String gender;
	private String totalfees;
	private String feespaid;
	private int remainingfees;
	
	public Model() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,user,password);
	}
	
	public boolean addAccountant() {
		try {
			String query = "INSERT INTO ACCOUNTANT VALUES(?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, un);
			pstmt.setString(3, pw);
			int status = pstmt.executeUpdate();
			
			if(status>0)
				return true;
			else
				return false;
		} catch(Exception e) {}
		return false;
	}
	
	public boolean deleteAccountant() {
		try {
			String query = "DELETE FROM ACCOUNTANT WHERE NAME=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			int status = pstmt.executeUpdate();
			
			if(status>0)
				return true;
			else
				return false;
		} catch(Exception e) {}
		return false;
	}
	
	public boolean accountantLogin() {
		try {
			String query = "SELECT * FROM ACCOUNTANT WHERE USERNAME=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, un);
			res = pstmt.executeQuery();
			
			if(res.next()==true) {
				name = res.getString(1);
				String c = res.getString(3);
				
				if(c.equals(pw))
					return true;
				else
					return false;
			}
		} catch(Exception e) {}
		return false;
	}
	
	public boolean addStudent() {
		try {
			String query = "INSERT INTO STUDENTS VALUES(?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, usn);
			pstmt.setString(3, branch);
			pstmt.setString(4, sem);
			pstmt.setString(5, gender);
			pstmt.setString(6, totalfees);
			pstmt.setString(7, feespaid);
			
			Integer i1 = new Integer(totalfees);
			Integer i2 = new Integer(feespaid);
			int tf = i1.intValue();
			int fp = i2.intValue();
			setRemainingfees((tf-fp));
			
			pstmt.setString(8, feespaid);
			int status = pstmt.executeUpdate();
			
			if(status>0)
				return true;
			else
				return false;
		} catch(Exception e) {}
		return false;
	}
	
	public boolean viewStudentDetails() {
		try {
			String query = "SELECT * FROM STUDENTS WHERE NAME=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			res = pstmt.executeQuery();
			
			if(res.next()==true) {
				//name = res.getString(1);
				usn = res.getString(2);
				branch = res.getString(3);
				sem = res.getString(4);
				gender = res.getString(5);
				totalfees = res.getString(6);
				feespaid = res.getString(7);
				setRemainingfees(res.getInt(8));
					return true;
			}
			else
				return false;
		} catch(Exception e) {}
		return false;
	}
	
	public boolean editStudent() {
		try {
				String query = "UPDATE STUDENTS SET REMAINING_FEES=?,FEES_PAID=? WHERE USN=?";
				pstmt = con.prepareStatement(query);
				
				Integer i1 = new Integer(feespaid);
				Integer i2 = new Integer(totalfees);
				int fp = i1.intValue();
				int tf = i2.intValue();
				remainingfees = remainingfees-fp;
				fp = tf-remainingfees;
				
				
				pstmt.setInt(1, remainingfees);
				pstmt.setInt(2, fp);
				pstmt.setString(3, usn);

				int status = pstmt.executeUpdate();
			
			if(status>0) {
					return true;
			}
			else
				return false;
		} catch(Exception e) {}
		return false;
	}

	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	
	public String getUn() {	return un;	}
	public void setUn(String un) {	this.un = un;	}
	
	public String getPw() {	return pw;	}
	public void setPw(String pw) {	this.pw = pw;	}

	public String getUsn() {	return usn;	}
	public void setUsn(String usn) {	this.usn = usn;	}

	public String getBranch() {	return branch;	}
	public void setBranch(String branch) {	this.branch = branch;	}

	public String getSem() {	return sem;	}
	public void setSem(String sem) {	this.sem = sem;	}

	public String getGender() {	return gender;	}
	public void setGender(String gender) {	this.gender = gender;	}

	public String getTotalfees() {	return totalfees;	}
	public void setTotalfees(String totalfees) {	this.totalfees = totalfees;	}

	public String getFeespaid() {	return feespaid;	}
	public void setFeespaid(String feespaid) {	this.feespaid = feespaid;	}

	public int getRemainingfees() {	return remainingfees;	}
	public void setRemainingfees(int remainingfees) {	this.remainingfees = remainingfees;	}
}
