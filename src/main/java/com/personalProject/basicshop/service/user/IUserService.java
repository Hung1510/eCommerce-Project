package com.personalProject.basicshop.service.user;

import com.personalProject.basicshop.dto.UserDto;
import com.personalProject.basicshop.model.User;
import com.personalProject.basicshop.request.CreateUserRequest;
import com.personalProject.basicshop.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
