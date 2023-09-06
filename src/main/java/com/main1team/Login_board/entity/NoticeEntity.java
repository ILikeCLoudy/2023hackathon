package com.main1team.Login_board.entity;
import com.main1team.Login_board.dto.NoticeDTO;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "notice")

public class NoticeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column
    private String period_start;

    @Column
    private String period_end;

    @Column
    private String sector;

    @Column
    private String institution;

    @Column
    private String volunteerType;

    @Column
    private String personnel;

    @Column
    private String certified;

    public static NoticeDTO toNoticeDTO(NoticeDTO noticeDTO) {
        NoticeEntity noticeEntity = new NoticeEntity();
        noticeEntity.setId(noticeDTO.getId());
        noticeEntity.setPeriod_start(noticeDTO.getPeriod_start());
        noticeEntity.setPeriod_end(noticeDTO.getPeriod_end());
        noticeEntity.setSector(noticeDTO.getSector());
        noticeEntity.setInstitution(noticeDTO.getInstitution());
        noticeEntity.setVolunteerType(noticeDTO.getVolunteerType());
        noticeEntity.setCertified(noticeDTO.getCertified());
        return noticeEntity;
    }

    public static NoticeDTO toUpdateNoticeDTO(NoticeDTO noticeDTO) {
        NoticeEntity noticeEntity = new NoticeEntity();
        noticeEntity.setId(noticeDTO.getId());
        noticeEntity.setPeriod_start(noticeDTO.getPeriod_start());
        noticeEntity.setPeriod_end(noticeDTO.getPeriod_end());
        noticeEntity.setSector(noticeDTO.getSector());
        noticeEntity.setInstitution(noticeDTO.getInstitution());
        noticeEntity.setVolunteerType(noticeDTO.getVolunteerType());
        noticeEntity.setCertified(noticeDTO.getCertified());
        return noticeEntity;
    }


}
