package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Member;
import vkhanhqui.myblog.models.repositories.MemberRepositories;

import java.util.Optional;

@Service
@Transactional
public class MemberServices {
    @Autowired
    MemberRepositories memberRepositories;

    public Optional<Member> getOptionalMember(String username, String password){
        return memberRepositories.findByUsernameAndPassword(username,password);
    }

    public boolean isEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    public void createMember(String username, String email, String password){
    	Member member = new Member();
        member.setRole("member");
        member.setUsername(username);
        member.setEmail(email);
        member.setPassword(password);
        memberRepositories.save(member);
    }
}
