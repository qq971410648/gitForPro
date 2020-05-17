package com.lihao.controller;

import com.lihao.entity.TRole;
import com.lihao.service.TRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TRole)表控制层
 *
 * @author makejava
 * @since 2020-05-17 14:47:16
 */
@RestController
@RequestMapping("tRole")
public class TRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TRoleService tRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TRole selectOne(Integer id) {
        return this.tRoleService.queryById(id);
    }

}