package org.samtuap.inong.domain.farmNotice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.samtuap.inong.domain.common.BaseEntity;

@Entity
public class FarmNoticeImage extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notice_id")
    private FarmNotice farmNotice;

    @Column(columnDefinition = "varchar(32779)")
    private String imageUrl;
}
