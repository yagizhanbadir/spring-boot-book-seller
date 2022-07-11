package com.yb.springbootbookseller.service;

import com.yb.springbootbookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJwt(User signInRequest);
}
