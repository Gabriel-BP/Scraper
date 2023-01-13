package es.ulpgc.scrapper;

import es.ulpgc.scrapper.api.ServerApi;
import es.ulpgc.scrapper.api.WebService;
import es.ulpgc.scrapper.scrapper.BookingScrapper;
import es.ulpgc.scrapper.scrapper.Scrapper;


public class Controller {
    private final Scrapper bookingScrapper;
    private final ServerApi webService;

    public Controller() {
        bookingScrapper = new BookingScrapper();
        webService = new WebService();
    }

    public void run(int nPages, String urlWithoutOffset) {
        bookingScrapper.scrapper(nPages, urlWithoutOffset);
        webService.start();
    }

}
