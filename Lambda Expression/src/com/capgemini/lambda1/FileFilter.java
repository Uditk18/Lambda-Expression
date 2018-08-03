package com.capgemini.lambda1;

import java.io.File;

public class FileFilter {

	/*	********************************************************/

	public static void allDirectories(File file) {
		File[] list = file.listFiles(pathname -> true);
		if (list != null) {
			for (File list1 : list) {
				if (list1.isDirectory()) {
					allDirectories(list1);
					System.out.println("Directory :%s%n" + list1.getAbsolutePath());

				}
			}

		}

	}

	/*	********************************************************/
	public static void allFiles(File file) {

		File[] list = file.listFiles(pathname -> true);
		for (File list1 : list) {
			if (list1.isFile()) {
				System.out.println("File:%s%n" + list1.getName());

			} else {
				allFiles(list1);
			}

		}
	}

	/*	********************************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allDirectories(new File("P:\\Users\\ukarwasr\\Documents\\workspace-sts-3.9.5.RELEASE\\File InputOutput"));
		System.out.println("===========================");
		allFiles(new File("P:\\Users\\ukarwasr\\Documents\\workspace-sts-3.9.5.RELEASE\\File InputOutput"));
		System.out.println("===========================");

	}

}
