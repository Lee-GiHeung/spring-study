package config;

import model.member.Member;
import model.member.MemberDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.format.DateTimeFormatter;

@Configuration // 설정 파일임을 알려주는 어노테이션
public class AppCtx3 {
    @Bean
    //@Primary
    @Qualifier("memberDao")
    public MemberDao memberDao() {
        return new MemberDao();
    }

    /*
    @Bean
    public MemberDao memberDao2() {
        return new MemberDao();
    }
    */
    //@Bean
    public DateTimeFormatter formatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");

        return formatter;
    }
}
