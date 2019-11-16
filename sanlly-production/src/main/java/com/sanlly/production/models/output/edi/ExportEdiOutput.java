package com.sanlly.production.models.output.edi;

import java.util.List;
import java.util.Map;

public class ExportEdiOutput {

	private List<Map<String,String>> files;

	public List<Map<String, String>> getFiles() {
		return files;
	}

	public void setFiles(List<Map<String, String>> files) {
		this.files = files;
	}
	
	
}
