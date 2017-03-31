package org.kisio.labs.navitiasdk.utils;

import org.junit.Test;
import org.kisio.labs.navitiasdk.models.journeys.JourneysResponse;

import static org.junit.Assert.*;

public class DataFetcherTest {
    @Test
    public void shouldMarshallCorrectlyWithNavitiaResponse() throws Exception {
        // Given
        DataFetcher<JourneysResponse> dataFetcher = new DataFetcher<>(JourneysResponse.class, "9e304161-bb97-4210-b13d-c71eaf58961c");

        // When
        JourneysResponse journeysResponse = dataFetcher.fetch("https://api.navitia.io/v1/coverage/fr-idf/journeys?to=2.373686;48.845796&from=2.3880234;48.8378968");

        // Then
        assertNotNull(journeysResponse);
    }
}