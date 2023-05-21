package co.badge.module.kps.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class KpsModel {
    private long tckn;
    private String firstName;
    private String lastName;
    private boolean noLastName;
    private Integer birthDay;
    private boolean noBirthDay;
    private Integer birthMonth;
    private boolean noBirthMonth;
    private int birthYear;
    private String identityCardSerial;
    private Integer identityCardNo;
    private String tcknSerialNo;
}
