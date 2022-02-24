package com.saitej.sfgdi.repositories;

import com.saitej.sfgdi.controllers.services.I18nEnglishGreetingService;
import org.springframework.stereotype.Repository;

@Repository
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

   private final I18nEnglishGreetingService i18nEnglishGreetingService;

    public EnglishGreetingRepositoryImpl(I18nEnglishGreetingService i18nEnglishGreetingService) {
        this.i18nEnglishGreetingService = i18nEnglishGreetingService;
    }

    @Override
    public String sayGreeting() {
        return i18nEnglishGreetingService.sayGreeting();
    }
}
