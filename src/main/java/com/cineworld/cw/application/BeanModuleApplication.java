package com.cineworld.cw.application;

import com.cineworld.cw.application.actor.CreateActorApplication;
import com.cineworld.cw.application.actor.GetActorApplication;
import com.cineworld.cw.application.address.CreateAddressApplication;
import com.cineworld.cw.application.category.CreateCategoryApplication;
import com.cineworld.cw.application.category.GetCategoryApplication;
import com.cineworld.cw.application.country.GetCountryApplication;
import com.cineworld.cw.application.customer.CreateCustomerApplication;
import com.cineworld.cw.application.customer.GetCustomerApplication;
import com.cineworld.cw.application.customer.UpdateCustomerApplication;
import com.cineworld.cw.application.film.CreateFilmApplication;
import com.cineworld.cw.application.film.GetFilmApplication;
import com.cineworld.cw.domain.services.actor.CreateActorService;
import com.cineworld.cw.domain.services.actor.GetActorService;
import com.cineworld.cw.domain.services.address.CreateAddressService;
import com.cineworld.cw.domain.services.category.CreateCategoryService;
import com.cineworld.cw.domain.services.category.GetCategoryService;
import com.cineworld.cw.domain.services.country.GetCountryService;
import com.cineworld.cw.domain.services.customer.CreateCustomerService;
import com.cineworld.cw.domain.services.customer.GetCustomerService;
import com.cineworld.cw.domain.services.customer.UpdateCustomerService;
import com.cineworld.cw.domain.services.film.CreateFilmService;
import com.cineworld.cw.domain.services.film.GetFilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {


  @Bean
  public GetCategoryApplication getCategoryApplication(
      GetCategoryService getCategoryService) {
    return new GetCategoryApplication(getCategoryService);
  }

  @Bean
  public CreateFilmApplication createFilmApplication(
      CreateFilmService createFilmService,
      GetCategoryApplication categoryApplication) {
    return new CreateFilmApplication(createFilmService, categoryApplication);
  }

  @Bean
  public CreateCustomerApplication createCustomerApplication(
      CreateCustomerService createCustomerService,
      CreateAddressApplication createAddressApplication) {
    return new CreateCustomerApplication(createCustomerService, createAddressApplication);
  }

  @Bean
  public GetCustomerApplication getCustomerApplication(
      GetCustomerService getCustomerService) {
    return new GetCustomerApplication(getCustomerService);
  }

  @Bean
  public UpdateCustomerApplication updateCustomerApplication(
      UpdateCustomerService updateCustomerService) {
    return new UpdateCustomerApplication(updateCustomerService);
  }

  @Bean
  public GetCountryApplication getCountryApplication(
      GetCountryService getCountryService) {
    return new GetCountryApplication(getCountryService);
  }

  @Bean
  public GetFilmApplication getFilmApplication(
      GetFilmService getFilmService) {
    return new GetFilmApplication(getFilmService);
  }

  @Bean
  public GetActorApplication getActorApplication(
      GetActorService getActorService) {
    return new GetActorApplication(getActorService);
  }

  @Bean
  public CreateActorApplication createActorApplication(
      CreateActorService createActorService,
      GetCountryApplication getCountryApplication) {
    return new CreateActorApplication(createActorService, getCountryApplication);
  }

  @Bean
  public CreateCategoryApplication createCategoryApplication(
      CreateCategoryService createCategoryService) {
    return new CreateCategoryApplication(createCategoryService);
  }

  @Bean
  public CreateAddressApplication createAddressApplication(
      CreateAddressService createAddressService) {
    return new CreateAddressApplication(createAddressService);
  }
}
