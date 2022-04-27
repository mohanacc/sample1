package com.baseclasscrt;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adatinexcel {
	public static void main(String[] args) throws IOException {
		Baseclass base =new Baseclass();
		base.Browserlaunch();
		base.loadurl("https://adactinhotelapp.com/index.php");
		base.impwait();

		WebElement id = base.Findelement_id("username");
		String user = base.getdatas("C:\\Users\\praka\\OneDrive\\Documents\\Mavenbasics\\Excel\\Adatinhotel.xlsx", "Sheet1", 1,0);
		base.sendvalues(id, user);

		WebElement id2 = base.Findelement_id("password");
		String pass = base.getdatas("C:\\Users\\praka\\OneDrive\\Documents\\Mavenbasics\\Excel\\Adatinhotel.xlsx", "Sheet1",1,1);
		base.sendvalues(id2,pass);

		WebElement clck = base.Findelement_id("login");
		base.Clickable(clck);

		WebElement id3 = base.Findelement_id("location");
		base.Selectbyindex(id3,3);

		WebElement id4 = base.Findelement_id("hotels");
		base.Selectbyindex(id4,3);
		WebElement id5 = base.Findelement_id("room_type");
		base.Selectbyindex(id5,3);
		WebElement id6 = base.Findelement_id("room_nos");
		base.Selectbyindex(id6,3);
		WebElement datein = base.Findelement_id("datepick_in");
		base.sendvalues(datein, "18/04/2022");
		WebElement dateout = base.Findelement_id("datepick_out");
		base.sendvalues(dateout, "20/04/2022");
		WebElement id7 = base.Findelement_id("adult_room");
		base.Selectbyindex(id7,3);
		WebElement id8 = base.Findelement_id("child_room");
		base.Selectbyindex(id8,3);

		WebElement submit = base.Findelement_id("Submit");
		base.Clickable(submit);

		WebElement b1 = base.Findelement_id("radiobutton_0");
		base.Clickable(b1);

		WebElement b2 = base.Findelement_id("continue");
		base.Clickable(b2);


		WebElement firstname = base.Findelement_id("first_name");
		String getdatas = base.getdatas("C:\\Users\\praka\\OneDrive\\Documents\\Mavenbasics\\Excel\\Adatinhotel.xlsx", "Sheet1",1,10);
		base.sendvalues(firstname, getdatas);

		WebElement lastname = base.Findelement_id("last_name");
		String g1 = base.getdatas("C:\\Users\\praka\\OneDrive\\Documents\\Mavenbasics\\Excel\\Adatinhotel.xlsx", "Sheet1",1,11);
		base.sendvalues(lastname,g1);


		WebElement address = base.Findelement_id("address");
		String g2 = base.getdatas("C:\\Users\\praka\\OneDrive\\Documents\\Mavenbasics\\Excel\\Adatinhotel.xlsx", "Sheet1",1,12);
		base.sendvalues(address, g2);


		WebElement creditno = base.Findelement_id("cc_num");
		String g3 = base.getdatas("C:\\Users\\praka\\OneDrive\\Documents\\Mavenbasics\\Excel\\Adatinhotel.xlsx", "Sheet1",1,13);
		base.sendvalues(creditno, g3);



		WebElement cred = base.Findelement_id("cc_type");
		base.Selectbyindex(cred, 2);


		WebElement month = base.Findelement_id("cc_exp_month");
		base.Selectbyindex(month, 10);

		WebElement year = base.Findelement_id("cc_exp_year");
		base.Selectbyindex(year, 12);


		WebElement ccv = base.Findelement_id("cc_cvv");
		String g4 = base.getdatas("C:\\Users\\praka\\OneDrive\\Documents\\Mavenbasics\\Excel\\Adatinhotel.xlsx", "Sheet1",1,16);
		base.sendvalues(ccv, g4);




		WebElement book = base.Findelement_id("book_now");
		base.Clickable(book);


		WebElement orderno = base.Findelement_id("order_no");
		String value1 = base.Getattribute(orderno);

		base.Writedatas("C:\\Users\\praka\\OneDrive\\Documents\\Mavenbasics\\Excel\\Adatinhotel.xlsx","Sheet1", 1, 17,value1);


		base.quitbrowser();



	}      

}
