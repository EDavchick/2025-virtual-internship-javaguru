package org.dav.app.core;

import org.dav.app.rest.TravelCalculatePremiumRequest;
import org.dav.app.rest.TravelCalculatePremiumResponse;

public interface TravelCalculatePremiumService {
    TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request);
}
