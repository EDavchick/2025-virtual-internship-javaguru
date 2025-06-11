package org.dav.app.core;

import org.dav.app.rest.TravelCalculatePremiumRequest;
import org.dav.app.rest.TravelCalculatePremiumResponse;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService{
    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        response.setPersonFirstName(request.getPersonFirstName());
        response.setPersonLastName(request.getPersonLastName());
        response.setAgreementDateFrom(request.getAgreementDateFrom());
        response.setAgreementDateTo(request.getAgreementDateTo());

        var daysBetween = calculateAgreementBetweenDays(request);
        response.setAgreementPrice(new BigDecimal(daysBetween));

        return response;
    }

    private long calculateAgreementBetweenDays(TravelCalculatePremiumRequest request){
        long diff = request.getAgreementDateFrom().getTime() - request.getAgreementDateTo().getTime();

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
