package com.brunomendes.ScrapingData.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ScrapingController {

	public ScrapingController() {
		super();
	}
	
	public void raspagemPura(String urlStr) throws IOException {
		URL url = new URL(urlStr);
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		InputStream inputStream = openConnection.getInputStream(); 
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String linha = bufferedReader.readLine();
		while ( linha != null) {
			System.out.println(linha);
			linha = bufferedReader.readLine();
		}
		bufferedReader.close();
		inputStream.close();
		inputStreamReader.close();
	}
	
	public void raspagemJSoup(String urlStr) throws IOException {
		URL url = new URL(urlStr);
		Document document = Jsoup.parse(url, 30000);
		String esquerdaGolCssQuery	= "html > body > div:nth-of-type(3) > main "
				+ "> main > div > div > div:nth-of-type(2) > div "
				+ "> div:nth-of-type(3) > ul > li:nth-of-type(";
		String direitaGolCssQuery = ") > div:nth-of-type(2) > div:nth-of-type(2) > p:first-of-type";
		for (int i = 0 ; i <= 20; i++) {
			Elements element = document.select(esquerdaGolCssQuery+i+direitaGolCssQuery);
			String elementStr = element.toString().replace("<p class=\"matches__goal\">", "");
			elementStr = elementStr.toString().replace("</p>", "");
			System.out.println(elementStr);
		}
	}
	
	public void parse(String selector) {
		
	}
}
