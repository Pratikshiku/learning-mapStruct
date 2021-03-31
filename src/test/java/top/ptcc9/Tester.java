package top.ptcc9;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import org.junit.jupiter.api.Test;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;
import top.ptcc9.entity.Do.Address;
import top.ptcc9.entity.Do.User;
import top.ptcc9.entity.Vo.UserVo;
import top.ptcc9.mapstruct.User2Mapper;

import javax.annotation.Resource;

/**
 * @Author HE LONG CAN
 * @Description TODO
 * @Date 2021-03-31 18:47:23
 */
@SpringBootTest
public class Tester {

    private static final User user = new User(
            1,
            2,
            "123456",
            "HE LONG CAN",
            "13800000000",
            DateUtil.parse("1996-02-14 23:59:59","yyyy-MM-dd HH:mm:ss"),
            DateTime.now()
    );

    private static final Address address = new Address(
            2,
            "M78星云24号星区"
    );

    @Test
    void test01() {
        User2Mapper mapper = Mappers.getMapper(User2Mapper.class);
        UserVo userVo = mapper.user2Vo(user);
        System.out.println("userVo = " + userVo);
    }

    @Test
    void test02() {
        User2Mapper mapper = Mappers.getMapper(User2Mapper.class);
        UserVo userVo = mapper.userAddress2Vo(user, address);
        System.out.println("userVo = " + userVo);
    }

    @Test
    void test03() {
        UserVo userVo = User2Mapper.INSTANCE.userAddress2Vo(user, address);
        System.out.println("userVo = " + userVo);
    }


    @Test
    void test04() {
    }
}
