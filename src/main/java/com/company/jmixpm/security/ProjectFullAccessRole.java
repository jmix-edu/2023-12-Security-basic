package com.company.jmixpm.security;

import com.company.jmixpm.entity.Project;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(name = "ProjectFullAccessRole", code = ProjectFullAccessRole.CODE, scope = "UI")
public interface ProjectFullAccessRole {
    String CODE = "project-full-access-role";

    @MenuPolicy(menuIds = "Project.browse")
    @ScreenPolicy(screenIds = {"Project.browse", "Project.edit"})
    void screens();

    @EntityAttributePolicy(entityClass = Project.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Project.class, actions = EntityPolicyAction.ALL)
    void project();
}