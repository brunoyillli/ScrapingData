package com.brunomendes.ScrapingData.view;

import java.io.IOException;

import com.brunomendes.ScrapingData.controller.ScrapingController;

public class Principal {

	public static void main(String[] args) {
		ScrapingController sc = new ScrapingController();
		try {
			sc.raspagemJSoup("https://www.cnnbrasil.com.br/esporte/futebol/brasileirao-serie-a-2021/");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

}
