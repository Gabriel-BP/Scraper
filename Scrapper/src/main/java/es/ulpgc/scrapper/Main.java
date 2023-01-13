package es.ulpgc.scrapper;

public class Main {

    public static void main(String[] args) {
        int nPages = 2;
        String urlWithoutOffset = "https://www.booking.com/searchresults.es.html?label=gen173nr-1FC" +
                "AEoggI46AdIM1gEaEaIAQGYAQq4ARfIAQzYAQHoAQH4AQuIAgGoAgO4AoTXhZ4GwAIB0gIkYTBhMDczMGE" +
                "tNDVmOC00YjA3LTk0ODAtZmI3ZTQzZDVlNGY22AIG4AIB&sid=b68542328d4bfe9a1bb27bea7a3f4aa0" +
                "&sb_lp=1&src=index&error_url=https%3A%2F%2Fwww.booking.com%2Findex.es.html%3Flabel" +
                "%3Dgen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARfIAQzYAQHoAQH4AQuIAgGoAgO4AoTXhZ4GwAIB" +
                "0gIkYTBhMDczMGEtNDVmOC00YjA3LTk0ODAtZmI3ZTQzZDVlNGY22AIG4AIB%26sid%3Db68542328d4bf" +
                "e9a1bb27bea7a3f4aa0%26sb_price_type%3Dtotal%26%26&ss=Gran+Canaria%2C+Espa%C3%B1a&i" +
                "s_ski_area=&checkin_year=&checkin_month=&checkout_year=&checkout_month=&efdco=1&gr" +
                "oup_adults=2&group_children=0&no_rooms=1&b_h4u_keep_filters=&from_sf=1&dest_id=-387" +
                "820&dest_type=city&search_pageview_id=f07e66426dbf00e3&search_selected=true&offset=";

        Controller controller = new Controller();
        controller.run(nPages, urlWithoutOffset);
    }
}
