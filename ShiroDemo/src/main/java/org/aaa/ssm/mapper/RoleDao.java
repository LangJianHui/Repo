package org.aaa.ssm.mapper;

import java.util.List;

import org.aaa.ssm.model.Role;

public interface RoleDao {

    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();
}