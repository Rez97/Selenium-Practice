package com.org.learningMaven;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class tfile {

	Scanner s;
	ArrayList<TextData> h = new ArrayList<TextData>();

	@Parameters({ "fileName", "browser", "version" })

	public String readFile(String fileName, String browser, String version) {

		try {
			s = new Scanner(new BufferedReader(new FileReader(fileName)));

			String line = "";
			String[] tabArray;
			while (s.hasNext()) {
				line = s.nextLine();
				tabArray = line.split("\t"); // pretty much takes a line and splits all the strings based on tab.
				TextData p = new TextData(tabArray[0], tabArray[1], tabArray[2]);
				h.add(p);
			}

			/*
			 * for (int i = 0; i < h.size(); i++) { if ((h.get(i).getBrowser() + "" +
			 * h.get(i).getVersion()).equals(browser + "" + version)) { String drive =
			 * h.get(i).getWebVersion(); System.out.println(drive); return drive; } }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}

		String result = IntStream
				.range(0, h.size())
				.filter(r -> (h.get(r).getBrowser() + "" + h.get(r).getVersion()).equals(browser + "" + version))
				.mapToObj(i -> h.get(i).getWebVersion())
				.findFirst()
				.orElse("No webdriver has been found for " + browser + "V." + version);

		return result;

	}

	@Parameters({ "fileName", "browser", "version" })
	public void result(String fileName, String browser, String version) {
		String t = readFile(fileName, browser, version);
		System.out.println(t);
	}

}
