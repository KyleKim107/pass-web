package com.fitness.pass.passweb.service.pass;

import com.fitness.pass.passweb.repository.pass.PassStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Pass {
    private Integer passSeq;
    private Integer packageSeq;
    private String packageName;
    private String userId;

    private PassStatus status;
    private Integer remainingCount;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private LocalDateTime expiredAt;

}
