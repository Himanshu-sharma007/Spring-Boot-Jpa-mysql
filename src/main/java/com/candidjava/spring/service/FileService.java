package com.candidjava.spring.service;

import java.util.List;

import com.candidjava.spring.bean.FileBean;

public interface FileService {

	public List<FileBean> getAllPdfFile();

	public FileBean finbyDeleteId(long id);

	
	
}
