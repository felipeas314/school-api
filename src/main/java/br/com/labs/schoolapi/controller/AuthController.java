package br.com.labs.schoolapi.controller;

import br.com.labs.schoolapi.dto.JWTResponseDTO;
import br.com.labs.schoolapi.dto.LoginDTO;
import br.com.labs.schoolapi.model.User;
import br.com.labs.schoolapi.utils.JWTUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JWTUtils jwtUtils;

    @Operation(summary = "Obter o token de autencicaçao", description = "azeazeaz")
    @ApiResponse(responseCode = "200", description = "sucesso")
    @PostMapping("login")
    public ResponseEntity<JWTResponseDTO> login(@RequestBody LoginDTO loginDTO) {

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getEmail(), loginDTO.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtUtils.generateJwtToken(authentication);

        User userDetails = (User) authentication.getPrincipal();

        return ResponseEntity.ok(new JWTResponseDTO(jwt));
    }
}
