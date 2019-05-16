package com.java.action;
import java.io.File;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

public class PictureAction {
	private File photo;
	private String photoFileName;
	private String photoContentType;
	private String picUrl;
	
	public String picture(){
		System.out.println(photo.getAbsolutePath()+";"+photoFileName+";"+photoContentType);
		
//		ServletContext application = ServletActionContext.getServletContext();		
//		String filePath = application.getRealPath("/files");
		File file = new File("D:\\picfile");
		if(!file.exists()){
			file.mkdirs();
		}
		String newFileName= System.currentTimeMillis() + photoFileName.substring(photoFileName.lastIndexOf("."));
		photo.renameTo(new File(file,newFileName));
		
		picUrl = "/pic/"+newFileName;
		return "showPic";
	}

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	
	
}
