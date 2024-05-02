package com.memoboard.boardserver.service;


import com.memoboard.boardserver.dto.UserDTO;

public interface UserService {

    void register(UserDTO userProfile);

    UserDTO login(String id, String password);

    boolean isDuplicatedId(String id);

    UserDTO getUserInfo(String userid);

    void updatePassword(String id, String beforePassword, String afterPassword);

    void deleteId(String id, String password);
}
