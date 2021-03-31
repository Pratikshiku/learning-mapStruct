package top.ptcc9.mapstruct.rules;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @Author HE LONG CAN
 * @Description TODO
 * @Date 2021-03-31 20:44:50
 */
public class DateRule {
    public String asString(Date date) {
        return date != null ? DateUtil.format(date,"yyyy-MM-dd HH:mm:ss") : null;
    }
}
