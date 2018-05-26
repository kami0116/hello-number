package hello.number.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userName;
    private String nickName;
    private String password;
    private String email;
    private Gender gender;
}
