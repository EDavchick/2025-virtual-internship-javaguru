package org.dav.app.core;

import org.dav.app.rest.TravelCalculatePremiumRequest;
import org.dav.app.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelCalculatePremiumServiceImplTest {
    private TravelCalculatePremiumServiceImpl calculatePremiumService;
    private TravelCalculatePremiumRequest request;
    private TravelCalculatePremiumResponse response;

    @BeforeEach
    public void setUp(){
        calculatePremiumService = new TravelCalculatePremiumServiceImpl();
        request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Lena");
        request.setPersonLastName("Davydova");
        request.setAgreementDateFrom(new Date());
        request.setAgreementDateTo(new Date());
        response = calculatePremiumService.calculatePremium(request);
    }

//    @Test
//    public void shouldBeRightPerson() {
//        request.setPersonFirstName("Lena");
//        request.setPersonLastName("Davydova");
//        request.setAgreementDateFrom(new Date());
//        request.setAgreementDateTo(new Date());
//        TravelCalculatePremiumResponse response = calculatePremiumService.calculatePremium(request);
//        assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
//        assertEquals(response.getPersonLastName(), request.getPersonLastName());
//        assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
//        assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
//    }

    @Test
    public void shouldBeRightFirstName(){
        assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }

    @Test
    public void shouldBeRightLastName(){
        assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }

    @Test
    public void shouldBeRightDate(){
        assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

}


