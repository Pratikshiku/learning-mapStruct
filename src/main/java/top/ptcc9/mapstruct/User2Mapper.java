package top.ptcc9.mapstruct;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import top.ptcc9.entity.Do.Address;
import top.ptcc9.entity.Do.User;
import top.ptcc9.entity.Vo.UserVo;
import top.ptcc9.mapstruct.rules.DateRule;

import java.util.Date;

/**
 * @Author HE LONG CAN
 * @Description TODO
 * @Date 2021-03-31 18:41:59
 */
@Mapper(uses = DateRule.class)
public interface User2Mapper {
    User2Mapper INSTANCE = Mappers.getMapper(User2Mapper.class);

    @Mapping(source = "name",target = "username")
    UserVo user2Vo(User user);

    @Mapping(source = "user.name",target = "username")
    @Mapping(source = "address.fullAddress",target = "address")
    @Mapping(source = "user.id",target = "id")
    @Mapping(source = "user.birthday",target = "age",qualifiedByName = "calculateAge")
    UserVo userAddress2Vo(User user, Address address);

    @Named("calculateAge")
    default Integer calculateAge(Date birthday) {
        return birthday != null ?
                (int) DateTime.of(birthday).between(DateTime.now(), DateUnit.DAY) / 365 :
                0;
    }


}
