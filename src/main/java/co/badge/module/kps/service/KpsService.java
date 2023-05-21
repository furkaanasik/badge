package co.badge.module.kps.service;

import co.badge.module.kps.controller.dtos.KpsDTO;

public interface KpsService {

    boolean isValid(KpsDTO kpsDTO);
}
