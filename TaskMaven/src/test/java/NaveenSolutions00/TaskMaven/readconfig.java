package NaveenSolutions00.TaskMaven;
//package com.bank.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class readconfig {
	Properties pro;
	public readconfig()
	{
		File src=new File("C:\\Users\\HP\\eclipse-workspace\\PROJECT1\\bank\\src\\test\\java\\configurations\\config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		}
	catch(Exception e)
	{
		System.out.println("Exception is "+e.getMessage());
	}
		}
public String getApplicationURl()
{
	String url=pro.getProperty("baseurl");
	return url;
}
public String getUserName()
{
	String username=pro.getProperty("username");
	return username;
}

public String getpassword()
{
	String password=pro.getProperty("username");
	return password;
}

public String getchromepath()
{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
}

public String getiepath()
{
	String iepath=pro.getProperty("iepath");
	return iepath;
}

public String getfirefoxpath()
{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
}

}
