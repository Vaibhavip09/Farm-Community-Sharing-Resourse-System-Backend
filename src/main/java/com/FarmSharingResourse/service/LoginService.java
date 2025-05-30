
package com.FarmSharingResourse.service;

import com.FarmSharingResourse.model.Login;

public interface LoginService {
    Login findByUsernameAndPassword(String username, String password);
    boolean validateUser(String username, String password);
}
