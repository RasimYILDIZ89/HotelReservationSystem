package com.tobeto.demo.services.abstracts;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.services.dtos.requests.guest.AddGuestRequest;
import com.tobeto.demo.services.dtos.requests.guest.UpdateGuestRequest;
import com.tobeto.demo.services.dtos.responses.guest.AddGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.ListGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.UpdateGuestResponse;


import java.util.List;

public interface GuestService {

    List<ListGuestResponse> getAll();

    Guest getById(int id);

    AddGuestResponse add (AddGuestRequest request);

    DeleteGuestResponse delete (int id);

    UpdateGuestResponse update(UpdateGuestRequest request);

    Guest mapGuestIdToGuest(int guestId);


}
