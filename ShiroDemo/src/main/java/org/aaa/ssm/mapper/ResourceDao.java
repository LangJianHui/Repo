package org.aaa.ssm.mapper;

import java.util.List;

import org.aaa.ssm.model.Resource;

public interface ResourceDao {

    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();

}