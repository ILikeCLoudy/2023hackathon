package com.main1team.Login_board.dto;

import com.main1team.Login_board.entity.NoticeEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class NoticeDTO {

    private Long id;

    private String period_start;

    private String period_end;

    private String sector;

    private String institution;

    private String volunteerType;

    private String personnel;

    private String certified;

    public static NoticeDTO toNoticeDTO(NoticeEntity noticeEntity) {
        NoticeDTO noticeDTO = new NoticeDTO();
            noticeDTO.setId(noticeEntity.getId());
            noticeDTO.setPeriod_start(noticeEntity.getPeriod_start());
            noticeDTO.setPeriod_end(noticeEntity.getPeriod_end());
            noticeDTO.setSector(noticeEntity.getSector());
            noticeDTO.setInstitution(noticeEntity.getInstitution());
            noticeDTO.setVolunteerType(noticeEntity.getVolunteerType());
            noticeDTO.setCertified(noticeEntity.getCertified());
            return noticeDTO;

    }
}
