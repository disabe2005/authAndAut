package com.disabe.authAndAut.controllers.interfacesApi;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.disabe.authAndAut.entities.SatooUsers;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "users", description = "the user API")
@RequestMapping("/api/v1/users")
public interface UsersApi {

	@GetMapping("/{id}")
    public SatooUsers findById(@PathVariable long id) throws Exception;

    @GetMapping("/")
    public Collection<SatooUsers> findUsers() throws Exception;

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public SatooUsers updateUser( @PathVariable("id") final Long id, @RequestBody final SatooUsers user ) throws Exception;

	
}
