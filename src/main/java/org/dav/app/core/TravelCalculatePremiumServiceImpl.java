package org.dav.app.core;

import org.dav.app.rest.TravelCalculatePremiumRequest;
import org.dav.app.rest.TravelCalculatePremiumResponse;

public class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService{
    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        response.setPersonFirstName(request.getPersonFirstName());
        response.setPersonLastName(request.getPersonLastName());
        response.setAgreementDateFrom(request.getAgreementDateFrom());
        response.setAgreementDateTo(request.getAgreementDateTo());
        return response;
    }
}
