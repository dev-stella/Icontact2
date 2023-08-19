package com.app.icontact.DAO;

import com.app.icontact.domain.UserVO;
import com.app.icontact.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

//    회원가입
    public void save(UserVO userVO){
    userMapper.insert(userVO);
}

//    로그인
    public String findIdByUserEmailAndUserPassword(UserVO userVO){ return userMapper.selectId(userVO); };

//    이메일 중복검사
    public String findUserEmailByUserEmail(String userEmail){
        return userMapper.selectForEmailCheck(userEmail);
    }

}