package org.example.filestoragesystem.service;

import org.example.filestoragesystem.dtos.LoginDto;
import org.example.filestoragesystem.dtos.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
