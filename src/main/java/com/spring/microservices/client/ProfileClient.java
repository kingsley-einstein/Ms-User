package com.spring.microservices.client;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "profile-service")
public interface ProfileClient {
    @GetMapping("/api/v1/profile/{user_id}")
    Profile getProfile(@PathVariable("user_id") UUID user_id);
}