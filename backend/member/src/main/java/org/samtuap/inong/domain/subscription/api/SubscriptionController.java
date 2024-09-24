package org.samtuap.inong.domain.subscription.api;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.samtuap.inong.domain.subscription.dto.BillingKeyRegisterRequest;
import org.samtuap.inong.domain.subscription.service.SubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/subscription")
@RequiredArgsConstructor
@RestController
public class SubscriptionController {
    private final SubscriptionService subscriptionService;
    @PostMapping("/register-billing-key")
    public ResponseEntity<Void> registerBillingKey(@RequestHeader("myId") Long memberId,
                                                   @RequestBody @Valid BillingKeyRegisterRequest dto) {
        subscriptionService.registerBillingKey(memberId, dto.billingKey());

        return ResponseEntity.ok(null);
    }

}