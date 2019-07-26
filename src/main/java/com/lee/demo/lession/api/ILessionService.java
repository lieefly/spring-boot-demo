package com.lee.demo.lession.api;

import com.lee.demo.lession.api.VO.PersonVO;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pi on 2019/4/17.
 * 暴露的对外接口
 * 相当于controller
 * 是外部访问的入口
 */
@RestController
public interface ILessionService {

    //    查看课堂人员
    PersonVO getAllPerson();

    //    增加人员
    void addPerson(PersonVO person);

    //修改人员信息
    void updatePerson(PersonVO person);

    /// 删除人员信息
    void deletePerson(PersonVO person);
}
