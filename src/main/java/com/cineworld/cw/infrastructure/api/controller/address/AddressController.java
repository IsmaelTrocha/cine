package com.cineworld.cw.infrastructure.api.controller.address;

import com.cineworld.cw.application.address.CreateAddressApplication;
import com.cineworld.cw.application.address.GetAddressApplication;
import com.cineworld.cw.infrastructure.api.dto.request.AddressRequest;
import com.cineworld.cw.infrastructure.api.dto.response.AddressResponse;
import com.cineworld.cw.infrastructure.api.dto.response.CreateResponse;
import com.cineworld.cw.infrastructure.api.mapper.request.AddressRequestMapper;
import com.cineworld.cw.infrastructure.api.mapper.response.AddressResponseMapper;
import com.cineworld.cw.shared.exception.code.MessageCode;
import com.cineworld.cw.shared.utils.MessageUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/address")
public class AddressController {

  private final CreateAddressApplication createAddressApplication;
  private final AddressRequestMapper addressRequestMapper;
  private final AddressResponseMapper addressResponseMapper;
  private final MessageUtils messageUtils;
  private final GetAddressApplication getAddressApplication;

  @PostMapping
  public ResponseEntity<CreateResponse> getAddressById(
      @RequestBody AddressRequest addressRequest) {
    createAddressApplication.createAddress(addressRequestMapper.toEntity(addressRequest));
    return new ResponseEntity<>(
        new CreateResponse(messageUtils.getMessage(MessageCode.SUCCESSFUL.getType()),
            messageUtils.getMessage(MessageCode.SUCCESSFUL.getType()),
            messageUtils.getMessage(MessageCode.SUCCESSFUL.getType())),
        HttpStatus.CREATED);
  }

  @GetMapping("/getAll/{id}")
  public ResponseEntity<List<AddressResponse>> getAddressByCustomerId(@PathVariable("id") Long id) {
    return new ResponseEntity<>(
        addressResponseMapper.toDto(getAddressApplication.addressByCustomerIdIn(id)),
        HttpStatus.OK);
  }
}
