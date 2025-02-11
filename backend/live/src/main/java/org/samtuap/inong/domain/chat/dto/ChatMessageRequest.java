package org.samtuap.inong.domain.chat.dto;

import lombok.Builder;

@Builder
public record ChatMessageRequest(
        Long memberId,
        Long sellerId,
        String sessionId,
        String name,
        String content,
        boolean isOwner,
        String type,
        Long couponId,
        String emoji
) {
}