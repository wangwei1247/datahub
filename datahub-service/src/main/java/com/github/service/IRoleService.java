package com.github.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.entity.Role;
import com.github.model.RoleModel;

import java.util.Map;

/**
 * @author 谢森
 * @date 2020/4/25 16:47
 */
public interface IRoleService extends IService<Role> {
    /**
     * 新增角色以及角色权限信息
     * @param roleModel 角色以及角色权限信息
     * @return 新增结果 true/false
     */
    boolean addRoleAndPermission(RoleModel roleModel)throws Exception;

    /**
     * 更新色以及角色权限信息
     * @param roleModel
     * @return
     * @throws Exception
     */
    boolean updateRoleInfo(RoleModel roleModel)throws Exception;

    /**
     * 通过角色编号获取菜单列表
     * @param roleCode
     * @return
     */
    Map<String,Object> getMenuByRoleCode(String roleCode);

    /**
     * 判断当前是否是超级管理员,如果是,不能修改信息 抛出异常
     * @param userNo
     * @throws Exception
     */
    void getRoleIsAdminByUserNo(String userNo) throws Exception;

    Map<String, Object> selectByRoleCode(String roleCode)throws Exception;

    void deleteByRoleCode(String roleCode)throws Exception;
}
