package com.ebanking.utility_class;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro ;
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream f = new FileInputStream(src);
			pro = new  Properties();
			pro.load(f);
		}catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	public  String getURL()
	{
		String url = pro.getProperty("basURL");
		return url;
	}
	
	public String getuser()
	{
		String user = pro.getProperty("Username");
		return user;
	}
	
	public String getpwd()
	{
		String pas = pro.getProperty("Password");
		return pas;
	}
	
	public String getChrome()
	{
		String bro = pro.getProperty("chromepath");
		return bro;
	}
	public String getFirfox()
	{
		String bro = pro.getProperty("firefoxpath");
		return bro;
	}
	public String getMSEdge()
	{
		String bro = pro.getProperty("edgepath");
		return bro;
	}
	public String Title()
	{
		String bro = pro.getProperty("mainTitle");
		return bro;
	}

}
