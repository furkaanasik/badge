package co.badge.module.kps.controller.dtos;

import lombok.*;

@Data
@AllArgsConstructor
public class KpsDTO {
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
