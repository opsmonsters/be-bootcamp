package com.opsmonsters.HelloWorld.services;

import com.opsmonsters.HelloWorld.dto.LoginDto;
import com.opsmonsters.HelloWorld.dto.ResponseDto;
import com.opsmonsters.HelloWorld.models.User;
import com.opsmonsters.HelloWorld.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtService jwtService;

    public ResponseDto userLogin(LoginDto dto){
        try{
             authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    dto.getUsername(),
                    dto.getPassword()
            ));

            Optional<User> userOptional = userRepo.findByEmail(dto.getUsername());
            if(userOptional.isEmpty()){
                return new ResponseDto(404, "Email Does Not exists");
            }

            User user = userOptional.get();
            String jwtToken = jwtService.generateToken(user);

            return new ResponseDto(200, jwtToken);

        }catch (BadCredentialsException badCredentials){
           return new ResponseDto(403, "Username / password is incorrect");
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseDto(500, "An Internal Error occurred");
        }
    }
}
