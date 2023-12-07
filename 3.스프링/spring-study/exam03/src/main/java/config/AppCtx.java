package config;

import model.member.JoinService;
import model.member.JoinValidator;
import model.member.ListService;
import model.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean // Spring이 관리하는 객체임을 알려주는 어노테이션
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator(memberDao());
    }

    @Bean
    public JoinService joinService() {
        return new JoinService(memberDao(), joinValidator());
    }

    @Bean
    public ListService listService() {
        ListService listService = new ListService();
        listService.setMemberDao(memberDao());

        return listService;
    }

}
