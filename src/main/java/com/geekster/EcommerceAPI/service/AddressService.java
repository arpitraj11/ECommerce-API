package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Address;
import com.geekster.EcommerceAPI.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address added";
    }
}
