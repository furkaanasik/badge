package co.badge.module.kps.service.impl;

import co.badge.kpsPublic.KPSPublicV2;
import co.badge.kpsPublic.KPSPublicV2Soap;
import co.badge.module.kps.controller.dtos.KpsDTO;
import co.badge.module.kps.service.KpsService;
import org.springframework.stereotype.Service;

@Service
public class KpsServiceImpl implements KpsService {

    private final KPSPublicV2Soap client;

    public KpsServiceImpl() {
        this.client = new KPSPublicV2().getKPSPublicV2Soap();
    }

    @Override
    public boolean isValid(KpsDTO kps) {
        return client.kisiVeCuzdanDogrula(
                kps.getTckn(),
                kps.getFirstName(),
                kps.getLastName(),
                kps.isNoLastName(),
                kps.getBirthDay(),
                kps.isNoBirthDay(),
                kps.getBirthMonth(),
                kps.isNoBirthMonth(),
                kps.getBirthYear(),
                kps.getIdentityCardSerial(),
                kps.getIdentityCardNo(),
                kps.getTcknSerialNo()
        );
    }
}
