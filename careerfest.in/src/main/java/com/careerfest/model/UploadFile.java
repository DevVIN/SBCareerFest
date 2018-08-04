package com.careerfest.model;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {

	 private MultipartFile Resumefile;
	 private MultipartFile ePhotoFile;


	public MultipartFile getResumefile() {
		return Resumefile;
	}

	public void setResumefile(MultipartFile resumefile) {
		Resumefile = resumefile;
	}

	public MultipartFile getePhotoFile() {
		return ePhotoFile;
	}

	public void setePhotoFile(MultipartFile ePhotoFile) {
		this.ePhotoFile = ePhotoFile;
	}

	}

