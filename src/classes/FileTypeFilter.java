/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Ulb-Kalema
 */
public class FileTypeFilter extends FileFilter {

	private String extension;
	private String description;
	
	public FileTypeFilter(String extension, String description) {
		this.extension = extension;
		this.description = description;
	}
	
	@Override
	public boolean accept(File file) {
		if (file.isDirectory()) {
			return true;
		}
		return file.getName().toLowerCase().endsWith(extension);
	}
	
	public String getDescription() {
		return description + String.format(" (*%s)", extension);
	}
}
